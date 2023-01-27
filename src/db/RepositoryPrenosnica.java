/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Adresa;
import domain.GodinaProizvodnje;
import domain.JedinicaMere;
import domain.Korisnik;
import domain.LicniPodaciVozaca;
import domain.Mesto;
import domain.Nalog;
import domain.Objekat;
import domain.Prenosnica;
import domain.Prevoznik;
import domain.Roba;
import domain.StavkaNaloga;
import domain.Vozac;
import domain.Vozilo;
import domain.Zaposleni;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class RepositoryPrenosnica extends DbRepository{
         private Connection connection;

    public RepositoryPrenosnica() {
    }

    public List<Prenosnica> getAll() throws SQLException, Exception {
         try {
            List<Prenosnica> prenosnica=new ArrayList<>();
            
            String upit="SELECT p.brojprenosnice as pb, p.datum as pdatum, p.napomena as pnapomena, p.rokisporuke as rok, p.storno as storno, p.vrstaprenosnice as vrspren , n.brojnaloga as brojnaloga , n.datum as datum , n.napomena as napomena , n.ukupnavrednost as uv ,k.idkorisnika as kid,k.imeprezime as imeprezime,o1.nazivobjekta as o1n,o1.sifraobjekta as o1s,o2.nazivobjekta as o2n,o2.sifraobjekta as o2s,a1.brulice as a1bu,a1.ulica as au1,a1.broj as ab1,a1.nazivmesta as anm1,m1.postanskibroj as m1pb,m1.nazivmesta as m1np,a2.brulice as a2bu,a2.ulica as au2,a2.broj as ab2,a2.nazivmesta as anm2,m2.postanskibroj as m2pb,m2.nazivmesta as m2np, v2.brojsasije as brsasije,v2.model as model,v2.marka as marka,v2.godiste as godiste,v1.brojlicnekarte as blkarte, v1.licnipodaci as licnipodaci , obj.nazivobjekta as o3n , obj.sifraobjekta as o3s , a3.brulice as a3bu,a3.ulica as au3,a3.broj as ab3,a3.nazivmesta as anm3,m3.postanskibroj as m3pb,m3.nazivmesta as m3np,ulaz.nazivobjekta as o4n,ulaz.sifraobjekta as o4s,a4.brulice as a4bu,a4.ulica as au4,a4.broj as ab4,a4.nazivmesta as anm4,m4.postanskibroj as m4pb,m4.nazivmesta as m4np,izlaz.nazivobjekta as o5n,izlaz.sifraobjekta as o5s,a5.brulice as a5bu,a5.ulica as au5,a5.broj as ab5,a5.nazivmesta as anm5,m5.postanskibroj as m5pb,m5.nazivmesta as m5np, vozilo1.brojsasije as brsasije1,vozilo1.model as model1,vozilo1.marka as marka1,vozilo1.godiste as godiste1,vozac1.brojlicnekarte as blkarte1,vozac1.licnipodaci as licnipodaci1, prevoznik.sifraprevoznika as prevozniksifra,prevoznik.nazivprevoznika as prevozniknaziv,z1.imezaposlenog as imez1,z1.prezimezaposlenog as prezime1,z1.jmbg as jmbg1,z2.imezaposlenog as imez2,z2.prezimezaposlenog as prezime2,z2.jmbg as jmbg2,z3.imezaposlenog as imez3,z3.prezimezaposlenog as prezime3,z3.jmbg as jmbg3 from prenosnica p INNER JOIN Nalogzaizdavanjeprodavnici n on n.brojnaloga=p.brojnaloga INNER JOIN Korisnik k on n.idkorisnika=k.idkorisnika INNER JOIN objekat o1 on n.sifraobjektamag=o1.sifraobjekta  INNER JOIN objekat o2 on n.sifraobjektamalop=o2.sifraobjekta INNER JOIN adresa a1 on a1.brulice=o1.brulice INNER JOIN mesto m1 on a1.postanskibroj=m1.postanskibroj INNER JOIN adresa a2 on a2.brulice=o2.brulice INNER JOIN mesto m2 on a2.postanskibroj=m2.postanskibroj INNER JOIN Vozac v1 on v1.brojlicnekarte=n.brlicnekarte INNER JOIN Vozilo v2 on v2.brojsasije=n.brsasije INNER JOIN objekat obj on obj.sifraobjekta=p.sifraobjektaizdao INNER join adresa a3 on obj.brulice=a3.brulice INNER JOIN mesto m3 on m3.postanskibroj=a3.postanskibroj INNER JOIN objekat ulaz on ulaz.sifraobjekta=p.sifraobjektaulaz INNER JOIN adresa a4 on ulaz.brulice=a4.brulice INNER JOIN mesto m4 on m4.postanskibroj=a4.postanskibroj  INNER JOIN objekat izlaz on izlaz.sifraobjekta=p.sifraobjektaizlaz INNER JOIN adresa a5 on izlaz.brulice=a5.brulice INNER JOIN mesto m5 on m5.postanskibroj=a5.postanskibroj INNER JOIN Prevoznik prevoznik on prevoznik.sifraprevoznika=p.sifraprevoznika INNER JOIN vozilo vozilo1 on vozilo1.brojsasije=p.brsasije INNER JOIN  vozac vozac1 on p.brlicnekarte=vozac1.brojlicnekarte INNER join zaposleni z1 on z1.jmbg=p.jmbgodobrio INNER JOIN zaposleni z2 on z2.jmbg=p.jmbgpredao INNER JOIN zaposleni z3 on z3.jmbg=p.jmbgprimio";
           
             System.out.println(upit);
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
             
            while(rs.next()){
               Prenosnica p=new Prenosnica();
                p.setBrojPrenosnice(rs.getString("pb"));
                p.setDatum(rs.getDate("pdatum"));
                p.setNapomena(rs.getString("pnapomena"));
                p.setRokIsporuke(rs.getInt("rok"));
                p.setStorno(rs.getString("storno"));
                p.setVrstaPrenosnice(rs.getString("vrspren"));
                //////////////////////////////////////////////
                 Nalog nalog=new Nalog();
                nalog.setBrojNaloga(rs.getString("brojnaloga"));
                nalog.setDatum(rs.getDate("datum"));
                nalog.setNapomena(rs.getString("napomena"));
                nalog.setUkupnaVrednost(rs.getDouble("uv"));
                //////////////////////////////////////
                Korisnik korisnik=new Korisnik();
               korisnik.setIdKorisnika(rs.getInt("kid"));
               korisnik.setImePrezime(rs.getString("imeprezime"));
                nalog.setKorisnik(korisnik);
                //////////////////////////////
                Objekat magacin=new Objekat();
                Objekat maloprodaja=new Objekat();
                //o1 je o3
                magacin.setNazivObjekta(rs.getString("o1n"));
                magacin.setSifraObjekta(rs.getInt("o1s"));
                maloprodaja.setNazivObjekta(rs.getString("o2n"));
                maloprodaja.setSifraObjekta(rs.getInt("o2s"));
                Adresa a1=new Adresa();
                a1.setBrojUlice(rs.getInt("a1bu"));
                a1.setUlica(rs.getString("au1"));
                a1.setBroj(rs.getInt("ab1"));
                a1.setNazivMesta(rs.getString("anm1"));
                Mesto m1=new Mesto();
                m1.setPostanskiBroj(rs.getInt("m1pb"));
                m1.setNazivMesta(rs.getString("m1np"));
                a1.setPostanskiBroj(m1);
                magacin.setAdresa(a1);
                Adresa a2=new Adresa();
                a2.setBrojUlice(rs.getInt("a2bu"));
                a2.setUlica(rs.getString("au2"));
                a2.setBroj(rs.getInt("ab2"));
                a2.setNazivMesta(rs.getString("anm2"));
                Mesto m2=new Mesto();
                m2.setPostanskiBroj(rs.getInt("m2pb"));
                m2.setNazivMesta(rs.getString("m2np"));
                a2.setPostanskiBroj(m2);
                maloprodaja.setAdresa(a2);
                nalog.setMagacin(magacin);
                nalog.setMaloprodaja(maloprodaja);
                //////////
                Vozilo vozilo=new Vozilo();
                vozilo.setBrojSasije(rs.getString("brsasije"));
                vozilo.setMarka(rs.getString("marka"));
                vozilo.setModel(rs.getString("model"));
                GodinaProizvodnje god = (GodinaProizvodnje) rs.getObject("godiste");
                vozilo.setGodiste(god);
                Vozac vozac=new Vozac();
                vozac.setBrojLicneKarte(rs.getLong("blkarte"));
                LicniPodaciVozaca lpv = (LicniPodaciVozaca) rs.getObject("licnipodaci");
                vozac.setLicniPodaciVozaca(lpv);
                nalog.setVozac(vozac);
                nalog.setVozilo(vozilo);
                p.setNalog(nalog);
 ////////////////////
                Objekat o3=new Objekat();
                o3.setNazivObjekta(rs.getString("o3n"));
                o3.setSifraObjekta(rs.getInt("o3s"));
Adresa a3=new Adresa();
                a3.setBrojUlice(rs.getInt("a3bu"));
                a3.setUlica(rs.getString("au3"));
                a3.setBroj(rs.getInt("ab3"));
                a3.setNazivMesta(rs.getString("anm3"));
Mesto m3=new Mesto();
                m3.setPostanskiBroj(rs.getInt("m3pb"));
                m3.setNazivMesta(rs.getString("m3np"));
                a3.setPostanskiBroj(m3);
                o3.setAdresa(a3);
                p.setObjekatIzdao(o3);
                Objekat o5=new Objekat();
                o5.setNazivObjekta(rs.getString("o4n"));
                o5.setSifraObjekta(rs.getInt("o4s"));
                Adresa a5=new Adresa();
                a5.setBrojUlice(rs.getInt("a4bu"));
                a5.setUlica(rs.getString("au4"));
                a5.setBroj(rs.getInt("ab4"));
                a5.setNazivMesta(rs.getString("anm4"));
                Mesto m5=new Mesto();
                m5.setPostanskiBroj(rs.getInt("m4pb"));
                m5.setNazivMesta(rs.getString("m4np"));
                a5.setPostanskiBroj(m5);
                o5.setAdresa(a5);
                p.setObjekatUlaz(o5);
                
            
                
                Objekat o4=new Objekat();
                o4.setNazivObjekta(rs.getString("o5n"));
                o4.setSifraObjekta(rs.getInt("o5s"));
                Adresa a4=new Adresa();
                a4.setBrojUlice(rs.getInt("a5bu"));
                a4.setUlica(rs.getString("au5"));
                a4.setBroj(rs.getInt("ab5"));
                a4.setNazivMesta(rs.getString("anm5"));
                Mesto m4=new Mesto();
                m4.setPostanskiBroj(rs.getInt("m5pb"));
                m4.setNazivMesta(rs.getString("m5np"));
                a4.setPostanskiBroj(m4);
                o4.setAdresa(a4);
                p.setObjekatIzlaz(o4);
Prevoznik prevoznik=new Prevoznik();
                prevoznik.setSifraPrevoznika(rs.getInt("prevozniksifra"));
                prevoznik.setNazivPrevoznika(rs.getString("prevozniknaziv"));
                p.setPrevoznik(prevoznik);

Vozilo vozilo1=new Vozilo();
                vozilo1.setBrojSasije(rs.getString("brsasije1"));
                vozilo1.setMarka(rs.getString("marka1"));
                vozilo1.setModel(rs.getString("model1"));
                GodinaProizvodnje god1 = (GodinaProizvodnje) rs.getObject("godiste1");
                vozilo1.setGodiste(god1);
                Vozac vozac1=new Vozac();
 vozac1.setBrojLicneKarte(rs.getLong("blkarte1"));
                LicniPodaciVozaca lpv1 = (LicniPodaciVozaca) rs.getObject("licnipodaci1");
                vozac1.setLicniPodaciVozaca(lpv1);
                p.setVozac(vozac1);
                p.setVozilo(vozilo1);


Zaposleni z1=new Zaposleni();
               z1.setImeZaposlenog(rs.getString("imez1"));
               z1.setJmbg(rs.getString("jmbg1"));
               z1.setPrezimeZaposlenog(rs.getString("prezime1"));
               Zaposleni z2=new Zaposleni();
               z2.setImeZaposlenog(rs.getString("imez2"));
               z2.setJmbg(rs.getString("jmbg2"));
               z2.setPrezimeZaposlenog(rs.getString("prezime2"));
               Zaposleni z3=new Zaposleni();
               z3.setImeZaposlenog(rs.getString("imez3"));
               z3.setJmbg(rs.getString("jmbg3"));
               z3.setPrezimeZaposlenog(rs.getString("prezime3"));
                
               
                
                p.setZaposleniOdobrio(z1);
                p.setZaposleniPredao(z2);
                p.setZaposleniPrimio(z3);
              
                prenosnica.add(p);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista prenosnica!");
            return prenosnica;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje lista prenosnica!\n"+ex);
            ex.printStackTrace();
            throw ex;
        }
        
    }

    public void delete(Prenosnica p) throws Exception {
        try {
       String sql = "DELETE FROM prenosnica WHERE brojprenosnice =?";
             
       PreparedStatement ps = connection.prepareStatement(sql);
           ps.setString(1, p.getBrojPrenosnice());
           
           
       // int br = sqlStatement.executeUpdate(sql);
       int br = ps.executeUpdate();
       // sqlStatement.close();
       ps.close();
            commit();
            if (br == 0) {
            throw new Exception("Neuspešno brisanje prenosnice!");}
        } catch (SQLException ex) {
            System.out.println("Neuspesno brisanje stavke prenosnice!\n"+ex);
            ex.printStackTrace();
            throw ex;
        }
    }

    public void add(Prenosnica prenosnica) throws Exception{
         try {
            String upit="INSERT INTO prenosnica (brojprenosnice,datum,napomena,rokisporuke,storno,brojnaloga,jmbgprimio,jmbgpredao,jmbgodobrio,brlicnekarte,brsasije,sifraprevoznika,sifraobjektaizlaz,sifraobjektaulaz,sifraobjektaizdao,vrstaprenosnice) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
            
            statement.setString(1, prenosnica.getBrojPrenosnice());
            statement.setDate(2, prenosnica.getDatum());
            statement.setString(3, prenosnica.getNapomena());
            statement.setInt(4, prenosnica.getRokIsporuke());
            statement.setString(5, prenosnica.getStorno());
            
            statement.setString(6,prenosnica.getNalog().getBrojNaloga());
            
            statement.setString(7,prenosnica.getZaposleniPrimio().getJmbg());
            statement.setString(8,prenosnica.getZaposleniPredao().getJmbg());
            statement.setString(9,prenosnica.getZaposleniOdobrio().getJmbg());
            
            statement.setLong(10,prenosnica.getVozac().getBrojLicneKarte());
      statement.setString(11,prenosnica.getVozilo().getBrojSasije());
      
      statement.setLong(12,prenosnica.getPrevoznik().getSifraPrevoznika());
      
      statement.setInt(13,prenosnica.getObjekatIzlaz().getSifraObjekta());
      statement.setInt(14,prenosnica.getObjekatUlaz().getSifraObjekta());
            statement.setInt(15,prenosnica.getObjekatIzdao().getSifraObjekta());
            statement.setString(16, prenosnica.getVrstaPrenosnice());
            
                
      
           
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje prenosnice!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje prenosnice!");
            rollback();
            throw ex;
        }
    }

    public void edit(Prenosnica p)throws Exception {
         try {
            String sql = "UPDATE prenosnica SET datum = ?, napomena = ?, rokisporuke = ?,storno=?,brojnaloga=?,jmbgprimio=?,jmbgpredao=?,jmbgodobrio=?,brlicnekarte=?,brsasije=?,sifraprevoznika=?,sifraobjektaizlaz=?,sifraobjektaulaz=?,sifraobjektaizdao=?,vrstaprenosnice=? WHERE brojprenosnice = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setDate(1, p.getDatum());
        ps.setString(2, p.getNapomena());
        ps.setInt(3, p.getRokIsporuke());
        ps.setString(4, p.getStorno());
        
        ps.setString(5, p.getNalog().getBrojNaloga());
        
        ps.setString(6, p.getZaposleniPrimio().getJmbg());
        ps.setString(7, p.getZaposleniPredao().getJmbg());
        ps.setString(8, p.getZaposleniOdobrio().getJmbg());
        
        ps.setLong(9, p.getVozac().getBrojLicneKarte());
        ps.setString(10, p.getVozilo().getBrojSasije());
        
        ps.setInt(11, p.getPrevoznik().getSifraPrevoznika());
        
        ps.setInt(12, p.getObjekatIzlaz().getSifraObjekta());
        ps.setInt(13, p.getObjekatUlaz().getSifraObjekta());
        ps.setInt(14, p.getObjekatIzdao().getSifraObjekta());
        ps.setString(15, p.getVrstaPrenosnice());
        ps.setString(16, p.getBrojPrenosnice());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjena prenosnica!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjen prenosnica!");
            rollback();
            throw ex;
        }
    }
         
    
}


   

    
