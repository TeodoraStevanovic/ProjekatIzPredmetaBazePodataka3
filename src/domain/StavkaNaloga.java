/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Korisnik
 */
public class StavkaNaloga {
    int redniBrojNaloga;
    Nalog brojNaloga;
    int kolicina;
    int akciza;
    double osnovnaCena;
    int porez;
    Roba roba;

    public StavkaNaloga() {
    }

    public StavkaNaloga(int redniBrojNaloga, Nalog brojNaloga, int kolicina, int akciza, double osnovnaCena, int porez, Roba roba) {
        this.redniBrojNaloga = redniBrojNaloga;
        this.brojNaloga = brojNaloga;
        this.kolicina = kolicina;
        this.akciza = akciza;
        this.osnovnaCena = osnovnaCena;
        this.porez = porez;
        this.roba = roba;
    }

    public int getRedniBrojNaloga() {
        return redniBrojNaloga;
    }

    public void setRedniBrojNaloga(int redniBrojNaloga) {
        this.redniBrojNaloga = redniBrojNaloga;
    }

    public Nalog getBrojNaloga() {
        return brojNaloga;
    }

    public void setBrojNaloga(Nalog brojNaloga) {
        this.brojNaloga = brojNaloga;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public int getAkciza() {
        return akciza;
    }

    public void setAkciza(int akciza) {
        this.akciza = akciza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public int getPorez() {
        return porez;
    }

    public void setPorez(int porez) {
        this.porez = porez;
    }

    public Roba getRoba() {
        return roba;
    }

    public void setRoba(Roba roba) {
        this.roba = roba;
    }

    @Override
    public String toString() {
        return "StavkaNaloga{" + "redniBrojNaloga=" + redniBrojNaloga + ", brojNaloga=" + brojNaloga + ", kolicina=" + kolicina + ", akciza=" + akciza + ", osnovnaCena=" + osnovnaCena + ", porez=" + porez + ", roba=" + roba + '}';
    }
    
    
}
