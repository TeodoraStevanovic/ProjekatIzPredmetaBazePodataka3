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
public class Partner {
    int sifraPartnera;
    String nazivPartnera;
    Adresa adresa;

    public Partner() {
    }

    public Partner(int sifraPartnera, String nazivPartnera, Adresa adresa) {
        this.sifraPartnera = sifraPartnera;
        this.nazivPartnera = nazivPartnera;
        this.adresa = adresa;
    }

    public int getSifraPartnera() {
        return sifraPartnera;
    }

    public void setSifraPartnera(int sifraPartnera) {
        this.sifraPartnera = sifraPartnera;
    }

    public String getNazivPartnera() {
        return nazivPartnera;
    }

    public void setNazivPartnera(String nazivPartnera) {
        this.nazivPartnera = nazivPartnera;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Partner{" + "sifraPartnera=" + sifraPartnera + ", nazivPartnera=" + nazivPartnera + ", adresa=" + adresa.getNazivMesta() +adresa.getUlica();
    }
    
    
}
