/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import domain.Nalog;
import domain.Roba;
import domain.StavkaNaloga;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class FrmIzmeniStavkeNaloga extends javax.swing.JDialog {

    /**
     * Creates new form FrmIzmeniStavkeNaloga
     */
    public FrmIzmeniStavkeNaloga(java.awt.Frame parent, boolean modal) {
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
        txtrbstavke = new javax.swing.JTextField();
        lblName2 = new javax.swing.JLabel();
        txtKolicina = new javax.swing.JTextField();
        lblPrice1 = new javax.swing.JLabel();
        cmbNalog = new javax.swing.JComboBox();
        lblManufacturer1 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        txtakciza = new javax.swing.JTextField();
        txtcena = new javax.swing.JTextField();
        btnOtkazi = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        cmbRoba = new javax.swing.JComboBox();
        lblName4 = new javax.swing.JLabel();
        lblManufacturer2 = new javax.swing.JLabel();
        txtporez = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelProduct1.setBorder(javax.swing.BorderFactory.createTitledBorder("Stavka naloga"));

        lblID1.setText("rb stavke:");

        txtrbstavke.setEditable(false);
        txtrbstavke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrbstavkeActionPerformed(evt);
            }
        });

        lblName2.setText("brojNaloga:");

        lblPrice1.setText("Roba:");

        cmbNalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNalogActionPerformed(evt);
            }
        });

        lblManufacturer1.setText("osnovna cena:");

        lblName3.setText("akciza:");

        txtcena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcenaActionPerformed(evt);
            }
        });

        btnOtkazi.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnOtkazi.setText("Otkazi");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        btnDodaj.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnDodaj.setText("Izmeni");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        cmbRoba.setEditable(true);
        cmbRoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRobaActionPerformed(evt);
            }
        });

        lblName4.setText("KOLICINA:");

        lblManufacturer2.setText("porez:");

        txtporez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtporezActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProduct1Layout = new javax.swing.GroupLayout(panelProduct1);
        panelProduct1.setLayout(panelProduct1Layout);
        panelProduct1Layout.setHorizontalGroup(
            panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduct1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrice1)
                            .addComponent(lblManufacturer1)
                            .addComponent(lblName4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcena)
                            .addComponent(cmbRoba, 0, 661, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProduct1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtKolicina))))
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addComponent(lblName3)
                        .addGap(82, 82, 82)
                        .addComponent(txtakciza))
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProduct1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblID1))
                            .addComponent(lblName2))
                        .addGap(68, 68, 68)
                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbNalog, 0, 609, Short.MAX_VALUE)
                            .addComponent(txtrbstavke))
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(panelProduct1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnDodaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOtkazi)
                .addGap(42, 42, 42))
            .addGroup(panelProduct1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManufacturer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtporez, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelProduct1Layout.setVerticalGroup(
            panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduct1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID1)
                    .addComponent(txtrbstavke, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName2)
                    .addComponent(cmbNalog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName4))
                .addGap(18, 18, 18)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName3)
                    .addComponent(txtakciza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturer2)
                    .addComponent(txtporez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManufacturer1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(panelProduct1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrbstavkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrbstavkeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrbstavkeActionPerformed

    private void cmbNalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNalogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNalogActionPerformed

    private void txtcenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcenaActionPerformed

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        try {
            StavkaNaloga sn=new StavkaNaloga();
            //Nalog nalog= (Nalog) cmbNalog.getSelectedItem();
           // String brojNaloga=nalog.getBrojNaloga();
            //int rb=    Controller.getInstance().vratiRbStavkeNaloga(brojNaloga);
            //sn.setRedniBrojNaloga(rb);
            sn.setRedniBrojNaloga(Integer.parseInt(txtrbstavke.getText().trim()));
            sn.setBrojNaloga((Nalog) cmbNalog.getSelectedItem());
            sn.setAkciza(Integer.parseInt(txtakciza.getText().trim()));
            sn.setKolicina(Integer.parseInt(txtKolicina.getText().trim()));
            sn.setOsnovnaCena(Double.parseDouble(txtcena.getText().trim()));
            sn.setPorez(Integer.parseInt(txtporez.getText().trim()));
            sn.setRoba((Roba) cmbRoba.getSelectedItem());

            Controller.getInstance().editStavkaNaloga(sn);
            JOptionPane.showMessageDialog(this, "Sistem je izmenio stavku naloga.", "Uspešna izmena stavke naloga", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Sistem ne može da izmeni stavku naloga", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void cmbRobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRobaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRobaActionPerformed

    private void txtporezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtporezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtporezActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIzmeniStavkeNaloga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIzmeniStavkeNaloga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIzmeniStavkeNaloga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIzmeniStavkeNaloga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmIzmeniStavkeNaloga dialog = new FrmIzmeniStavkeNaloga(new javax.swing.JFrame(), true);
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

    void setStavkaNaloga(StavkaNaloga s) {
         cmbNalog.setSelectedItem(s.getBrojNaloga());
          cmbRoba.setSelectedItem(s.getRoba());
          
          txtakciza.setText(String.valueOf(s.getAkciza()));
         txtKolicina.setText(String.valueOf(s.getKolicina()));
         txtporez.setText(String.valueOf(s.getPorez()));
         txtcena.setText(String.valueOf(s.getOsnovnaCena()));
         txtrbstavke.setText(String.valueOf(s.getRedniBrojNaloga()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JComboBox cmbNalog;
    private javax.swing.JComboBox cmbRoba;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblManufacturer1;
    private javax.swing.JLabel lblManufacturer2;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JPanel panelProduct1;
    private javax.swing.JTextField txtKolicina;
    private javax.swing.JTextField txtakciza;
    private javax.swing.JTextField txtcena;
    private javax.swing.JTextField txtporez;
    private javax.swing.JTextField txtrbstavke;
    // End of variables declaration//GEN-END:variables

    private void prepareView() throws Exception {
       pripremiComboRoba();
       pripremaComboNalog();
    }

    private void pripremiComboRoba() throws Exception {
        List<Roba> lista = Controller.getInstance().getAllRoba();
        cmbRoba.removeAllItems();
        for (Roba jm : lista) {
            cmbRoba.addItem(jm);
    }
}

    private void pripremaComboNalog() throws Exception{
       List<Nalog> lista = Controller.getInstance().getAllNalog();
        cmbNalog.removeAllItems();
        for (Nalog jm : lista) {
            cmbNalog.addItem(jm);
    }
    }
}
