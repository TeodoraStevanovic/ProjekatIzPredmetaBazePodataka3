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
public class Vozilo {
    String brojSasije;
    String marka;
    String model;
    GodinaProizvodnje godiste;

    public Vozilo() {
    }

    public Vozilo(String brojSasije, String marka, String model, GodinaProizvodnje godiste) {
        this.brojSasije = brojSasije;
        this.marka = marka;
        this.model = model;
        this.godiste = godiste;
    }

    public String getBrojSasije() {
        return brojSasije;
    }

    public void setBrojSasije(String brojSasije) {
        this.brojSasije = brojSasije;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public GodinaProizvodnje getGodiste() {
        return godiste;
    }

    public void setGodiste(GodinaProizvodnje godiste) {
        this.godiste = godiste;
    }

    @Override
    public String toString() {
        return "broj Sasije:" + brojSasije + ", marka i model:" + marka +" "+ model + ", godiste:" + godiste.getGodiste();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.brojSasije);
        hash = 73 * hash + Objects.hashCode(this.marka);
        hash = 73 * hash + Objects.hashCode(this.model);
        hash = 73 * hash + Objects.hashCode(this.godiste);
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
        final Vozilo other = (Vozilo) obj;
        if (!Objects.equals(this.brojSasije, other.brojSasije)) {
            return false;
        }
        if (!Objects.equals(this.marka, other.marka)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.godiste, other.godiste)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
