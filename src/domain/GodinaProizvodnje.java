/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

/**
 *
 * @author Korisnik
 */
public class GodinaProizvodnje implements SQLData{
    String sqlType="USER2.GODINA_PROIZVODNJE";
    private int godiste;
    
    public GodinaProizvodnje() {}
    
    public GodinaProizvodnje(int godiste){
    this.godiste=godiste;}

    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }
    

    @Override
    public String getSQLTypeName() throws SQLException {
        return sqlType;
    }

    @Override
    public void readSQL(SQLInput stream, String typeName) throws SQLException {
        sqlType = typeName;
        godiste = stream.readInt();
    }

    @Override
    public void writeSQL(SQLOutput stream) throws SQLException {
         stream.writeInt(godiste);
    }
    
}
