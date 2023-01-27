/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Prevoznik;
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
public class RepositoryPrevoznik extends DbRepository{
  private Connection connection;

    public RepositoryPrevoznik() {
    }
    
    
    public List<Prevoznik> getAll() throws SQLException, Exception {
        try {
            List<Prevoznik> pr=new ArrayList<>();
            String upit="SELECT * FROM  Prevoznik";
            
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
              
                Prevoznik p=new Prevoznik();
                p.setSifraPrevoznika(rs.getInt("sifraprevoznika"));
                p.setNazivPrevoznika(rs.getString("nazivprevoznika"));
           
            
                pr.add(p);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista prevoznika!");
            return pr;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste prevoznika!\n"+ex);
            throw ex;
        }
    }
  
}
