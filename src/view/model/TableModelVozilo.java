/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.Roba;
import domain.Vozilo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelVozilo extends AbstractTableModel{
     List<Vozilo> lista;
    private final String[] naziviKolona = new String[]{"broj sasije","marka","model","godiste"};

    public TableModelVozilo() {
    }

    public TableModelVozilo(List<Vozilo> lista) {
        this.lista = lista;
    }

   

    public List<Vozilo> getLista() {
        return lista;
    }

    public void setLista(List<Vozilo> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
      public Vozilo vratiIzabranoVozilo(int red) {
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
         Vozilo v = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return v.getBrojSasije();
            case 1:
                return v.getMarka();
            case 2:
           
                return v.getModel();
                 case 3:
                return v.getGodiste().getGodiste();
                 
                
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

    

