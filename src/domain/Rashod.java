/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Rashod {
    String brojRashoda;
    String napomena;
    Date datum;
    Objekat sifraObjekta;
    List<StavkaRashoda> stavkeRashoda;

    public Rashod() {
    }

    public Rashod(String brojRashoda, String napomena, Date datum, Objekat sifraObjekta, List<StavkaRashoda> stavkeRashoda) {
        this.brojRashoda = brojRashoda;
        this.napomena = napomena;
        this.datum = datum;
        this.sifraObjekta = sifraObjekta;
        this.stavkeRashoda = stavkeRashoda;
    }
    public Rashod(String brojRashoda, String napomena, Date datum, Objekat sifraObjekta) {
        this.brojRashoda = brojRashoda;
        this.napomena = napomena;
        this.datum = datum;
        this.sifraObjekta = sifraObjekta;
           }

    public String getBrojRashoda() {
        return brojRashoda;
    }

    public void setBrojRashoda(String brojRashoda) {
        this.brojRashoda = brojRashoda;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Objekat getSifraObjekta() {
        return sifraObjekta;
    }

    public void setSifraObjekta(Objekat sifraObjekta) {
        this.sifraObjekta = sifraObjekta;
    }

    public List<StavkaRashoda> getStavkeRashoda() {
        return stavkeRashoda;
    }

    public void setStavkeRashoda(List<StavkaRashoda> stavkeRashoda) {
        this.stavkeRashoda = stavkeRashoda;
    }

    @Override
    public String toString() {
        return "brojRashoda=" + brojRashoda + ", napomena=" + napomena + ", datum=" + datum + ", sifraObjekta=" + sifraObjekta ;
    }
    
    
}
