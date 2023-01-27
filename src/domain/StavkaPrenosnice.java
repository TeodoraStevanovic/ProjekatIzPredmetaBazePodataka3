/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;

/**
 *
 * @author Korisnik
 */
public class StavkaPrenosnice {
    Prenosnica prenosnica;
    int rbstavkePrenosnice;
    double prodajnaCena;
    int kolicina;
    Roba roba;

    public StavkaPrenosnice() {
    }

    public StavkaPrenosnice(Prenosnica prenosnica, int rbstavkePrenosnice, double prodajnaCena, int kolicina, Roba roba) {
        this.prenosnica = prenosnica;
        this.rbstavkePrenosnice = rbstavkePrenosnice;
        this.prodajnaCena = prodajnaCena;
        this.kolicina = kolicina;
        this.roba = roba;
    }

    public Prenosnica getPrenosnica() {
        return prenosnica;
    }

    public void setPrenosnica(Prenosnica prenosnica) {
        this.prenosnica = prenosnica;
    }

    public int getRbstavkePrenosnice() {
        return rbstavkePrenosnice;
    }

    public void setRbstavkePrenosnice(int rbstavkePrenosnice) {
        this.rbstavkePrenosnice = rbstavkePrenosnice;
    }

    public double getProdajnaCena() {
        return prodajnaCena;
    }

    public void setProdajnaCena(double prodajnaCena) {
        this.prodajnaCena = prodajnaCena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Roba getRoba() {
        return roba;
    }

    public void setRoba(Roba roba) {
        this.roba = roba;
    }

    @Override
    public String toString() {
        return "StavkaPrenosnice{" + "prenosnica=" + prenosnica + ", rbstavkePrenosnice=" + rbstavkePrenosnice + ", prodajnaCena=" + prodajnaCena + ", kolicina=" + kolicina + ", roba=" + roba + '}';
    }
    
    
    
    
            
}
