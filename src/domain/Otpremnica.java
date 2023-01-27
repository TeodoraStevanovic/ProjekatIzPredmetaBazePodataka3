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
public class Otpremnica {
    String brojOtpremnice;
    Date datumIzdavanja;
    Date datumDPO;
    String napomena;
    Objekat Objekatisporuka;
    Objekat ObjekatMaloprodaja;
    Objekat Objekatizdavanja;
    Nalog brojNaloga;
    Zaposleni zaduzenZaposleni;
    Zaposleni primioZaposleni;
    Zaposleni izdaoZaposleni;
    Kupac pibKupac;
    List<StavkaOtpremnice> stavkeOtpremnice;

    public Otpremnica(String brojOtpremnice, Date datumIzdavanja, Date datumDPO, String napomena, Objekat Objekatisporuka, Objekat ObjekatMaloprodaja, Objekat Objekatizdavanja, Nalog brojNaloga, Zaposleni zaduzenZaposleni, Zaposleni primioZaposleni, Zaposleni izdaoZaposleni, Kupac pibKupac) {
        this.brojOtpremnice = brojOtpremnice;
        this.datumIzdavanja = datumIzdavanja;
        this.datumDPO = datumDPO;
        this.napomena = napomena;
        this.Objekatisporuka = Objekatisporuka;
        this.ObjekatMaloprodaja = ObjekatMaloprodaja;
        this.Objekatizdavanja = Objekatizdavanja;
        this.brojNaloga = brojNaloga;
        this.zaduzenZaposleni = zaduzenZaposleni;
        this.primioZaposleni = primioZaposleni;
        this.izdaoZaposleni = izdaoZaposleni;
        this.pibKupac = pibKupac;
    }

    public Otpremnica() {
    }

    public Otpremnica(String brojOtpremnice, Date datumIzdavanja, Date datumDPO, String napomena, Objekat Objekatisporuka, Objekat ObjekatMaloprodaja, Objekat Objekatizdavanja, Nalog brojNaloga, Zaposleni zaduzenZaposleni, Zaposleni primioZaposleni, Zaposleni izdaoZaposleni, Kupac pibKupac, List<StavkaOtpremnice> stavkeOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
        this.datumIzdavanja = datumIzdavanja;
        this.datumDPO = datumDPO;
        this.napomena = napomena;
        this.Objekatisporuka = Objekatisporuka;
        this.ObjekatMaloprodaja = ObjekatMaloprodaja;
        this.Objekatizdavanja = Objekatizdavanja;
        this.brojNaloga = brojNaloga;
        this.zaduzenZaposleni = zaduzenZaposleni;
        this.primioZaposleni = primioZaposleni;
        this.izdaoZaposleni = izdaoZaposleni;
        this.pibKupac = pibKupac;
        this.stavkeOtpremnice = stavkeOtpremnice;
    }

    public String getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(String brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public Date getDatumDPO() {
        return datumDPO;
    }

    public void setDatumDPO(Date datumDPO) {
        this.datumDPO = datumDPO;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Objekat getObjekatisporuka() {
        return Objekatisporuka;
    }

    public void setObjekatisporuka(Objekat Objekatisporuka) {
        this.Objekatisporuka = Objekatisporuka;
    }

    public Objekat getObjekatMaloprodaja() {
        return ObjekatMaloprodaja;
    }

    public void setObjekatMaloprodaja(Objekat ObjekatMaloprodaja) {
        this.ObjekatMaloprodaja = ObjekatMaloprodaja;
    }

    public Objekat getObjekatizdavanja() {
        return Objekatizdavanja;
    }

    public void setObjekatizdavanja(Objekat Objekatizdavanja) {
        this.Objekatizdavanja = Objekatizdavanja;
    }

    public Nalog getBrojNaloga() {
        return brojNaloga;
    }

    public void setBrojNaloga(Nalog brojNaloga) {
        this.brojNaloga = brojNaloga;
    }

    public Zaposleni getZaduzenZaposleni() {
        return zaduzenZaposleni;
    }

    public void setZaduzenZaposleni(Zaposleni zaduzenZaposleni) {
        this.zaduzenZaposleni = zaduzenZaposleni;
    }

    public Zaposleni getPrimioZaposleni() {
        return primioZaposleni;
    }

    public void setPrimioZaposleni(Zaposleni primioZaposleni) {
        this.primioZaposleni = primioZaposleni;
    }

    public Zaposleni getIzdaoZaposleni() {
        return izdaoZaposleni;
    }

    public void setIzdaoZaposleni(Zaposleni izdaoZaposleni) {
        this.izdaoZaposleni = izdaoZaposleni;
    }

    public Kupac getPibKupac() {
        return pibKupac;
    }

    public void setPibKupac(Kupac pibKupac) {
        this.pibKupac = pibKupac;
    }

    public List<StavkaOtpremnice> getStavkeOtpremnice() {
        return stavkeOtpremnice;
    }

    public void setStavkeOtpremnice(List<StavkaOtpremnice> stavkeOtpremnice) {
        this.stavkeOtpremnice = stavkeOtpremnice;
    }

    @Override
    public String toString() {
        return "Otpremnica{" + "brojOtpremnice=" + brojOtpremnice + ", datumIzdavanja=" + datumIzdavanja + ", datumDPO=" + datumDPO + ", napomena=" + napomena + ", Objekatisporuka=" + Objekatisporuka + ", ObjekatMaloprodaja=" + ObjekatMaloprodaja + ", Objekatizdavanja=" + Objekatizdavanja + ", brojNaloga=" + brojNaloga + ", zaduzenZaposleni=" + zaduzenZaposleni + ", primioZaposleni=" + primioZaposleni + ", izdaoZaposleni=" + izdaoZaposleni + ", pibKupac=" + pibKupac + ", stavkeOtpremnice=" + stavkeOtpremnice + '}';
    }

   
    
    
    
}
