/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Prenosnica {
    String brojPrenosnice;
    Date datum;
    String napomena;
    int rokIsporuke;
    String storno;
    Nalog nalog;
    Zaposleni zaposleniPrimio;
    Zaposleni zaposleniPredao;
    Zaposleni zaposleniOdobrio;
    Vozac vozac;
    Vozilo vozilo;
    Prevoznik prevoznik;
    Objekat objekatUlaz;
    Objekat objekatIzlaz;
    Objekat objekatIzdao;
    String  VrstaPrenosnice; // napravi ogranicenje
    //List<StavkaPrenosnice> stavkePrenosnice;

    public Prenosnica(String brojPrenosnice, Date datum, String napomena, int rokIsporuke, String storno, Nalog nalog, Zaposleni zaposleniPrimio, Zaposleni zaposleniPredao, Zaposleni zaposleniOdobrio, Vozac vozac, Vozilo vozilo, Prevoznik prevoznik, Objekat objekatUlaz, Objekat objekatIzlaz, Objekat objekatIzdao, String VrstaPrenosnice) {
        this.brojPrenosnice = brojPrenosnice;
        this.datum = datum;
        this.napomena = napomena;
        this.rokIsporuke = rokIsporuke;
        this.storno = storno;
        this.nalog = nalog;
        this.zaposleniPrimio = zaposleniPrimio;
        this.zaposleniPredao = zaposleniPredao;
        this.zaposleniOdobrio = zaposleniOdobrio;
        this.vozac = vozac;
        this.vozilo = vozilo;
        this.prevoznik = prevoznik;
        this.objekatUlaz = objekatUlaz;
        this.objekatIzlaz = objekatIzlaz;
        this.objekatIzdao = objekatIzdao;
        this.VrstaPrenosnice = VrstaPrenosnice;
    }

    

    public String getBrojPrenosnice() {
        return brojPrenosnice;
    }

    public void setBrojPrenosnice(String brojPrenosnice) {
        this.brojPrenosnice = brojPrenosnice;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public int getRokIsporuke() {
        return rokIsporuke;
    }

    public void setRokIsporuke(int rokIsporuke) {
        this.rokIsporuke = rokIsporuke;
    }

    public String getStorno() {
        return storno;
    }

    public void setStorno(String storno) {
        this.storno = storno;
    }

   

    public Nalog getNalog() {
        return nalog;
    }

    public void setNalog(Nalog nalog) {
        this.nalog = nalog;
    }

    public Zaposleni getZaposleniPrimio() {
        return zaposleniPrimio;
    }

    public void setZaposleniPrimio(Zaposleni zaposleniPrimio) {
        this.zaposleniPrimio = zaposleniPrimio;
    }

    public Zaposleni getZaposleniPredao() {
        return zaposleniPredao;
    }

    public void setZaposleniPredao(Zaposleni zaposleniPredao) {
        this.zaposleniPredao = zaposleniPredao;
    }

    public Zaposleni getZaposleniOdobrio() {
        return zaposleniOdobrio;
    }

    public void setZaposleniOdobrio(Zaposleni zaposleniOdobrio) {
        this.zaposleniOdobrio = zaposleniOdobrio;
    }

    public Vozac getVozac() {
        return vozac;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }

    public Prevoznik getPrevoznik() {
        return prevoznik;
    }

    public void setPrevoznik(Prevoznik prevoznik) {
        this.prevoznik = prevoznik;
    }

    public Objekat getObjekatUlaz() {
        return objekatUlaz;
    }

    public void setObjekatUlaz(Objekat objekatUlaz) {
        this.objekatUlaz = objekatUlaz;
    }

    public Objekat getObjekatIzlaz() {
        return objekatIzlaz;
    }

    public void setObjekatIzlaz(Objekat objekatIzlaz) {
        this.objekatIzlaz = objekatIzlaz;
    }

    public Objekat getObjekatIzdao() {
        return objekatIzdao;
    }

    public void setObjekatIzdao(Objekat objekatIzdao) {
        this.objekatIzdao = objekatIzdao;
    }

    public String getVrstaPrenosnice() {
        return VrstaPrenosnice;
    }

    public void setVrstaPrenosnice(String VrstaPrenosnice) {
        this.VrstaPrenosnice = VrstaPrenosnice;
    }

    @Override
    public String toString() {
        return  "brojPrenosnice=" + brojPrenosnice + ", datum=" + datum + ", napomena=" + napomena + ", rokIsporuke=" + rokIsporuke + ", nalog=" + nalog + ", zaposleniPrimio=" + zaposleniPrimio + ", zaposleniPredao=" + zaposleniPredao + ", zaposleniOdobrio=" + zaposleniOdobrio + ", vozac=" + vozac + ", vozilo=" + vozilo + ", prevoznik=" + prevoznik + ", objekatUlaz=" + objekatUlaz + ", objekatIzlaz=" + objekatIzlaz + ", objekatIzdao=" + objekatIzdao + ", VrstaPrenosnice=" + VrstaPrenosnice ;
    }

   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    public enum VrstaPrenosnice {
    Ulaz("Ulaz"),Izlaz("Izlaz"),ULAZIZLAZ("Ulaz i izlaz");
    
     public final String label;

    private VrstaPrenosnice(String label) {
        this.label = label;
    }
}
    */

    

    public Prenosnica() {
    }
}
