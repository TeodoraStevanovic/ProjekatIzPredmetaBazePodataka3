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
public class Prevoznik {
    int sifraPrevoznika;
    String nazivPrevoznika;

    public Prevoznik() {
    }

    public Prevoznik(int sifraPrevoznika, String nazivPrevoznika) {
        this.sifraPrevoznika = sifraPrevoznika;
        this.nazivPrevoznika = nazivPrevoznika;
    }

    public int getSifraPrevoznika() {
        return sifraPrevoznika;
    }

    public void setSifraPrevoznika(int sifraPrevoznika) {
        this.sifraPrevoznika = sifraPrevoznika;
    }

    public String getNazivPrevoznika() {
        return nazivPrevoznika;
    }

    public void setNazivPrevoznika(String nazivPrevoznika) {
        this.nazivPrevoznika = nazivPrevoznika;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.sifraPrevoznika;
        hash = 89 * hash + Objects.hashCode(this.nazivPrevoznika);
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
        final Prevoznik other = (Prevoznik) obj;
        if (this.sifraPrevoznika != other.sifraPrevoznika) {
            return false;
        }
        if (!Objects.equals(this.nazivPrevoznika, other.nazivPrevoznika)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Prevoznik{" + "sifraPrevoznika=" + sifraPrevoznika + ", nazivPrevoznika=" + nazivPrevoznika + '}';
    }

    
}
