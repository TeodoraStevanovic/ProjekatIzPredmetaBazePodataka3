/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Adresa;
import domain.GodinaProizvodnje;
import domain.Korisnik;
import domain.LicniPodaciVozaca;
import domain.Mesto;
import domain.Nalog;
import domain.Objekat;
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
public class RepositoryNalog extends DbRepository{
 private Connection connection;
    
       
    public RepositoryNalog() {
    }

    public void add(Nalog nalog) throws Exception {
        try {
            String upit="INSERT INTO nalogzaizdavanjeprodavnici (brojnaloga,datum,napomena,sifraobjektamag,sifraobjektamalop,idkorisnika,brlicnekarte,brsasije) VALUES (?,?,?,?,?,?,?,?)";
            connection=DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement=connection.prepareStatement(upit);
            
            statement.setString(1, nalog.getBrojNaloga());
            statement.setDate(2, nalog.getDatum());
            
            statement.setString(3, nalog.getNapomena());
                
      statement.setInt(4,nalog.getMagacin().getSifraObjekta());
      statement.setInt(5,nalog.getMaloprodaja().getSifraObjekta());
      statement.setInt(6,nalog.getKorisnik().getIdKorisnika());
      statement.setLong(7,nalog.getVozac().getBrojLicneKarte());
      statement.setString(8,nalog.getVozilo().getBrojSasije());
           
            statement.executeUpdate();
            statement.close();
            commit();
            System.out.println("Uspesno kreiranje naloga!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno kreiranje naloga!");
            rollback();
            throw ex;
        }
    }

    public void edit(Nalog nalog) throws Exception {
       try {
            String sql = "UPDATE nalogzaizdavanjeprodavnici SET datum = ?, napomena = ?, sifraobjektamag = ?,sifraobjektamalop=?,idkorisnika=?,brlicnekarte=?,brsasije=? WHERE brojnaloga = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setDate(1, nalog.getDatum());
        ps.setString(2, nalog.getNapomena());
        ps.setInt(3, nalog.getMagacin().getSifraObjekta());
        ps.setInt(4, nalog.getMaloprodaja().getSifraObjekta());
        
        ps.setInt(5, nalog.getKorisnik().getIdKorisnika());
        
        ps.setString(7, nalog.getVozilo().getBrojSasije());
        ps.setLong(6, nalog.getVozac().getBrojLicneKarte());
        ps.setString(8, nalog.getBrojNaloga());
        ps.executeUpdate();
        ps.close();
              commit();
            System.out.println("Uspesno izmenjen nalog!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno izmenjen nalog!");
            rollback();
            throw ex;
        }
    }

    public void delete(Nalog n) throws Exception {
        try {
            String sql = "DELETE FROM nalogzaizdavanjeprodavnici WHERE brojnaloga =?";
            PreparedStatement ps = connection.prepareStatement(sql);
           ps.setString(1, n.getBrojNaloga());
        //Statement sqlStatement = connection.createStatement();
       // int br = sqlStatement.executeUpdate(sql);
        //sqlStatement.close();
        int br = ps.executeUpdate();
        ps.close();
            commit();
            if (br == 0) {
            throw new Exception("Neuspešno brisanje naloga!");
        }
        } catch (Exception ex) {
            System.out.println("Neuspesno brisanje naloga!\n"+ex);
            throw ex;
        }
    }
    
    
    public List<Nalog> getAll() throws Exception{
        try {
            List<Nalog> nalozi=new ArrayList<>();
            String upit="SELECT n.brojnaloga as brojnaloga,n.datum as datum,n.napomena as napomena,n.ukupnavrednost as uv,k.idkorisnika as kid,k.imeprezime as imeprezime,o1.nazivobjekta as o1n,o1.sifraobjekta as o1s,o2.nazivobjekta as o2n,o2.sifraobjekta as o2s,a1.brulice as a1bu,a1.ulica as au1,a1.broj as ab1,a1.nazivmesta as anm1,m1.postanskibroj as m1pb,m1.nazivmesta as m1np,a2.brulice as a2bu,a2.ulica as au2,a2.broj as ab2,a2.nazivmesta as anm2,m2.postanskibroj as m2pb,m2.nazivmesta as m2np, v2.brojsasije as brsasije,v2.model as model,v2.marka as marka,v2.godiste as godiste,v1.brojlicnekarte as blkarte, v1.licnipodaci as licnipodaci FROM Nalogzaizdavanjeprodavnici n INNER JOIN Korisnik k on n.idkorisnika=k.idkorisnika INNER JOIN objekat o1 on n.sifraobjektamag=o1.sifraobjekta  INNER JOIN objekat o2 on n.sifraobjektamalop=o2.sifraobjekta INNER JOIN adresa a1 on a1.brulice=o1.brulice INNER JOIN mesto m1 on a1.postanskibroj=m1.postanskibroj INNER JOIN adresa a2 on a2.brulice=o2.brulice INNER JOIN mesto m2 on a2.postanskibroj=m2.postanskibroj INNER JOIN Vozac v1 on v1.brojlicnekarte=n.brlicnekarte INNER JOIN Vozilo v2 on v2.brojsasije=n.brsasije";
            
            System.out.println(upit);
            connection=DbConnectionFactory.getInstance().getConnection();
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(upit);
            
            while(rs.next()){
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
                nalozi.add(nalog);
            }
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitana lista naloga!");
            return nalozi;
        } catch (SQLException ex) {
            System.out.println("Neuspesno ucitavanje liste naloga!\n"+ex);
            throw ex;
        }
    }
    
}
