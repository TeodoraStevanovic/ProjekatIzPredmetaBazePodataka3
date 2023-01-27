/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Adresa;
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
public class RepositoryAdresa extends DbRepository{
     private Connection connection;

    public RepositoryAdresa() {
    }
    
public void edit(Adresa a) throws Exception {
        try {
            //slozen primarni kljuc
            String sql = "UPDATE ADRESA SET ulica = ?, broj = ? WHERE POSTANSKIBROJ = ? AND BRULICE=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setString(1, a.getUlica());
        ps.setInt(2, a.getBroj());
       // ps.setString(3, a.getNazivMesta());
        ps.setInt(3, a.getPostanskiBroj().getPostanskiBroj());
        ps.setInt(4, a.getBrojUlice());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjena ulica!");
        } catch (SQLException ex) {
            System.out.println("Nije dozvoljena direktna izmena kolone nazivMesta u okviru tabele adresa");
            rollback();
            throw ex;
        }
    }

    public void add(Adresa a) throws Exception {
        try {
            String upit="INSERT INTO Adresa (brulice,postanskibroj,ulica,broj) VALUES (?,?,?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
            
            statement.setInt(1, a.getBrojUlice());
            statement.setInt(2, a.getPostanskiBroj().getPostanskiBroj());
            statement.setString(3,a.getUlica());
      statement.setInt(4,a.getBroj());
           
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje adresa!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje adresa!");
            rollback();
            throw ex;
        }
    }

    public void delete(Adresa adresa) throws Exception {
         try {
       String sql = "DELETE FROM Adresa WHERE POSTANSKIBROJ ="+adresa.getPostanskiBroj().getPostanskiBroj()+" AND BRULICE="+adresa.getBrojUlice();
             
       Statement sqlStatement = connection.createStatement();
        int br = sqlStatement.executeUpdate(sql);
        sqlStatement.close();
            commit();
        } catch (SQLException ex) {
            System.out.println("Neuspesno brisanje adrese!\n"+ex);
            throw ex;
        }
    }
    
    public List<Adresa> getAll() throws Exception {
        try {
            List<Adresa> adrese=new ArrayList<>();
            String upit="SELECT a.brulice as ab,a.ulica as aulica,a.broj as abroj,a.nazivmesta as anazivmesta,m.nazivmesta as mnazivmesta,m.postanskibroj as mpb FROM Adresa a INNER JOIN mesto m on a.postanskibroj=m.postanskibroj order by a.brulice asc";
           //order by a.postanskibroj asc
            System.out.println(upit);
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
                Adresa a=new Adresa();
                a.setBrojUlice(rs.getInt("ab"));
                a.setUlica(rs.getString("aulica"));
                a.setBroj(rs.getInt("abroj"));
                a.setNazivMesta(rs.getString("anazivmesta"));
                Mesto m=new Mesto();
                m.setPostanskiBroj(rs.getInt("mpb"));
                m.setNazivMesta(rs.getString("mnazivmesta"));
                a.setPostanskiBroj(m);
                adrese.add(a);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista adresa!");
            return adrese;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste adresa!\n"+ex);
            throw ex;
        }
    }

    

    

    
   
}
