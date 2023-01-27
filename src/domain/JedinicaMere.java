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
public class JedinicaMere {
    int sifraMere;
    String nazivJediniceMere;

    public int getSifraMere() {
        return sifraMere;
    }

    public void setSifraMere(int sifraMere) {
        this.sifraMere = sifraMere;
    }

    public String getNazivJediniceMere() {
        return nazivJediniceMere;
    }

    public void setNazivJediniceMere(String nazivJediniceMere) {
        this.nazivJediniceMere = nazivJediniceMere;
    }

    public JedinicaMere() {
    }

    public JedinicaMere(int sifraMere, String nazivJediniceMere) {
        this.sifraMere = sifraMere;
        this.nazivJediniceMere = nazivJediniceMere;
    }

    @Override
    public String toString() {
        return "sifra:" + sifraMere + ", " + nazivJediniceMere;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.sifraMere;
        hash = 53 * hash + Objects.hashCode(this.nazivJediniceMere);
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
        final JedinicaMere other = (JedinicaMere) obj;
        if (this.sifraMere != other.sifraMere) {
            return false;
        }
        if (!Objects.equals(this.nazivJediniceMere, other.nazivJediniceMere)) {
            return false;
        }
        return true;
    }
    
    
}
