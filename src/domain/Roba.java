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
public class Roba {
    private int SifraRobe;
    private String nazivRobe;
    private Long barKod;
    private JedinicaMere jedinicaMere;//to je za sifraMere
    private String nazivJediniceMere;

    public Roba() {
    }

    public Roba(int SifraRobe, String nazivRobe, Long barKod, JedinicaMere jedinicaMere, String nazivJediniceMere) {
        this.SifraRobe = SifraRobe;
        this.nazivRobe = nazivRobe;
        this.barKod = barKod;
        this.jedinicaMere = jedinicaMere;
        this.nazivJediniceMere = nazivJediniceMere;
    }

    public String getNazivJediniceMere() {
        return nazivJediniceMere;
    }

    public void setNazivJediniceMere(String nazivJediniceMere) {
        this.nazivJediniceMere = nazivJediniceMere;
    }

    public int getSifraRobe() {
        return SifraRobe;
    }

    public void setSifraRobe(int SifraRobe) {
        this.SifraRobe = SifraRobe;
    }

    public String getNazivRobe() {
        return nazivRobe;
    }

    public void setNazivRobe(String nazivRobe) {
        this.nazivRobe = nazivRobe;
    }

    public Long getBarKod() {
        return barKod;
    }

    public void setBarKod(Long barKod) {
        this.barKod = barKod;
    }

    public JedinicaMere getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMere jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.SifraRobe;
        hash = 29 * hash + Objects.hashCode(this.nazivRobe);
        hash = 29 * hash + Objects.hashCode(this.barKod);
        hash = 29 * hash + Objects.hashCode(this.jedinicaMere);
        hash = 29 * hash + Objects.hashCode(this.nazivJediniceMere);
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
        final Roba other = (Roba) obj;
        if (this.SifraRobe != other.SifraRobe) {
            return false;
        }
        if (!Objects.equals(this.nazivRobe, other.nazivRobe)) {
            return false;
        }
        if (!Objects.equals(this.nazivJediniceMere, other.nazivJediniceMere)) {
            return false;
        }
        if (!Objects.equals(this.barKod, other.barKod)) {
            return false;
        }
        if (!Objects.equals(this.jedinicaMere, other.jedinicaMere)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Roba{" + "SifraRobe=" + SifraRobe + ", nazivRobe=" + nazivRobe + ", barKod=" + barKod + ", jedinicaMere=" + jedinicaMere + ", nazivJediniceMere=" + nazivJediniceMere + '}';
    }
    
    
}
