/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;


import domain.Vozac;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelVozac extends AbstractTableModel{
     List<Vozac> lista;
    private final String[] naziviKolona = new String[]{"broj licne karte","licni podaci(ime i prezime)"};

    public TableModelVozac() {
    }

    public TableModelVozac(List<Vozac> lista) {
        this.lista = lista;
    }


    public List<Vozac> getLista() {
        return lista;
    }

    public void setLista(List<Vozac> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
      public Vozac vratiIzabrangVozaca(int red) {
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
         Vozac v = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return v.getBrojLicneKarte();
            case 1:
                return v.getLicniPodaciVozaca().getImeVozaca()+" "+v.getLicniPodaciVozaca().getPrezimeVozaca();
            
                
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
