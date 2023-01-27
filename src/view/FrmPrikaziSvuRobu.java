/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import domain.Roba;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.model.TableModelRoba;

/**
 *
 * @author Korisnik
 */
public class FrmPrikaziSvuRobu extends javax.swing.JDialog {

    /**
     * Creates new form FrmPrikaziSvuRobu
     */
    public FrmPrikaziSvuRobu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            prepareView();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Greška prilikom pripreme forme", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoba = new javax.swing.JTable();
        btnDodaj = new javax.swing.JButton();
        btnIzmeni = new javax.swing.JButton();
        btnObrisi1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Roba"));

        tblRoba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRoba.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblRobaFocusGained(evt);
            }
        });
        tblRoba.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblRobaPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblRoba);

        btnDodaj.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnIzmeni.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnIzmeni.setText("Izmeni");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnObrisi1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnObrisi1.setText("Obrisi");
        btnObrisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(369, 369, 369)
                        .addComponent(btnObrisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObrisi1)
                    .addComponent(btnIzmeni)
                    .addComponent(btnDodaj))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1399, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        FrmNovaRoba f = new FrmNovaRoba((JFrame) this.getParent(), true);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
      
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        int red = tblRoba.getSelectedRow();
        if (red != -1) {
            TableModelRoba tmt = (TableModelRoba) tblRoba.getModel();
            Roba roba = tmt.vratiIzabranuRobu(red);
            FrmIzmeniRobu fpt = new FrmIzmeniRobu((GlavnaForma) this.getParent(), true);
            fpt.setRoba(roba);
            fpt.setLocationRelativeTo(null);
            
            JOptionPane.showMessageDialog(this, "Sistem je učitao robu.", "Učitavanje robe", JOptionPane.INFORMATION_MESSAGE);
            fpt.setVisible(true);
        } else{ JOptionPane.showMessageDialog(this,"Sistem ne moze da  ucita robu.","Greska", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnIzmeniActionPerformed
 private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {                                       
       
            TableModelRoba tm = (TableModelRoba) tblRoba.getModel();
            try {
                prepareView();
       
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Greška", JOptionPane.ERROR_MESSAGE);
            }
        
    }          
    private void btnObrisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisi1ActionPerformed
        try {
            int red = tblRoba.getSelectedRow();
            if (red != -1) {
                TableModelRoba tmv = (TableModelRoba) tblRoba.getModel();
                Roba roba = tmv.vratiIzabranuRobu(red);
                Controller.getInstance().deleteRoba(roba);
                prepareView();
                JOptionPane.showMessageDialog(this, "Sistem je obrisao robu.", "Brisanje robe", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne može da obriše robu.", "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnObrisi1ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
     
        TableModelRoba tm = (TableModelRoba) tblRoba.getModel();
            try {
                prepareView();
       
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Greška", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_formFocusGained

    private void tblRobaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblRobaPropertyChange
      
    }//GEN-LAST:event_tblRobaPropertyChange

    private void tblRobaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblRobaFocusGained
        
    }//GEN-LAST:event_tblRobaFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrikaziSvuRobu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrikaziSvuRobu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrikaziSvuRobu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrikaziSvuRobu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrikaziSvuRobu dialog = new FrmPrikaziSvuRobu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void prepareView() throws SQLException, Exception {
        pripremiTabelu();
    }

    private void pripremiTabelu() throws SQLException, Exception {
         List<Roba> listaRobe = Controller.getInstance().getAllRoba();
        TableModelRoba tmr = new TableModelRoba(listaRobe);
        tblRoba.setModel(tmr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisi1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRoba;
    // End of variables declaration//GEN-END:variables
}