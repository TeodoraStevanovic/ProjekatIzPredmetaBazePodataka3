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
public class Kupac {
    String PIB;
    String nazivKupca;
    String MB;
    int broj;
    Adresa adresa;

    public Kupac() {
    }

    public Kupac(String PIB, String nazivKupca, String MB, int broj, Adresa adresa) {
        this.PIB = PIB;
        this.nazivKupca = nazivKupca;
        this.MB = MB;
        this.broj = broj;
        this.adresa = adresa;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public String getNazivKupca() {
        return nazivKupca;
    }

    public void setNazivKupca(String nazivKupca) {
        this.nazivKupca = nazivKupca;
    }

    

    public String getMB() {
        return MB;
    }

    public void setMB(String MB) {
        this.MB = MB;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.PIB);
        hash = 97 * hash + Objects.hashCode(this.nazivKupca);
        hash = 97 * hash + Objects.hashCode(this.MB);
        hash = 97 * hash + this.broj;
        hash = 97 * hash + Objects.hashCode(this.adresa);
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
        final Kupac other = (Kupac) obj;
        if (this.broj != other.broj) {
            return false;
        }
        if (!Objects.equals(this.PIB, other.PIB)) {
            return false;
        }
        if (!Objects.equals(this.nazivKupca, other.nazivKupca)) {
            return false;
        }
        if (!Objects.equals(this.MB, other.MB)) {
            return false;
        }
        if (!Objects.equals(this.adresa, other.adresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kupac{" + "PIB=" + PIB + ", bazivKupca=" + nazivKupca + ", MB=" + MB + ", broj=" + broj + ", adresa=" + adresa.getNazivMesta() + adresa.getUlica();
    }
    
    
}
