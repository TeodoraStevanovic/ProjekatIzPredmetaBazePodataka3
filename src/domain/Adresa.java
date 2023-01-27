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
public class Adresa {
    int brojUlice;
    Mesto postanskiBroj;
    String ulica;
    int broj;
    String nazivMesta;

    public Adresa() {
    }

    public Adresa(int brojUlice, Mesto postanskiBroj, String ulica, int broj, String nazivMesta) {
        this.brojUlice = brojUlice;
        this.postanskiBroj = postanskiBroj;
        this.ulica = ulica;
        this.broj = broj;
        this.nazivMesta = nazivMesta;
    }

    

    public int getBrojUlice() {
        return brojUlice;
    }

    public void setBrojUlice(int brojUlice) {
        this.brojUlice = brojUlice;
    }

    public Mesto getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(Mesto postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

   

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public void setNazivMesta(String nazivMesta) {
        this.nazivMesta = nazivMesta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.brojUlice;
        hash = 37 * hash + Objects.hashCode(this.postanskiBroj);
        hash = 37 * hash + Objects.hashCode(this.ulica);
        hash = 37 * hash + this.broj;
        hash = 37 * hash + Objects.hashCode(this.nazivMesta);
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
        final Adresa other = (Adresa) obj;
        if (this.brojUlice != other.brojUlice) {
            return false;
        }
        if (this.broj != other.broj) {
            return false;
        }
        if (!Objects.equals(this.ulica, other.ulica)) {
            return false;
        }
        if (!Objects.equals(this.nazivMesta, other.nazivMesta)) {
            return false;
        }
        if (!Objects.equals(this.postanskiBroj, other.postanskiBroj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return postanskiBroj + " "+ brojUlice+", "+ulica+""+broj;
    }

    
    
}
