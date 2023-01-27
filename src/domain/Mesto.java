/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Korisnik
 */
public class Mesto {
    int postanskiBroj;
    String nazivMesta;
    List<Adresa> listaAdresa;

    public Mesto() {
    }

    public Mesto(int postanskiBroj, String nazivMesta) {
        this.postanskiBroj = postanskiBroj;
        this.nazivMesta = nazivMesta;
    }

    public Mesto(int postanskiBroj, String nazivMesta, List<Adresa> listaAdresa) {
        this.postanskiBroj = postanskiBroj;
        this.nazivMesta = nazivMesta;
        this.listaAdresa = listaAdresa;
    }
 
    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(int postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public void setNazivMesta(String nazivMesta) {
        this.nazivMesta = nazivMesta;
    }

    @Override
    public String toString() {
        return postanskiBroj + ",mesto=" + nazivMesta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.postanskiBroj;
        hash = 19 * hash + Objects.hashCode(this.nazivMesta);
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
        final Mesto other = (Mesto) obj;
        if (this.postanskiBroj != other.postanskiBroj) {
            return false;
        }
        if (!Objects.equals(this.nazivMesta, other.nazivMesta)) {
            return false;
        }
        return true;
    }

    public List<Adresa> getListaAdresa() {
        return listaAdresa;
    }

    public void setListaAdresa(List<Adresa> listaAdresa) {
        this.listaAdresa = listaAdresa;
    }
    
}
