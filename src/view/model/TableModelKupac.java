/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.Adresa;
import domain.Kupac;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelKupac extends AbstractTableModel{
      List<Kupac> lista;
    private final String[] naziviKolona = new String[]{"PIB","Naziv kupca","MB","broj","broj ulice","postanski broj"};

    public TableModelKupac(List<Kupac> lista) {
        this.lista = lista;
    }

    public TableModelKupac() {
    }

    public List<Kupac> getLista() {
        return lista;
    }

    public void setLista(List<Kupac> lista) {
        this.lista = lista;
    }


    public Kupac vratiIzabranogKupca(int red) {
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
         Kupac k= lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return k.getPIB();
            case 1:
                return k.getNazivKupca();
                 case 2:
                return k.getMB();
                 case 3:
                return k.getBroj();
                 case 4:
                return k.getAdresa().getBrojUlice();
                case 5:
                return k.getAdresa().getPostanskiBroj().getPostanskiBroj();
            
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

    
