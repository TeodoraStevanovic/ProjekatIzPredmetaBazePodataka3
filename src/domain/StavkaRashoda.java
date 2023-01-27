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
public class StavkaRashoda {
    Rashod brojRashoda;
    int redniBrojStavke;
    double prodajnaCena;
    int kolicina;
    double nabavnaCena;
    Roba sifraRobe;  

    public StavkaRashoda() {
    }

    public StavkaRashoda(Rashod brojRashoda, int redniBrojStavke, double prodajnaCena, int kolicina, double nabavnaCena, Roba sifraRobe) {
        this.brojRashoda = brojRashoda;
        this.redniBrojStavke = redniBrojStavke;
        this.prodajnaCena = prodajnaCena;
        this.kolicina = kolicina;
        this.nabavnaCena = nabavnaCena;
        this.sifraRobe = sifraRobe;
    }

    public Rashod getBrojRashoda() {
        return brojRashoda;
    }

    public void setBrojRashoda(Rashod brojRashoda) {
        this.brojRashoda = brojRashoda;
    }

    public int getRedniBrojStavke() {
        return redniBrojStavke;
    }

    public void setRedniBrojStavke(int redniBrojStavke) {
        this.redniBrojStavke = redniBrojStavke;
    }

    public double getProdajnaCena() {
        return prodajnaCena;
    }

    public void setProdajnaCena(double prodajnaCena) {
        this.prodajnaCena = prodajnaCena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public double getNabavnaCena() {
        return nabavnaCena;
    }

    public void setNabavnaCena(double nabavnaCena) {
        this.nabavnaCena = nabavnaCena;
    }

    public Roba getSifraRobe() {
        return sifraRobe;
    }

    public void setSifraRobe(Roba sifraRobe) {
        this.sifraRobe = sifraRobe;
    }

    @Override
    public String toString() {
        return "StavkaRashoda{" + "brojRashoda=" + brojRashoda + ", redniBrojStavke=" + redniBrojStavke + ", prodajnaCena=" + prodajnaCena + ", kolicina=" + kolicina + ", nabavnaCena=" + nabavnaCena + ", sifraRobe=" + sifraRobe + '}';
    }
    
   
}
