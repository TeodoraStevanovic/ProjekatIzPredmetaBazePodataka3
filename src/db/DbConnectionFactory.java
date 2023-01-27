/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import konstante.DbConstants;

/**
 *
 * @author Teodora
 */
public class DbConnectionFactory {
    private Connection connection;
    private static DbConnectionFactory instance;
    
    private DbConnectionFactory(){
        
    }
    
    public static DbConnectionFactory getInstance(){
        if(instance==null){
            instance=new DbConnectionFactory();
        }
        return instance;
    }
     
     
    public Connection getConnection() throws Exception{
       
        if (connection == null || connection.isClosed()) {
            try {
               //Properties properties = new Properties();
                //ucitavamo-punimo properties iz nekog fajla
                //properties.load(new FileInputStream("config/dbconfig.properties"));
                //moram da zamenim sa konstantama literale
                //String url = properties.getProperty(DbConstants.DB_PASSWORD);
                //String user = properties.getProperty(DbConstants.DB_USER);
               //String password = properties.getProperty(DbConstants.DB_PASSWORD);
                //connection = DriverManager.getConnection(url, user, password);
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "user2", "user2");
                connection.setAutoCommit(false);
                //distinkt i kdt Connectiontip u Oracle
            java.util.Map map = connection.getTypeMap();
            map.put("USER2.LICNI_PODACI_VOZACA", Class.forName("domain.LicniPodaciVozaca"));
            map.put("USER2.GODINA_PROIZVODNJE", Class.forName("domain.GodinaProizvodnje"));

            connection.setTypeMap(map);
            } catch (SQLException ex) {
                System.out.println("Neuspesno uspostavljanje konekcije!\n" + ex.getMessage());
                throw ex;
            }
        }
        return connection;
    }
    
    
}
