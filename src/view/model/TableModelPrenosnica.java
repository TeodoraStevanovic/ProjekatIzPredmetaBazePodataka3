/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import domain.Prenosnica;
import domain.Roba;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelPrenosnica extends AbstractTableModel{
     List<Prenosnica> lista;
    private final String[] naziviKolona = new String[]{"br prenosnice","datum","napomena","rokisporuke","storno","br naloga","Zaposleni-primio","Zaposleni-predao","zaposleni odobrio","Vozac","Vozilo","Prevoznik","Objekat izlaz","Objekat ulaz","Objekat odobrio","Vrsta prenosnice"};

    public TableModelPrenosnica() {
    }

    public TableModelPrenosnica(List<Prenosnica> lista) {
        this.lista = lista;
    }

    public List<Prenosnica> getLista() {
        return lista;
    }

    public void setLista(List<Prenosnica> lista) {
        this.lista = lista;
         fireTableDataChanged();
    }

    
      public Prenosnica vratiIzabranuPrenosnicu(int red) {
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
         Prenosnica r = lista.get(rowIndex);
        switch (columnIndex) {
             case 0:
                return r.getBrojPrenosnice();
            case 1:
                return r.getDatum();
            case 2:
           
                return r.getNapomena();
                 case 3:
                return r.getRokIsporuke();
                 case 4:
                return r.getStorno();
                 case 5:
                return r.getNalog().getBrojNaloga();
                 case 6:
                return r.getZaposleniPrimio().getJmbg();
                 case 7:
                return r.getZaposleniPredao().getJmbg();
                 case 8:
                return r.getZaposleniOdobrio().getJmbg();
                 case 9:
                return r.getVozac().getBrojLicneKarte();
                 case 10:
                return r.getVozilo().getBrojSasije();
                 case 11:
                return r.getPrevoznik().getSifraPrevoznika();
                 case 12:
                return r.getObjekatIzlaz().getSifraObjekta();
                 case 13:
                return r.getObjekatUlaz().getSifraObjekta();
                 case 14:
                return r.getObjekatIzdao().getSifraObjekta();
                 case 15:
                return r.getVrstaPrenosnice();
                
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
    

