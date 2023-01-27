/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.GodinaProizvodnje;
import domain.LicniPodaciVozaca;
import domain.Vozac;
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
public class RepositoryVozac extends DbRepository{
     private Connection connection;

    public RepositoryVozac() {
    }
     
    
    public void edit(Vozac v) throws Exception {
         try {
            String sql = "UPDATE vozac SET licnipodaci = ? WHERE brojlicnekarte = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setObject(1, v.getLicniPodaciVozaca());
        ps.setLong(2,v.getBrojLicneKarte());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjen vozac!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjen vozac!");
            rollback();
            throw ex;
        }
        
    }

    public void add(Vozac v) throws Exception {
        try {
            String upit="INSERT INTO Vozac (brojlicnekarte,licnipodaci) VALUES (?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
           
          
            statement.setLong(1,v.getBrojLicneKarte());
            statement.setObject(2,v.getLicniPodaciVozaca());
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje vozaca!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje vozaca!");
            rollback();
            throw ex;
        }
    }

    public void delete(Vozac vozac) throws Exception {
        try {
       String sql = "DELETE FROM Vozac WHERE brojlicnekarte = " + vozac.getBrojLicneKarte();
        Statement sqlStatement = connection.createStatement();
        int br = sqlStatement.executeUpdate(sql);
        sqlStatement.close();
            commit();
        } catch (SQLException ex) {
            System.out.println("Neuspesno brisanje vozaca!\n"+ex);
            throw ex;
        }
    }

    public List<Vozac> getAll() throws Exception {
       try {
            List<Vozac> vozaci=new ArrayList<>();
            String upit="SELECT * FROM Vozac";
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            while(rs.next()){
             
                Vozac v=new Vozac();
                v.setBrojLicneKarte(rs.getLong("brojlicnekarte"));
                LicniPodaciVozaca lpv = (LicniPodaciVozaca) rs.getObject("licnipodaci");
                v.setLicniPodaciVozaca(lpv);
                vozaci.add(v);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista vozaca!");
            return vozaci;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste vozaca!\n"+ex);
            throw ex;
        }
    }

   
    
}
