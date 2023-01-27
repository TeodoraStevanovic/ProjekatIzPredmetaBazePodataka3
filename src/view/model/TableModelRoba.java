/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.Roba;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelRoba extends AbstractTableModel{
     List<Roba> lista;
    private final String[] naziviKolona = new String[]{"sifra robe","naziv robe","barkod","sifra mere","jedinica mere"};

    public TableModelRoba() {
    }

    public TableModelRoba(List<Roba> lista) {
        this.lista = lista;
    }

    public List<Roba> getLista() {
        return lista;
    }

    public void setLista(List<Roba> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
      public Roba vratiIzabranuRobu(int red) {
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
         Roba r = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return r.getSifraRobe();
            case 1:
                return r.getNazivRobe();
            case 2:
           
                return r.getBarKod();
                 case 3:
                return r.getJedinicaMere().getSifraMere();
                 case 4:
                return r.getNazivJediniceMere();
                
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
