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
public class Vozac {
    Long brojLicneKarte;
    LicniPodaciVozaca licniPodaciVozaca;

    public Vozac() {
    }

    public Vozac(Long brojLicneKarte, LicniPodaciVozaca licniPodaciVozaca) {
        this.brojLicneKarte = brojLicneKarte;
        this.licniPodaciVozaca = licniPodaciVozaca;
        
    }

    public Long getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(Long brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public LicniPodaciVozaca getLicniPodaciVozaca() {
        return licniPodaciVozaca;
    }

    public void setLicniPodaciVozaca(LicniPodaciVozaca licniPodaciVozaca) {
        this.licniPodaciVozaca = licniPodaciVozaca;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.brojLicneKarte);
        hash = 83 * hash + Objects.hashCode(this.licniPodaciVozaca);
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
        final Vozac other = (Vozac) obj;
        if (!Objects.equals(this.brojLicneKarte, other.brojLicneKarte)) {
            return false;
        }
        if (!Objects.equals(this.licniPodaciVozaca, other.licniPodaciVozaca)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br lk. :" + brojLicneKarte + ", ime i prezime:" + licniPodaciVozaca.getImeVozaca() +" "+ licniPodaciVozaca.getPrezimeVozaca();
    }
    
    
    
}
