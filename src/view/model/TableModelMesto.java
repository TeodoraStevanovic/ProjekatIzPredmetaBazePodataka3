/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.JedinicaMere;
import domain.Mesto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelMesto extends AbstractTableModel{
     List<Mesto> lista;
    private final String[] naziviKolona = new String[]{"postanski broj","naziv mesta"};

    public TableModelMesto() {
    }

    public TableModelMesto(List<Mesto> lista) {
        this.lista = lista;
    }

    public List<Mesto> getLista() {
        return lista;
    }

    public void setLista(List<Mesto> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
      public Mesto vratiIzabranoMesto(int red) {
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
         Mesto m = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return m.getPostanskiBroj();
            case 1:
                return m.getNazivMesta();
          
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
