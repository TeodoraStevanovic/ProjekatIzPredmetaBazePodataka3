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
public class LicniPodaciVozaca implements SQLData{
    private String sqlType = "USER2.LICNI_PODACI_VOZACA";
    private String imeVozaca;
    private String PrezimeVozaca;

    public LicniPodaciVozaca() {
    }

    public LicniPodaciVozaca(String imeVozaca, String PrezimeVozaca) {
        this.imeVozaca = imeVozaca;
        this.PrezimeVozaca = PrezimeVozaca;
    }
    

    @Override
    public String getSQLTypeName() throws SQLException {
        return sqlType;
    }

    @Override
    public void readSQL(SQLInput stream, String typeName) throws SQLException {
         sqlType = typeName;
         imeVozaca = stream.readString();
        PrezimeVozaca = stream.readString();
    }

    @Override
    public void writeSQL(SQLOutput stream) throws SQLException {
        stream.writeString(imeVozaca);
        stream.writeString(PrezimeVozaca);
    }

    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public String getImeVozaca() {
        return imeVozaca;
    }

    public void setImeVozaca(String imeVozaca) {
        this.imeVozaca = imeVozaca;
    }

    public String getPrezimeVozaca() {
        return PrezimeVozaca;
    }

    public void setPrezimeVozaca(String PrezimeVozaca) {
        this.PrezimeVozaca = PrezimeVozaca;
    }
    
}
