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
public class RepositoryRoba extends DbRepository {
    private Connection connection;

    public RepositoryRoba() {
    }
    public List<Roba> getAll() throws Exception {
        try {
            List<Roba> roba=new ArrayList<>();
            String upit="SELECT r.sifrarobe as rsifrarobe,r.nazivrobe as rnazivrobe,r.barkod as rbarkod,r.nazivjm as rnazivjm, jm.siframere as jmsiframere, jm.nazivjm as jmnazivjm FROM Roba r INNER JOIN jedinicamere jm on r.siframere=jm.siframere order by r.sifrarobe asc";
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
                Roba r=new Roba();
                r.setSifraRobe(rs.getInt("rsifrarobe"));
                r.setNazivRobe(rs.getString("rnazivrobe"));
                r.setBarKod(rs.getLong("rbarkod"));
                r.setNazivJediniceMere(rs.getString("rnazivjm"));
                JedinicaMere jm=new JedinicaMere();
                jm.setSifraMere(rs.getInt("jmsiframere"));
                jm.setNazivJediniceMere(rs.getString("jmnazivjm"));
                r.setJedinicaMere(jm);
                roba.add(r);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista robe!");
            return roba;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste robe!\n"+ex);
            throw ex;
        }
    }

    
  

    public void delete(Roba roba) throws Exception{
        try {
       String sql = "DELETE FROM ROBA WHERE sifrarobe = " + roba.getSifraRobe();
        Statement sqlStatement = connection.createStatement();
        int br = sqlStatement.executeUpdate(sql);
        sqlStatement.close();
            commit();
        } catch (SQLException ex) {
            System.out.println("Neuspesno brisanje robe!\n"+ex);
            throw ex;
        }
    }

    public void add(Roba roba) throws SQLException, Exception {
        try {
            String upit="INSERT INTO Roba (sifrarobe,nazivrobe,barkod,siframere) VALUES (?,?,?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
            
            statement.setInt(1, roba.getSifraRobe());
            statement.setString(2, roba.getNazivRobe());
            statement.setLong(3, roba.getBarKod());
      statement.setInt(4,roba.getJedinicaMere().getSifraMere());
           
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje robe!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje robe!");
            rollback();
            throw ex;
        }
    }

    public void edit(Roba roba) throws Exception {
        try {
            String sql = "UPDATE roba SET nazivrobe = ?, barkod = ?, siframere = ? WHERE sifrarobe = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, roba.getNazivRobe());
        ps.setLong(2, roba.getBarKod());
        ps.setInt(3, roba.getJedinicaMere().getSifraMere());
        ps.setInt(4, roba.getSifraRobe());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjena robe!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjena robe!");
            rollback();
            throw ex;
        }
        }
    }
    
     

