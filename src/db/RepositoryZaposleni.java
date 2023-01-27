/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Prevoznik;
import domain.Zaposleni;
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
public class RepositoryZaposleni extends DbRepository{
private Connection connection;
    public RepositoryZaposleni() {
    }
    
    
    public List<Zaposleni> getAll() throws SQLException, Exception {
        try {
            List<Zaposleni> ZAPOSLENI=new ArrayList<>();
            String upit="SELECT * FROM  Zaposleni";
            
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
              
                Zaposleni p=new Zaposleni();
              
                p.setJmbg(rs.getString("jmbg"));
           p.setImeZaposlenog(rs.getString("imezaposlenog"));
            p.setPrezimeZaposlenog(rs.getString("prezimezaposlenog"));
                ZAPOSLENI.add(p);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista zaposlenih!");
            return ZAPOSLENI;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste zaposlenih!\n"+ex);
            throw ex;
        }
    }
  
}
