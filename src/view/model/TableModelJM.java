/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.JedinicaMere;
import domain.Roba;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelJM extends AbstractTableModel{
     List<JedinicaMere> lista;
    private final String[] naziviKolona = new String[]{"sifra mere","naziv jedinice mere"};

    public TableModelJM() {
    }

    public TableModelJM(List<JedinicaMere> lista) {
        this.lista = lista;
    }

   

    public List<JedinicaMere> getLista() {
        return lista;
    }

    public void setLista(List<JedinicaMere> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
      public JedinicaMere vratiIzabranuJM(int red) {
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
         JedinicaMere jm = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return jm.getSifraMere();
            case 1:
                return jm.getNazivJediniceMere();
            
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
