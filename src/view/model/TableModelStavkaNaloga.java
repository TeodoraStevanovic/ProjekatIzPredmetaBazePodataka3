/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.StavkaNaloga;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelStavkaNaloga extends AbstractTableModel{
     List<StavkaNaloga> lista;
    private final String[] naziviKolona = new String[]{"rb stavke","broj naloga","kolicina","akciza","osnovna cena","porez","sifra robe"};

    public TableModelStavkaNaloga() {
    }

    public TableModelStavkaNaloga(List<StavkaNaloga> lista) {
        this.lista = lista;
    }

    public List<StavkaNaloga> getLista() {
        return lista;
    }

    public void setLista(List<StavkaNaloga> lista) {
        this.lista = lista;
         fireTableDataChanged();
    }

    
      public StavkaNaloga vratiIzabranuStavkuNaloga(int red) {
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
         StavkaNaloga s = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return s.getRedniBrojNaloga();
            case 1:
                return s.getBrojNaloga().getBrojNaloga();
            case 2:
           
                return s.getKolicina();
                 case 3:
                return s.getAkciza();
                 case 4:
                return s.getOsnovnaCena();
                 case 5:
                return s.getPorez();
                 case 6:
                return s.getRoba().getSifraRobe();

                
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
    

