/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Adresa;
import domain.JedinicaMere;
import domain.Mesto;
import domain.Objekat;
import domain.Rashod;
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
public class RepositoryRashod extends DbRepository{
        private Connection connection;

    public RepositoryRashod() {
    }
  //rashod_particije

    public List<Rashod> getAll() throws SQLException, Exception {
         try {
            List<Rashod> Rashod=new ArrayList<>();
            String upit="SELECT m.nazivmesta as mnm, m.postanskibroj as apb,a.nazivmesta as anm,a.broj as abroj, r.brojrashoda as rbr,r.napomena as rn,r.datum as datum,o.sifraobjekta as so,o.nazivobjekta as no,o.postanskibroj as postanskibroj,a.brulice as abrojulice,a.ulica as aulica FROM Rashodrobe_particije r INNER JOIN Objekat o  on r.sifraobjekta=o.sifraobjekta INNER JOIN adresa a on a.brulice=o.brulice INNER JOIN mesto m on a.postanskibroj=m.postanskibroj ";
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
                Rashod r=new Rashod();
                r.setBrojRashoda(rs.getString("rbr"));
                r.setNapomena(rs.getString("rn"));
                r.setDatum(rs.getDate("datum"));
                Objekat o =new Objekat();
                //postanskibroj
                //moramo da povezemo sa adresom
                o.setNazivObjekta(rs.getString("no"));
                o.setSifraObjekta(rs.getInt("so"));
                Adresa a=new Adresa();
                a.setBrojUlice(rs.getInt("abrojulice"));
                a.setUlica(rs.getString("aulica"));
                a.setBroj(rs.getInt("abroj"));
                a.setNazivMesta(rs.getString("anm"));
                Mesto m=new Mesto();
                m.setPostanskiBroj(rs.getInt("apb"));
                m.setNazivMesta(rs.getString("mnm"));
                
                a.setPostanskiBroj(m);
                o.setAdresa(a);
                r.setSifraObjekta(o);
                Rashod.add(r);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista rashoda!");
            return Rashod;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste rashoda!\n"+ex);
            throw ex;
        }
        
    }

    public void delete(Rashod r) throws Exception {
        try {
            String sql = "DELETE FROM Rashodrobe_particije WHERE brojrashoda =?";
            PreparedStatement ps = connection.prepareStatement(sql);
           ps.setString(1, r.getBrojRashoda());
        //Statement sqlStatement = connection.createStatement();
       // int br = sqlStatement.executeUpdate(sql);
        //sqlStatement.close();
        int br = ps.executeUpdate();
        ps.close();
            commit();
            if (br == 0) {
            throw new Exception("Neuspešno brisanje rashoda!");
        }
        } catch (Exception ex) {
            System.out.println("Neuspesno brisanje rashod!\n"+ex);
            throw ex;
        }
    }
    
   

    public void edit(Rashod r) throws Exception {
       try {
            String sql = "UPDATE Rashodrobe_particije SET napomena = ?, datum = ?, sifraobjekta = ? WHERE brojrashoda = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, r.getNapomena());
        ps.setDate(2, r.getDatum());
        ps.setInt(3, r.getSifraObjekta().getSifraObjekta());
        ps.setString(4, r.getBrojRashoda());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjena rashod!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjena rashod!");
            rollback();
            throw ex;
        }
    }

    public void add(Rashod r) throws Exception {
        try {
            String upit="INSERT INTO Rashodrobe_particije (brojrashoda,napomena,datum,sifraobjekta) VALUES (?,?,?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
            
            statement.setString(1, r.getBrojRashoda());
            statement.setString(2, r.getNapomena());
            statement.setDate(3, r.getDatum());
            
      statement.setInt(4,r.getSifraObjekta().getSifraObjekta());
           
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje rashoda!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje rashoda!");
            rollback();
            throw ex;
        }
    }
  

   

   

    

    
}
