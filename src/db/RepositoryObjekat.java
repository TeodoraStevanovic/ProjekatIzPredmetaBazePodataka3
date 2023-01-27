/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Adresa;
import domain.Mesto;
import domain.Objekat;
import domain.Rashod;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class RepositoryObjekat extends DbRepository{
       private Connection connection;

    public RepositoryObjekat() {
    }

    public List<Objekat> getAll() throws SQLException, Exception {
        try {
            List<Objekat> objekti=new ArrayList<>();
            String upit="SELECT m.nazivmesta as mnm, m.postanskibroj as apb,a.nazivmesta as anm,a.broj as abroj,o.sifraobjekta as so,o.nazivobjekta as no,o.postanskibroj as postanskibroj,a.brulice as abrojulice,a.ulica as aulica FROM  Objekat o INNER JOIN adresa a on a.brulice=o.brulice INNER JOIN mesto m on a.postanskibroj=m.postanskibroj";
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
              
                Objekat o =new Objekat();
           
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
                
                objekti.add(o);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista objekata!");
            return objekti;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste objekata!\n"+ex);
            throw ex;
        }
    }}
      
