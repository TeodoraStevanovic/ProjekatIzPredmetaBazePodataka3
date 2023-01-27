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
public class Korisnik {
    int idKorisnika;
    String imePrezime;

    public Korisnik() {
    }

    public Korisnik(int idKorisnika, String imePrezime) {
        this.idKorisnika = idKorisnika;
        this.imePrezime = imePrezime;
    }

    public int getIdKorisnika() {
        return idKorisnika;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdKorisnika(int idKorisnika) {
        this.idKorisnika = idKorisnika;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    @Override
    public String toString() {
        return  "id=" + idKorisnika + ", ime i prezime=" + imePrezime;
    }


    
}
