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
public class Zaposleni {
    String jmbg;
    String imeZaposlenog;
    String prezimeZaposlenog;

    public Zaposleni() {
    }

    public Zaposleni(String jmbg, String imeZaposlenog, String prezimeZaposlenog) {
        this.jmbg = jmbg;
        this.imeZaposlenog = imeZaposlenog;
        this.prezimeZaposlenog = prezimeZaposlenog;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImeZaposlenog() {
        return imeZaposlenog;
    }

    public void setImeZaposlenog(String imeZaposlenog) {
        this.imeZaposlenog = imeZaposlenog;
    }

    public String getPrezimeZaposlenog() {
        return prezimeZaposlenog;
    }

    public void setPrezimeZaposlenog(String prezimeZaposlenog) {
        this.prezimeZaposlenog = prezimeZaposlenog;
    }

    @Override
    public String toString() {
        return "Zaposleni{" + "jmbg=" + jmbg + ", imeZaposlenog=" + imeZaposlenog + ", prezimeZaposlenog=" + prezimeZaposlenog + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.jmbg);
        hash = 89 * hash + Objects.hashCode(this.imeZaposlenog);
        hash = 89 * hash + Objects.hashCode(this.prezimeZaposlenog);
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
        final Zaposleni other = (Zaposleni) obj;
        if (!Objects.equals(this.jmbg, other.jmbg)) {
            return false;
        }
        if (!Objects.equals(this.imeZaposlenog, other.imeZaposlenog)) {
            return false;
        }
        if (!Objects.equals(this.prezimeZaposlenog, other.prezimeZaposlenog)) {
            return false;
        }
        return true;
    }
    
    
}
