/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Korisnik
 */
public class StavkaOtpremnice {
    Otpremnica otpremnica;
    int redniBrojStavkeOtpremnice;
    int orb;
    int porez;
    int kolicina;
    double jedinicnaCena;
    Roba sifraRobe;

    public StavkaOtpremnice(Otpremnica otpremnica, int redniBrojStavkeOtpremnice, int orb, int porez, int kolicina, double jedinicnaCena, Roba sifraRobe) {
        this.otpremnica = otpremnica;
        this.redniBrojStavkeOtpremnice = redniBrojStavkeOtpremnice;
        this.orb = orb;
        this.porez = porez;
        this.kolicina = kolicina;
        this.jedinicnaCena = jedinicnaCena;
        this.sifraRobe = sifraRobe;
    }

    public StavkaOtpremnice() {
    }

    public Otpremnica getOtpremnica() {
        return otpremnica;
    }

    public void setOtpremnica(Otpremnica otpremnica) {
        this.otpremnica = otpremnica;
    }

    public int getRedniBrojStavkeOtpremnice() {
        return redniBrojStavkeOtpremnice;
    }

    public void setRedniBrojStavkeOtpremnice(int redniBrojStavkeOtpremnice) {
        this.redniBrojStavkeOtpremnice = redniBrojStavkeOtpremnice;
    }

    public int getOrb() {
        return orb;
    }

    public void setOrb(int orb) {
        this.orb = orb;
    }

    public int getPorez() {
        return porez;
    }

    public void setPorez(int porez) {
        this.porez = porez;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public double getJedinicnaCena() {
        return jedinicnaCena;
    }

    public void setJedinicnaCena(double jedinicnaCena) {
        this.jedinicnaCena = jedinicnaCena;
    }

    public Roba getSifraRobe() {
        return sifraRobe;
    }

    public void setSifraRobe(Roba sifraRobe) {
        this.sifraRobe = sifraRobe;
    }

    @Override
    public String toString() {
        return "StavkaOtpremnice{" + "otpremnica=" + otpremnica + ", redniBrojStavkeOtpremnice=" + redniBrojStavkeOtpremnice + ", orb=" + orb + ", porez=" + porez + ", kolicina=" + kolicina + ", jedinicnaCena=" + jedinicnaCena + ", sifraRobe=" + sifraRobe + '}';
    }
    
    
    
           
}
