/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.GodinaProizvodnje;
import domain.JedinicaMere;
import domain.Vozilo;
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
public class RepositoryVozilo extends DbRepository{
     private Connection connection;

    public RepositoryVozilo() {
    }

    public void edit(Vozilo v) throws Exception {
         try {
            String sql = "UPDATE vozilo SET marka = ?,model=?,godiste=? WHERE brojsasije = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setString(1, v.getMarka());
        ps.setString(2, v.getModel());
        ps.setObject(3, v.getGodiste());
        ps.setString(4,v.getBrojSasije());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjeno vozilo!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjeno vozilo!");
            rollback();
            throw ex;
        }
        
    }

    public void add(Vozilo v) throws Exception {
        try {
            String upit="INSERT INTO Vozilo (brojsasije,marka,model,godiste) VALUES (?,?,?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
           
            
            statement.setString(1,v.getBrojSasije());
            statement.setString(2,v.getMarka());
            statement.setString(3,v.getModel());
            statement.setObject(4,v.getGodiste());
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje vozila!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje vozila!");
            rollback();
            throw ex;
        }
    }

    public void delete(Vozilo vozilo) throws Exception {
        try {
       String sql = "DELETE FROM Vozilo WHERE brojsasije = " + vozilo.getBrojSasije();
        Statement sqlStatement = connection.createStatement();
        int br = sqlStatement.executeUpdate(sql);
        sqlStatement.close();
            commit();
        } catch (SQLException ex) {
            System.out.println("Neuspesno brisanje vozila!\n"+ex);
            throw ex;
        }
    }

    public List<Vozilo> getAll() throws Exception {
       try {
            List<Vozilo> vozila=new ArrayList<>();
            String upit="SELECT * FROM Vozilo order by marka asc";
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
             
                Vozilo vozilo=new Vozilo();
                vozilo.setBrojSasije(rs.getString("brojsasije"));
                vozilo.setMarka(rs.getString("marka"));
                vozilo.setModel(rs.getString("model"));
                GodinaProizvodnje god = (GodinaProizvodnje) rs.getObject("godiste");
               vozilo.setGodiste(god);
                vozila.add(vozilo);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista vozila!");
            return vozila;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste vozila!\n"+ex);
            throw ex;
        }
    }

   

 
    
}
