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
import domain.Roba;
import domain.StavkaNaloga;
import domain.Vozac;
import domain.Vozilo;
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
public class RepositoryStavkaNaloga extends DbRepository{
         private Connection connection;

    public RepositoryStavkaNaloga() {
    }
    
     public int vratiRbStavkeNaloga(String brojNaloga) throws Exception {
        String sql = "SELECT COALESCE(MAX(REDNIBROJSTAVKENALOGA),0) FROM stavkanaloga WHERE brojnaloga=?";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        rs.next();
        int id = rs.getInt(1) + 1;
        return id;
    }

    public List<StavkaNaloga> getAll() throws Exception{
        try {
            List<StavkaNaloga> stavke=new ArrayList<>();
            String upit="SELECT s.rednibrojstavkenaloga as rbsn,s.akciza as akciza,s.porez as porez,s.osnovnacena as oc,s.kolicina as kolicina,r.sifrarobe as rsifrarobe,r.nazivrobe as rnazivrobe, r.barkod as rbarkod, r.nazivjm as rnazivjm,j.siframere as jmsiframere,j.nazivjm as jmnazivjm, n.brojnaloga as brojnaloga,n.datum as datum,n.napomena as napomena,n.ukupnavrednost as uv,k.idkorisnika as kid,k.imeprezime as imeprezime,o1.nazivobjekta as o1n,o1.sifraobjekta as o1s,o2.nazivobjekta as o2n,o2.sifraobjekta as o2s,a1.brulice as a1bu,a1.ulica as au1,a1.broj as ab1,a1.nazivmesta as anm1,m1.postanskibroj as m1pb,m1.nazivmesta as m1np,a2.brulice as a2bu,a2.ulica as au2,a2.broj as ab2,a2.nazivmesta as anm2,m2.postanskibroj as m2pb,m2.nazivmesta as m2np, v2.brojsasije as brsasije,v2.model as model,v2.marka as marka,v2.godiste as godiste,v1.brojlicnekarte as blkarte, v1.licnipodaci as licnipodaci FROM stavkanaloga s INNER JOIN nalogzaizdavanjeprodavnici n on s.brojnaloga=n.brojnaloga INNER JOIN roba r on s.sifrarobe=r.sifrarobe INNER JOIN jedinicamere j on j.siframere=r.siframere INNER JOIN Korisnik k on n.idkorisnika=k.idkorisnika INNER JOIN objekat o1 on n.sifraobjektamag=o1.sifraobjekta  INNER JOIN objekat o2 on n.sifraobjektamalop=o2.sifraobjekta INNER JOIN adresa a1 on a1.brulice=o1.brulice INNER JOIN mesto m1 on a1.postanskibroj=m1.postanskibroj INNER JOIN adresa a2 on a2.brulice=o2.brulice INNER JOIN mesto m2 on a2.postanskibroj=m2.postanskibroj INNER JOIN Vozac v1 on v1.brojlicnekarte=n.brlicnekarte INNER JOIN Vozilo v2 on v2.brojsasije=n.brsasije";
           
            System.out.println(upit);
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
                StavkaNaloga s=new StavkaNaloga();
                s.setAkciza(rs.getInt("akciza"));
                s.setKolicina(rs.getInt("kolicina"));
                s.setPorez(rs.getInt("porez"));
                s.setOsnovnaCena(rs.getDouble("oc"));
                s.setRedniBrojNaloga(rs.getInt("rbsn"));
                Roba r=new Roba();
                r.setSifraRobe(rs.getInt("rsifrarobe"));
                r.setNazivRobe(rs.getString("rnazivrobe"));
                r.setBarKod(rs.getLong("rbarkod"));
                r.setNazivJediniceMere(rs.getString("rnazivjm"));
                JedinicaMere jm=new JedinicaMere();
                jm.setSifraMere(rs.getInt("jmsiframere"));
                jm.setNazivJediniceMere(rs.getString("jmnazivjm"));
                r.setJedinicaMere(jm);
                s.setRoba(r);
                
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
                //o1 je magacin
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
                s.setBrojNaloga(nalog);
                stavke.add(s);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista stavki naloga!");
            return stavke;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste stavke naloga!\n"+ex);
            throw ex;
        }
        
    }

    public void delete(StavkaNaloga s) throws Exception {
          try {
       String sql = "DELETE FROM stavkanaloga WHERE brojnaloga =? AND rednibrojstavkenaloga=?";
             
       PreparedStatement ps = connection.prepareStatement(sql);
           ps.setString(1, s.getBrojNaloga().getBrojNaloga());
           ps.setInt(2,s.getRedniBrojNaloga());
           
       // int br = sqlStatement.executeUpdate(sql);
       int br = ps.executeUpdate();
       // sqlStatement.close();
       ps.close();
            commit();
            if (br == 0) {
            throw new Exception("Neuspešno brisanje naloga!");}
        } catch (SQLException ex) {
            System.out.println("Neuspesno brisanje stavke naloga!\n"+ex);
            ex.printStackTrace();
            throw ex;
        }

    }
     
       
    public void add(StavkaNaloga sn) throws Exception {
        try {
            String upit="INSERT INTO stavkanaloga (rednibrojstavkenaloga,brojnaloga,kolicina,akciza,osnovnacena,porez,sifrarobe) VALUES (?,?,?,?,?,?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
            
            statement.setInt(1, sn.getRedniBrojNaloga());
            statement.setString(2, sn.getBrojNaloga().getBrojNaloga());
            statement.setInt(3,sn.getKolicina());
      statement.setInt(4,sn.getAkciza());
      statement.setDouble(5,sn.getOsnovnaCena());
      statement.setInt(6,sn.getPorez());
      statement.setInt(7,sn.getRoba().getSifraRobe());
      
           
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje stavke naloga!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje stavke naloga!");
            rollback();
            throw ex;
        }
    }

    public void edit(StavkaNaloga sn) throws Exception {
        try {
            String sql = "UPDATE stavkanaloga SET kolicina = ?, akciza = ?, osnovnacena = ?, porez=?,sifrarobe=? WHERE rednibrojstavkenaloga = ? AND BROJNALOGA=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, sn.getKolicina());
        ps.setInt(2, sn.getAkciza());
        ps.setDouble(3, sn.getOsnovnaCena());
        ps.setInt(4, sn.getPorez());
        ps.setInt(5, sn.getRoba().getSifraRobe());
        
        ps.setInt(6,sn.getRedniBrojNaloga() );
        ps.setString(7, sn.getBrojNaloga().getBrojNaloga());
        
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjena STAVKA NALOGA!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjena stavka naloga!");
            rollback();
            throw ex;
        }
        }
    }
         
    

