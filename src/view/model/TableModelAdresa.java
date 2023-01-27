/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.Adresa;
import domain.JedinicaMere;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelAdresa extends AbstractTableModel{
     List<Adresa> lista;
    private final String[] naziviKolona = new String[]{"broj ulice","postanski broj","naziv ulice","broj","naziv mesta"};

    public TableModelAdresa() {
    }

    public TableModelAdresa(List<Adresa> lista) {
        this.lista = lista;
    }

   

    public List<Adresa> getLista() {
        return lista;
    }

    public void setLista(List<Adresa> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
      public Adresa vratiIzabranuAdresu(int red) {
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
         Adresa a = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return a.getBrojUlice();
            case 1:
                return a.getPostanskiBroj().getPostanskiBroj();
                 case 2:
                return a.getUlica();
                 case 3:
                return a.getBroj();
                 case 4:
                return a.getNazivMesta();
            
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
