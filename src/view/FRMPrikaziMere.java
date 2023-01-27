/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import domain.JedinicaMere;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.model.TableModelJM;

/**
 *
 * @author Korisnik
 */
public class FRMPrikaziMere extends javax.swing.JDialog {

    /**
     * Creates new form FRMPrikaziMere
     */
    public FRMPrikaziMere(java.awt.Frame parent, boolean modal) {
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
        tbljm = new javax.swing.JTable();
        btnDodaj = new javax.swing.JButton();
        btnIzmeni = new javax.swing.JButton();
        btnObrisi1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Jedinica mere"));

        tbljm.setModel(new javax.swing.table.DefaultTableModel(
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
        tbljm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbljmFocusGained(evt);
            }
        });
        tbljm.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbljmPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tbljm);

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
            .addGap(0, 1387, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbljmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbljmFocusGained

    }//GEN-LAST:event_tbljmFocusGained

    private void tbljmPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbljmPropertyChange

    }//GEN-LAST:event_tbljmPropertyChange

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        FrmNovaJM f = new FrmNovaJM((JFrame) this.getParent(), true);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        int red = tbljm.getSelectedRow();
        if (red != -1) {
            TableModelJM tmt = (TableModelJM) tbljm.getModel();
            JedinicaMere JM = tmt.vratiIzabranuJM(red);
            FrmIzmeniJM fpt = new FrmIzmeniJM((GlavnaForma) this.getParent(), true);
            fpt.setjm(JM);
            fpt.setLocationRelativeTo(null);

            JOptionPane.showMessageDialog(this, "Sistem je učitao jm.", "Učitavanje jm", JOptionPane.INFORMATION_MESSAGE);
            fpt.setVisible(true);
        } else{ JOptionPane.showMessageDialog(this,"Sistem ne moze da  ucita jm.","Greska", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnObrisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisi1ActionPerformed
        try {
            int red = tbljm.getSelectedRow();
            if (red != -1) {
                TableModelJM tmv = (TableModelJM) tbljm.getModel();
                JedinicaMere jm = tmv.vratiIzabranuJM(red);
                Controller.getInstance().deleteJM(jm);
                prepareView();
                JOptionPane.showMessageDialog(this, "Sistem je obrisao jm.", "Brisanje jm", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne može da obriše jm.", "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnObrisi1ActionPerformed

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
            java.util.logging.Logger.getLogger(FRMPrikaziMere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMPrikaziMere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMPrikaziMere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMPrikaziMere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRMPrikaziMere dialog = new FRMPrikaziMere(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisi1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbljm;
    // End of variables declaration//GEN-END:variables

   private void prepareView() throws Exception {
        List<JedinicaMere> lista;
        lista = Controller.getInstance().getAllJedinicaMere();
        TableModelJM tmr = new TableModelJM(lista);
        tbljm.setModel(tmr);
    }
   
   
  
}
