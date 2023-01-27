/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.Nalog;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelNalog extends AbstractTableModel{
     List<Nalog> lista;
    private final String[] naziviKolona = new String[]{"Broj naloga","datum","napomena","Magacin sifra objekta","Maloprodaja sifra objekta","Korisnik","Broj lk vozaca","broj sasije vozila","UKUPNA VREDNOST"};

    public TableModelNalog() {
    }

    public TableModelNalog(List<Nalog> lista) {
        this.lista = lista;
    }

    public List<Nalog> getLista() {
        return lista;
    }

    public void setLista(List<Nalog> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }

    
      public Nalog vratiIzabranNalog(int red) {
         return lista.get(red);
    }

    @Override
    public int getRowCount() {
        if (lista == null) {
            return 0;
        } else {
            return lista.size();
        }
    }

     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Nalog n = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return n.getBrojNaloga();
            case 1:
                return n.getDatum();
            case 2:
                return n.getNapomena();
                 case 3:
                return n.getMagacin().getSifraObjekta();
                 case 4:
                return n.getMaloprodaja().getSifraObjekta();
                case 5:
                return n.getKorisnik().getIdKorisnika();
                case 6:
                return n.getVozac().getBrojLicneKarte();
                case 7:
                return n.getVozilo().getBrojSasije();
                
                 case 8:
                return n.getUkupnaVrednost();
            default:
                return "greska";
        }
    }
     @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }
}
    

