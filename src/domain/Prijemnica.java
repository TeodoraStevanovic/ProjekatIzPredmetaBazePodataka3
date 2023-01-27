/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Prijemnica {
    String brojPrijemnice;
    Objekat sifraObjekta;
    Otpremnica otpremnica;
    Partner sifraPartnera;
List<StavkaPrijemnice> stavkePrijemnice;
    public Prijemnica() {
    }

    public Prijemnica(String brojPrijemnice, Objekat sifraObjekta, Otpremnica otpremnica, Partner sifraPartnera) {
        this.brojPrijemnice = brojPrijemnice;
        this.sifraObjekta = sifraObjekta;
        this.otpremnica = otpremnica;
        this.sifraPartnera = sifraPartnera;
    }

    public Prijemnica(String brojPrijemnice, Objekat sifraObjekta, Otpremnica otpremnica, Partner sifraPartnera, List<StavkaPrijemnice> stavkePrijemnice) {
        this.brojPrijemnice = brojPrijemnice;
        this.sifraObjekta = sifraObjekta;
        this.otpremnica = otpremnica;
        this.sifraPartnera = sifraPartnera;
        this.stavkePrijemnice = stavkePrijemnice;
    }

    public String getBrojPrijemnice() {
        return brojPrijemnice;
    }

    public void setBrojPrijemnice(String brojPrijemnice) {
        this.brojPrijemnice = brojPrijemnice;
    }

    public Objekat getSifraObjekta() {
        return sifraObjekta;
    }

    public void setSifraObjekta(Objekat sifraObjekta) {
        this.sifraObjekta = sifraObjekta;
    }

    public Otpremnica getOtpremnica() {
        return otpremnica;
    }

    public void setOtpremnica(Otpremnica otpremnica) {
        this.otpremnica = otpremnica;
    }

    public Partner getSifraPartnera() {
        return sifraPartnera;
    }

    public void setSifraPartnera(Partner sifraPartnera) {
        this.sifraPartnera = sifraPartnera;
    }

    public List<StavkaPrijemnice> getStavkePrijemnice() {
        return stavkePrijemnice;
    }

    public void setStavkePrijemnice(List<StavkaPrijemnice> stavkePrijemnice) {
        this.stavkePrijemnice = stavkePrijemnice;
    }

    @Override
    public String toString() {
        return "Prijemnica{" + "brojPrijemnice=" + brojPrijemnice + ", sifraObjekta=" + sifraObjekta + ", otpremnica=" + otpremnica + ", sifraPartnera=" + sifraPartnera + ", stavkePrijemnice=" + stavkePrijemnice + '}';
    }
    
    
    
}
