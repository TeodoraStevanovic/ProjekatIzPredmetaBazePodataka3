/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.Mesto;
import domain.Rashod;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelRashod extends AbstractTableModel{
     private List<Rashod> lista;
    private final String[] kolone = new String[]{"Broj rashoda", "Napomena", "Datum ", "Sifra objekta"};

    public TableModelRashod() {
    }

    public TableModelRashod(List<Rashod> lista) {
        this.lista = lista;
    }
    public int getRowCount() {
        if (lista == null) {
            return 0;
        }
        return lista.size();
    }

    public int getColumnCount() {
        return kolone.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        
    Rashod r=lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return r.getBrojRashoda();
            case 1:
                return r.getNapomena();
            case 2:
                return r.getDatum();
            case 3:
                return r.getSifraObjekta().getSifraObjekta();
            
            default:
                return "n/a";
        }
    }

    public List<Rashod> getLista() {
        return lista;
    }

    public void setLista(List<Rashod> lista) {
        this.lista = lista;
    }


    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
 public Rashod vratiIzabranRashod(int red) {
         return lista.get(red);
    }
    
    
    


    
}
