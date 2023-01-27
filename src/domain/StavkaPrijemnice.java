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
public class StavkaPrijemnice {
    Prijemnica brojPrijemnice;
    int rbStavkePrijemnice;
    double jedinicnaCena;
    int kolicina;
    int stopaRUC;
    int stopaMARZE;
    int akciza;
    Roba roba;

    public StavkaPrijemnice() {
    }

    public StavkaPrijemnice(Prijemnica brojPrijemnice, int rbStavkePrijemnice, double jedinicnaCena, int kolicina, int stopaRUC, int stopaMARZE, int akciza, Roba roba) {
        this.brojPrijemnice = brojPrijemnice;
        this.rbStavkePrijemnice = rbStavkePrijemnice;
        this.jedinicnaCena = jedinicnaCena;
        this.kolicina = kolicina;
        this.stopaRUC = stopaRUC;
        this.stopaMARZE = stopaMARZE;
        this.akciza = akciza;
        this.roba = roba;
    }

    public Prijemnica getBrojPrijemnice() {
        return brojPrijemnice;
    }

    public void setBrojPrijemnice(Prijemnica brojPrijemnice) {
        this.brojPrijemnice = brojPrijemnice;
    }

    public int getRbStavkePrijemnice() {
        return rbStavkePrijemnice;
    }

    public void setRbStavkePrijemnice(int rbStavkePrijemnice) {
        this.rbStavkePrijemnice = rbStavkePrijemnice;
    }

    public double getJedinicnaCena() {
        return jedinicnaCena;
    }

    public void setJedinicnaCena(double jedinicnaCena) {
        this.jedinicnaCena = jedinicnaCena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public int getStopaRUC() {
        return stopaRUC;
    }

    public void setStopaRUC(int stopaRUC) {
        this.stopaRUC = stopaRUC;
    }

    public int getStopaMARZE() {
        return stopaMARZE;
    }

    public void setStopaMARZE(int stopaMARZE) {
        this.stopaMARZE = stopaMARZE;
    }

    public int getAkciza() {
        return akciza;
    }

    public void setAkciza(int akciza) {
        this.akciza = akciza;
    }

    public Roba getRoba() {
        return roba;
    }

    public void setRoba(Roba roba) {
        this.roba = roba;
    }

    @Override
    public String toString() {
        return "StavkaPrijemnice{" + "brojPrijemnice=" + brojPrijemnice + ", rbStavkePrijemnice=" + rbStavkePrijemnice + ", jedinicnaCena=" + jedinicnaCena + ", kolicina=" + kolicina + ", stopaRUC=" + stopaRUC + ", stopaMARZE=" + stopaMARZE + ", akciza=" + akciza + ", roba=" + roba + '}';
    }
    
           
    
            
}
