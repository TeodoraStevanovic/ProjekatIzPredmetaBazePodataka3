/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Objects;

/**
 *
 * @author Korisnik
 */
public class Objekat {
    int sifraObjekta;
    String nazivObjekta;
    Adresa adresa;

    public int getSifraObjekta() {
        return sifraObjekta;
    }

    public void setSifraObjekta(int sifraObjekta) {
        this.sifraObjekta = sifraObjekta;
    }

    public String getNazivObjekta() {
        return nazivObjekta;
    }

    public void setNazivObjekta(String nazivObjekta) {
        this.nazivObjekta = nazivObjekta;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.sifraObjekta;
        hash = 17 * hash + Objects.hashCode(this.nazivObjekta);
        hash = 17 * hash + Objects.hashCode(this.adresa);
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
        final Objekat other = (Objekat) obj;
        if (this.sifraObjekta != other.sifraObjekta) {
            return false;
        }
        if (!Objects.equals(this.nazivObjekta, other.nazivObjekta)) {
            return false;
        }
        if (!Objects.equals(this.adresa, other.adresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sifra:" + sifraObjekta + ", naziv Objekta=" + nazivObjekta + ", adresa=" + adresa.getNazivMesta() + ", "+ adresa.getUlica();
    }

    public Objekat() {
    }

    public Objekat(int sifraObjekta, String nazivObjekta, Adresa adresa) {
        this.sifraObjekta = sifraObjekta;
        this.nazivObjekta = nazivObjekta;
        this.adresa = adresa;
    }
    
    
}
