/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;


import java.sql.SQLException;

/**
 *
 * @author Teodora
 */
public class DbRepository {
    public void connect() throws SQLException, Exception{
        DbConnectionFactory.getInstance().getConnection();
    }
    
    public void disconnect() throws SQLException, Exception{
        DbConnectionFactory.getInstance().getConnection().close();
    }
    
    public void commit() throws SQLException, Exception{
        DbConnectionFactory.getInstance().getConnection().commit();
    }
    
    public void rollback() throws SQLException, Exception{
        DbConnectionFactory.getInstance().getConnection().rollback();
    }
}
