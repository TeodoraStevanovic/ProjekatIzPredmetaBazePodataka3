/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.RepositoryAdresa;
import db.RepositoryJM;
import db.RepositoryKorisnik;
import db.RepositoryKupac;
import db.RepositoryMesto;
import db.RepositoryNalog;
import db.RepositoryObjekat;
import db.RepositoryPrenosnica;
import db.RepositoryPrevoznik;
import db.RepositoryRashod;
import db.RepositoryRoba;
import db.RepositoryStavkaNaloga;
import db.RepositoryVozac;
import db.RepositoryVozilo;
import db.RepositoryZaposleni;
import domain.Adresa;
import domain.JedinicaMere;
import domain.Korisnik;
import domain.Kupac;
import domain.Mesto;
import domain.Nalog;
import domain.Objekat;
import domain.Prenosnica;
import domain.Prevoznik;
import domain.Rashod;
import domain.Roba;
import domain.StavkaNaloga;
import domain.Vozac;
import domain.Vozilo;
import domain.Zaposleni;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Controller {
    private static Controller instance;
    private final RepositoryRoba storageRoba;
        private final RepositoryJM storageJM;
        private final RepositoryAdresa storageAdresa;
        private final RepositoryMesto storageMesto;
        private final RepositoryVozilo storageVozilo;
        private final RepositoryVozac storageVozac;
        private final RepositoryRashod storageRashod;
        private final RepositoryObjekat storageObjekat;
        private final RepositoryKupac storageKupac;
        private final RepositoryNalog storageNalog;
        private final RepositoryStavkaNaloga storageStavkaNaloga;
        private final RepositoryPrenosnica storagePrenosnica;
        private final RepositoryKorisnik storageKorisnik;
        private final RepositoryPrevoznik storagePrevoznik;
        private final RepositoryZaposleni storageZaposleni;
    
     private Controller() {
         this.storageRoba=new RepositoryRoba();
         this.storageJM=new RepositoryJM();
         this.storageAdresa=new RepositoryAdresa();
         this.storageMesto=new RepositoryMesto();
         this.storageVozilo=new RepositoryVozilo();
         this.storageVozac=new RepositoryVozac();
         this.storageRashod=new RepositoryRashod();
         this.storageObjekat=new RepositoryObjekat();
         this.storageKupac=new RepositoryKupac();
         this.storageNalog=new RepositoryNalog();
         this.storageStavkaNaloga=new RepositoryStavkaNaloga();
         this.storagePrenosnica=new RepositoryPrenosnica();
         this.storageKorisnik =new RepositoryKorisnik();
         this.storagePrevoznik=new RepositoryPrevoznik();
         this.storageZaposleni=new RepositoryZaposleni();
                 

    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    ///roba

   public List<Roba> getAllRoba() throws SQLException, Exception {
        return storageRoba.getAll();
    }


    public void deleteRoba(Roba roba) throws Exception {
        storageRoba.delete(roba);
    }

    public List<JedinicaMere> getAllJedinicaMere() throws Exception {
       return storageJM.getAll();
    }

    public void addRoba(Roba roba) throws Exception {
        storageRoba.add(roba);
    }

    public void editRoba(Roba roba) throws Exception {
        storageRoba.edit(roba);
    }

    public void deleteJM(JedinicaMere jm) throws Exception {
         storageJM.delete(jm);
    }
    public void addJm(JedinicaMere jm) throws Exception {
        storageJM.add(jm);
    }

    public void editJM(JedinicaMere jm) throws Exception {
        storageJM.edit(jm);
    }

    public List<Mesto> getAllMesta() throws Exception{
         return storageMesto.getAll();
        
    }

    public void deleteMesto(Mesto mesto) throws Exception{
        storageMesto.delete(mesto);
    }

    public List<Adresa> getAllAdresa()throws Exception {
        return storageAdresa.getAll();
    }

    public void deleteAdresa(Adresa adresa)throws Exception {
        storageAdresa.delete(adresa);
    }
 public void editAdresa(Adresa a) throws Exception {
        storageAdresa.edit(a);
    }
 public void editMesto(Mesto m) throws Exception {
        storageMesto.edit(m);
    }
 public void addAdresa(Adresa a) throws Exception {
        storageAdresa.add(a);
    }
  public void addMesto(Mesto mesto) throws Exception {
        storageMesto.add(mesto);
    }

    public List<Vozilo> getAllVozilo() throws Exception {
        return storageVozilo.getAll();
    }

    public void deleteVozilo(Vozilo vozilo) throws Exception {
        storageVozilo.delete(vozilo);
    }
   
    public void editVozilo(Vozilo v) throws Exception {
        storageVozilo.edit(v);
    }
 public void addVozilo(Vozilo v) throws Exception {
        storageVozilo.add(v);
    }

    public List<Vozac> getAllVozac() throws Exception {
       return storageVozac.getAll();
    }

    public void deleteVozac(Vozac vozac) throws Exception {
        storageVozac.delete(vozac);
    }

    public void addVozac(Vozac v) throws Exception {
        storageVozac.add(v);
    }

    public void editVozac(Vozac v) throws Exception {
       storageVozac.edit(v);
    }

    public List<Rashod> getAllRashod() throws SQLException, Exception {
        return storageRashod.getAll();
    }

    public void deleteRashod(Rashod r) throws Exception {
        storageRashod.delete(r);
    }

    public void editRashod(Rashod r) throws Exception {
        storageRashod.edit(r);
    }

    public void addRashod(Rashod r) throws Exception {
        storageRashod.add(r);
    }

   

    public List<Objekat> getAllObjekti() throws Exception{
       return storageObjekat.getAll();
    }

    public List<Kupac> getAllKupac()throws Exception {
       return storageKupac.getAll();
    }

    public void deleteKupac(Kupac kupac) throws Exception{
        storageKupac.delete( kupac);
    }

    public void addKupac(Kupac k)throws Exception {
       storageKupac.add(k);
    }

    public void editKupac(Kupac k) throws Exception{
        storageKupac.edit( k);
    }
   ///////////////////////////////////////////// 

    public List<Nalog> getAllNalog() throws Exception{
       return storageNalog.getAll();
    }

    public void deleteNalog(Nalog n)throws Exception {
        
        storageNalog.delete(n);
    }
    
     public List<Korisnik> getAllKorisnik() throws Exception {
       return storageKorisnik.getAll();
    }

    public void addNalog(Nalog nalog) throws Exception{
        storageNalog.add(nalog);
    }

    public void editNalog(Nalog nalog) throws Exception{
         storageNalog.edit(nalog);
    }
    
    
    public int  vratiRbStavkeNaloga(String brojNaloga) throws Exception{
      return  storageStavkaNaloga.vratiRbStavkeNaloga(brojNaloga);
    }
    ////

    public List<StavkaNaloga> getAllStavkaNaloga() throws Exception{
        return storageStavkaNaloga.getAll();
    }

    public void deleteStavkuNaloga(StavkaNaloga s) throws Exception{
storageStavkaNaloga.delete(s);
    }
    
 public void addStavkaNaloga(StavkaNaloga sn) throws Exception {
       storageStavkaNaloga.add(sn);
    }

    public void editStavkaNaloga(StavkaNaloga sn)throws Exception {
       storageStavkaNaloga.edit(sn);
    }
     public List<Prevoznik> getAllPrevoznik() throws Exception {
        return storagePrevoznik.getAll();
    }

    public List<Zaposleni> getAllZaposleni() throws Exception{
       return storageZaposleni.getAll();
    }
    /////////////////
    
    public List<Prenosnica> getAllPrenosnica() throws Exception{
        return storagePrenosnica.getAll();
    }

    public void deletePrenosnica(Prenosnica p)throws Exception {
        storagePrenosnica.delete(p);
    }

    public void addPrenosnica(Prenosnica prenosnica)throws Exception {
       storagePrenosnica.add(prenosnica);
       
       
    }

   public void editPrenosnica(Prenosnica prenosnica)throws Exception {
       storagePrenosnica.edit(prenosnica);
       
       
    }
   

   
           
}
