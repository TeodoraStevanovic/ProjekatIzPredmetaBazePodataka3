/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Adresa;
import domain.Korisnik;
import domain.Mesto;
import domain.Objekat;
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
public class RepositoryKorisnik extends DbRepository{
    private Connection connection;

    public RepositoryKorisnik() {
    }
    
    public List<Korisnik> getAll() throws SQLException, Exception {
        try {
            List<Korisnik> korisnici=new ArrayList<>();
            String upit="SELECT * FROM  Korisnik";
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
              
                Korisnik k=new Korisnik();
                k.setIdKorisnika(rs.getInt("idkorisnika"));
                k.setImePrezime(rs.getString("imeprezime"));
           
            
                korisnici.add(k);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista korisnika!");
            return korisnici;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste korisnika!\n"+ex);
            throw ex;
        }
    }
}
