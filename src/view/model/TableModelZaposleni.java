/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.Vozilo;
import domain.Zaposleni;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelZaposleni extends AbstractTableModel
{
    
List<Zaposleni> lista;
    private final String[] naziviKolona = new String[]{"jmbg","ime","prezime"};

    public TableModelZaposleni() {
    }

    public TableModelZaposleni(List<Zaposleni> lista) {
        this.lista = lista;
    }

    public List<Zaposleni> getLista() {
        return lista;
    }

    public void setLista(List<Zaposleni> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }

   
      public Zaposleni vratiIzabrangZaposlenog(int red) {
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
         Zaposleni v = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return v.getJmbg();
            case 1:
                return v.getImeZaposlenog();
            case 2:
           
                return v.getPrezimeZaposlenog();
                
                 
                
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

    


