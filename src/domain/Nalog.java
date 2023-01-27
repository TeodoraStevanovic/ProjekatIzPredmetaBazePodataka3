/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Korisnik
 */
public class Nalog {
    String brojNaloga;
    Date datum;
    String napomena;
    Korisnik korisnik;
    Objekat magacin;
    Objekat maloprodaja;
    Vozac vozac;
    Vozilo vozilo;
    private double ukupnaVrednost;
    List<StavkaNaloga> stavkeNaloga;

    public Nalog() {
    }

    public Nalog(String brojNaloga, Date datum, String napomena, Korisnik korisnik, Objekat magacin, Objekat maloprodaja, Vozac vozac, Vozilo vozilo, double ukupnaVrednost) {
        this.brojNaloga = brojNaloga;
        this.datum = datum;
        this.napomena = napomena;
        this.korisnik = korisnik;
        this.magacin = magacin;
        this.maloprodaja = maloprodaja;
        this.vozac = vozac;
        this.vozilo = vozilo;
        this.ukupnaVrednost = ukupnaVrednost;
    }

    public String getBrojNaloga() {
        return brojNaloga;
    }

    public void setBrojNaloga(String brojNaloga) {
        this.brojNaloga = brojNaloga;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Objekat getMagacin() {
        return magacin;
    }

    public void setMagacin(Objekat magacin) {
        this.magacin = magacin;
    }

    public Objekat getMaloprodaja() {
        return maloprodaja;
    }

    public void setMaloprodaja(Objekat maloprodaja) {
        this.maloprodaja = maloprodaja;
    }

    public Vozac getVozac() {
        return vozac;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }

    public double getUkupnaVrednost() {
        return ukupnaVrednost;
    }

    public void setUkupnaVrednost(double ukupnaVrednost) {
        this.ukupnaVrednost = ukupnaVrednost;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nalog other = (Nalog) obj;
        if (!Objects.equals(this.brojNaloga, other.brojNaloga)) {
            return false;
        }
        if (!Objects.equals(this.datum, other.datum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return brojNaloga + ",datum:" + datum + ", korisnik=" + korisnik + ", magacin=" + magacin + ", maloprodaja=" + maloprodaja + ", vozac=" + vozac + ", vozilo=" + vozilo + ", ukupnaVrednost=" + ukupnaVrednost ;
    }

    public List<StavkaNaloga> getStavkeNaloga() {
        return stavkeNaloga;
    }

    public void setStavkeNaloga(List<StavkaNaloga> stavkeNaloga) {
        this.stavkeNaloga = stavkeNaloga;
    }

    public Nalog(String brojNaloga, Date datum, String napomena, Korisnik korisnik, Objekat magacin, Objekat maloprodaja, Vozac vozac, Vozilo vozilo, double ukupnaVrednost, List<StavkaNaloga> stavkeNaloga) {
        this.brojNaloga = brojNaloga;
        this.datum = datum;
        this.napomena = napomena;
        this.korisnik = korisnik;
        this.magacin = magacin;
        this.maloprodaja = maloprodaja;
        this.vozac = vozac;
        this.vozilo = vozilo;
        this.ukupnaVrednost = ukupnaVrednost;
        this.stavkeNaloga = stavkeNaloga;
    }
    
    
}
