/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Adresa;
import domain.JedinicaMere;
import domain.Kupac;
import domain.Mesto;
import domain.Objekat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class RepositoryKupac extends DbRepository{
     private Connection connection;

    public RepositoryKupac() {
    }

    public List<Kupac> getAll() throws SQLException, Exception {
        try {
            List<Kupac> kupci=new ArrayList<>();
       
            String upit="SELECT k.broj as kbroj, k.nazivkupca as knk,k.mb as kmb,k.pib as kpib,a.brulice as ab,a.ulica as aulica,a.broj as abroj,a.nazivmesta as anazivmesta,m.nazivmesta as mnazivmesta,m.postanskibroj as mpb FROM kupac_view k Inner join Adresa a on (k.brulice=a.brulice AND k.postanskibroj=a.postanskibroj) INNER JOIN mesto m on a.postanskibroj=m.postanskibroj order by a.brulice asc";
           //order by a.postanskibroj asc
            System.out.println(upit);
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
                Kupac k=new Kupac();
                k.setPIB(rs.getString("kpib"));
                k.setMB(rs.getString("kmb"));
                k.setNazivKupca(rs.getString("knk"));
                k.setBroj(rs.getInt("kbroj"));
                Adresa a=new Adresa();
                a.setBrojUlice(rs.getInt("ab"));
                a.setUlica(rs.getString("aulica"));
                a.setBroj(rs.getInt("abroj"));
                a.setNazivMesta(rs.getString("anazivmesta"));
                Mesto m=new Mesto();
                m.setPostanskiBroj(rs.getInt("mpb"));
                m.setNazivMesta(rs.getString("mnazivmesta"));
                a.setPostanskiBroj(m);
                k.setAdresa(a);
                kupci.add(k);
            
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista kupaca!");
            return kupci;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste kupaca!\n"+ex);
            throw ex;
        }
    }

    public void delete(Kupac kupac) throws Exception {
         try {
       String sql = "DELETE FROM kupac_view WHERE pib ="+kupac.getPIB();
             
       Statement sqlStatement = connection.createStatement();
        int br = sqlStatement.executeUpdate(sql);
        sqlStatement.close();
            commit();
        } catch (SQLException ex) {
            System.out.println("Neuspesno brisanje kupca!\n"+ex);
            throw ex;
        }
    }

    public void add(Kupac k) throws Exception {
       try {
            String upit="INSERT INTO kupac_view (pib,nazivkupca,mb,broj,brulice,postanskibroj) VALUES (?,?,?,?,?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
            statement.setString(1,k.getPIB());
            statement.setString(2,k.getNazivKupca());
            statement.setString(3,k.getMB());
            statement.setInt(4, k.getBroj());
            statement.setInt(5,k.getAdresa().getBrojUlice());
            statement.setInt(6,k.getAdresa().getPostanskiBroj().getPostanskiBroj());
            
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje kupca!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje kupca!");
            rollback();
            throw ex;
        }
    
    }

    public void edit(Kupac k) throws Exception {
        try {
            String sql = "UPDATE kupac_view SET nazivkupca = ?, mb = ?,broj=?,brulice=?,postanskibroj=? WHERE pib = ? ";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setString(1, k.getNazivKupca());
        ps.setString(2, k.getMB());
        ps.setInt(3, k.getBroj());
        ps.setInt(4, k.getAdresa().getBrojUlice());
        ps.setInt(5, k.getAdresa().getPostanskiBroj().getPostanskiBroj());
        ps.setString(6, k.getPIB());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjen kupac!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjen kupac!");
            rollback();
            throw ex;
        }
    }


      
    
   
  
    
}
