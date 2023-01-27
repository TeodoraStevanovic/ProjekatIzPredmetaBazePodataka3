/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.JedinicaMere;
import domain.Mesto;
import domain.Roba;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class RepositoryMesto extends DbRepository{
     private Connection connection;

    public RepositoryMesto() {
    }

     public List<Mesto> getAll() throws Exception {
       try {
            List<Mesto> mesto=new ArrayList<>();
            String upit="SELECT * FROM Mesto order by nazivmesta asc";
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
             
                Mesto m=new Mesto();
                m.setPostanskiBroj(rs.getInt("postanskibroj"));
                m.setNazivMesta(rs.getString("nazivmesta"));
               
                mesto.add(m);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista mesta!");
            return mesto;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste mesta!\n"+ex);
            throw ex;
        }
    }

    public void edit(Mesto m) throws Exception {
       try {
            String sql = "UPDATE mesto SET nazivmesta = ? WHERE postanskibroj = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, m.getNazivMesta());
        ps.setInt(2, m.getPostanskiBroj());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjena mesto!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjena mesto!");
            rollback();
            throw ex;
        }
    }

    public void add(Mesto mesto) throws Exception {
        try {
            String upit="INSERT INTO Mesto (postanskibroj,nazivmesta) VALUES (?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
           
            statement.setInt(1,mesto.getPostanskiBroj());
            statement.setString(2, mesto.getNazivMesta());
            
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje mesta!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje mesta!");
            rollback();
            throw ex;
        }
    }

    public void delete(Mesto mesto) throws Exception {
         try {
       String sql = "DELETE FROM Mesto WHERE postanskibroj = " +mesto.getPostanskiBroj();
        Statement sqlStatement = connection.createStatement();
        int br = sqlStatement.executeUpdate(sql);
        sqlStatement.close();
            commit();
        } catch (SQLException ex) {
            System.out.println("Neuspesno brisanje mesta!\n"+ex);
            throw ex;
        }
    }
    

    
   

   
    
}
