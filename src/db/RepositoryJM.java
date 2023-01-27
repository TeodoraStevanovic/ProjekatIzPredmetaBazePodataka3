/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.JedinicaMere;
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
public class RepositoryJM extends DbRepository{
     private Connection connection;

    public RepositoryJM() {
    }

    
    public List<JedinicaMere> getAll() throws Exception {
        try {
            List<JedinicaMere> jedinice=new ArrayList<>();
            String upit="SELECT * FROM JedinicaMere order by siframere asc";
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
             
                JedinicaMere jm=new JedinicaMere();
                jm.setSifraMere(rs.getInt("siframere"));
                jm.setNazivJediniceMere(rs.getString("nazivjm"));
               
                jedinice.add(jm);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista jedinica mere!");
            return jedinice;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste jedinica mera!\n"+ex);
            throw ex;
        }
    }

    public void delete(JedinicaMere jm) throws Exception { try {
       String sql = "DELETE FROM JedinicaMere WHERE siframere = " + jm.getSifraMere();
        Statement sqlStatement = connection.createStatement();
        int br = sqlStatement.executeUpdate(sql);
        sqlStatement.close();
            commit();
        } catch (SQLException ex) {
            System.out.println("Neuspesno brisanje jm!\n"+ex);
            throw ex;
        }
    }

    public void add(JedinicaMere jm) throws Exception {
        try {
            String upit="INSERT INTO JedinicaMere (siframere,nazivjm) VALUES (?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
           
            statement.setInt(1,jm.getSifraMere());
            statement.setString(2, jm.getNazivJediniceMere());
            
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje jm!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje jm!");
            rollback();
            throw ex;
        }
    }

    public void edit(JedinicaMere jm) throws Exception { 
        try {
            String sql = "UPDATE jedinicamere SET nazivjm = ? WHERE siframere = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, jm.getNazivJediniceMere());
        ps.setInt(2, jm.getSifraMere());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjena jm!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjena jm!");
            rollback();
            throw ex;
        }
        
    }
     

}
