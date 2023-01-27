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
public class OrganizacionaJedinica {
    Objekat sifraObjekta;
    int sifraOJ;
    String nazivOJ;

    public OrganizacionaJedinica() {
    }

    public OrganizacionaJedinica(Objekat sifraObjekta, int sifraOJ, String nazivOJ) {
        this.sifraObjekta = sifraObjekta;
        this.sifraOJ = sifraOJ;
        this.nazivOJ = nazivOJ;
    }

    public Objekat getSifraObjekta() {
        return sifraObjekta;
    }

    public void setSifraObjekta(Objekat sifraObjekta) {
        this.sifraObjekta = sifraObjekta;
    }

    public int getSifraOJ() {
        return sifraOJ;
    }

    public void setSifraOJ(int sifraOJ) {
        this.sifraOJ = sifraOJ;
    }

    public String getNazivOJ() {
        return nazivOJ;
    }

    public void setNazivOJ(String nazivOJ) {
        this.nazivOJ = nazivOJ;
    }

    @Override
    public String toString() {
        return "OrganizacionaJedinica{" + "sifraObjekta=" + sifraObjekta.getSifraObjekta() + ", sifraOJ=" + sifraOJ + ", nazivOJ=" + nazivOJ + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.sifraObjekta);
        hash = 97 * hash + this.sifraOJ;
        hash = 97 * hash + Objects.hashCode(this.nazivOJ);
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
        final OrganizacionaJedinica other = (OrganizacionaJedinica) obj;
        if (this.sifraOJ != other.sifraOJ) {
            return false;
        }
        if (!Objects.equals(this.nazivOJ, other.nazivOJ)) {
            return false;
        }
        if (!Objects.equals(this.sifraObjekta, other.sifraObjekta)) {
            return false;
        }
        return true;
    }
    
    
}
