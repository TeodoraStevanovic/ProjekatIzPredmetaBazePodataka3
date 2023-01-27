/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import domain.Adresa;
import domain.Kupac;
import domain.Mesto;
import java.util.List;
import javax.swing.JOptionPane;
import validation.Validator;

/**
 *
 * @author Korisnik
 */
public class FrmDodajKupca extends javax.swing.JDialog {

    /**
     * Creates new form FrmDodajKupca
     */
    public FrmDodajKupca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            prepareView();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Greška prilikom pripreme forme!", JOptionPane.ERROR_MESSAGE);
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

        panelProduct1 = new javax.swing.JPanel();
        lblID1 = new javax.swing.JLabel();
        txtbruliceprim = new javax.swing.JTextField();
        lblName2 = new javax.swing.JLabel();
        lblPrice1 = new javax.swing.JLabel();
        cmbJM1mes = new javax.swing.JComboBox();
        lblManufacturer1 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        txtnazivUlice = new javax.swing.JTextField();
        txtnazivmesta = new javax.swing.JTextField();
        txtbroj = new javax.swing.JTextField();
        btnIzmeni = new javax.swing.JButton();
        panelProduct2 = new javax.swing.JPanel();
        lblID2 = new javax.swing.JLabel();
        txtpib = new javax.swing.JTextField();
        lblName4 = new javax.swing.JLabel();
        lblPrice2 = new javax.swing.JLabel();
        lblManufacturer2 = new javax.swing.JLabel();
        lblName5 = new javax.swing.JLabel();
        txtnazivkupca = new javax.swing.JTextField();
        txtbr = new javax.swing.JTextField();
        txtmb = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnOtkazi = new javax.swing.JButton();
        cmbAdresa = new javax.swing.JComboBox();

        panelProduct1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adresa"));

        lblID1.setText("broj ulice:");

        lblName2.setText("postanski broj:");

        lblPrice1.setText("broj:");

        cmbJM1mes.setEditable(true);
        cmbJM1mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJM1mesActionPerformed(evt);
            }
        });

        lblManufacturer1.setText("Naziv mesta:");

        lblName3.setText("naziv ulice");

        txtnazivmesta.setEditable(false);
        txtnazivmesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnazivmestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProduct1Layout = new javax.swing.GroupLayout(panelProduct1);
        panelProduct1.setLayout(panelProduct1Layout);
        panelProduct1Layout.setHorizontalGroup(
            panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduct1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrice1)
                    .addComponent(lblManufacturer1)
                    .addComponent(lblName2)
                    .addComponent(lblID1)
                    .addComponent(lblName3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnazivUlice)
                            .addComponent(txtbruliceprim)
                            .addComponent(cmbJM1mes, 0, 475, Short.MAX_VALUE)
                            .addComponent(txtnazivmesta))
                        .addContainerGap())
                    .addComponent(txtbroj, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        panelProduct1Layout.setVerticalGroup(
            panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduct1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID1)
                    .addComponent(txtbruliceprim, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName2)
                    .addComponent(cmbJM1mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName3)
                    .addComponent(txtnazivUlice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice1)
                    .addComponent(txtbroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturer1)
                    .addComponent(txtnazivmesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        btnIzmeni.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnIzmeni.setText("Dodaj");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelProduct2.setBorder(javax.swing.BorderFactory.createTitledBorder("Kupac"));

        lblID2.setText("PIB");

        lblName4.setText("Naziv kupca:");

        lblPrice2.setText("broj:");

        lblManufacturer2.setText("Adresa:");

        lblName5.setText("maticni broj:");

        txtbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrActionPerformed(evt);
            }
        });

        btnDodaj.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnOtkazi.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnOtkazi.setText("Otkazi");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        cmbAdresa.setEditable(true);
        cmbAdresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAdresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProduct2Layout = new javax.swing.GroupLayout(panelProduct2);
        panelProduct2.setLayout(panelProduct2Layout);
        panelProduct2Layout.setHorizontalGroup(
            panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduct2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblID2)
                .addGap(50, 50, 50)
                .addComponent(txtpib)
                .addContainerGap())
            .addGroup(panelProduct2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnDodaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOtkazi)
                .addGap(37, 37, 37))
            .addGroup(panelProduct2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName4)
                .addGap(7, 7, 7)
                .addComponent(txtnazivkupca)
                .addContainerGap())
            .addGroup(panelProduct2Layout.createSequentialGroup()
                .addGroup(panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProduct2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName5))
                    .addGroup(panelProduct2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblPrice2)))
                .addGap(48, 48, 48)
                .addGroup(panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbr)
                    .addComponent(txtmb))
                .addContainerGap())
            .addGroup(panelProduct2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManufacturer2)
                .addGap(81, 81, 81)
                .addComponent(cmbAdresa, 0, 508, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProduct2Layout.setVerticalGroup(
            panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduct2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpib, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID2))
                .addGap(31, 31, 31)
                .addGroup(panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName4)
                    .addComponent(txtnazivkupca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName5)
                    .addComponent(txtmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice2))
                .addGap(35, 35, 35)
                .addGroup(panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblManufacturer2)
                    .addComponent(cmbAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(panelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(panelProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJM1mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJM1mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJM1mesActionPerformed

    private void txtnazivmestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnazivmestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnazivmestaActionPerformed

    private void txtbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbrActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        try {
            Validator.startValidation()
            .validateNotNullOrEmpty(txtpib.getText(), "pib je obavezno polje")
            .throwIfInvalide();

            Kupac k= new Kupac();
            k.setPIB(txtpib.getText().trim());
            k.setNazivKupca(txtnazivkupca.getText().trim());
            k.setMB(txtmb.getText().trim());
            k.setBroj(Integer.parseInt(txtbr.getText().trim()));
            k.setAdresa((Adresa) cmbAdresa.getSelectedItem());
     
      
            Controller.getInstance().addKupac(k);
            JOptionPane.showMessageDialog(this, "Sistem je zapamtio kupca.", "Uspešno čuvanje kupca", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Sistem ne može da zapamti kupca", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void cmbAdresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAdresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAdresaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDodajKupca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDodajKupca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDodajKupca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDodajKupca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDodajKupca dialog = new FrmDodajKupca(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JComboBox cmbAdresa;
    private javax.swing.JComboBox cmbJM1mes;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblManufacturer1;
    private javax.swing.JLabel lblManufacturer2;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblName5;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JPanel panelProduct1;
    private javax.swing.JPanel panelProduct2;
    private javax.swing.JTextField txtbr;
    private javax.swing.JTextField txtbroj;
    private javax.swing.JTextField txtbruliceprim;
    private javax.swing.JTextField txtmb;
    private javax.swing.JTextField txtnazivUlice;
    private javax.swing.JTextField txtnazivkupca;
    private javax.swing.JTextField txtnazivmesta;
    private javax.swing.JTextField txtpib;
    // End of variables declaration//GEN-END:variables

     private void prepareView() throws Exception {
       pripremiCombo();
    }

    private void pripremiCombo() throws Exception {
        List<Adresa> lista = Controller.getInstance().getAllAdresa();
        cmbAdresa.removeAllItems();
        for (Adresa jm : lista) {
            cmbAdresa.addItem(jm);
    }
    
}
}