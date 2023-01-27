/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import domain.Korisnik;
import domain.Nalog;
import domain.Objekat;
import domain.Prenosnica;
import domain.Prevoznik;
import domain.Vozac;
import domain.Vozilo;
import domain.Zaposleni;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class FrmDodajPrenosnica extends javax.swing.JDialog {

    /**
     * Creates new form FrmDodajPrenosnica
     */
    public FrmDodajPrenosnica(java.awt.Frame parent, boolean modal) {
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
        brprenosnice = new javax.swing.JTextField();
        lblName2 = new javax.swing.JLabel();
        txtnapomena = new javax.swing.JTextField();
        lblPrice1 = new javax.swing.JLabel();
        cmbbrojNaloga = new javax.swing.JComboBox();
        lblName3 = new javax.swing.JLabel();
        btnIzmeni = new javax.swing.JButton();
        btnOtkazi = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        lblPrice2 = new javax.swing.JLabel();
        cmboizadao = new javax.swing.JComboBox();
        lblPrice3 = new javax.swing.JLabel();
        cmbPrevoznik = new javax.swing.JComboBox();
        lblPrice4 = new javax.swing.JLabel();
        lblPrice5 = new javax.swing.JLabel();
        cmbVozac = new javax.swing.JComboBox();
        cmbVozilo = new javax.swing.JComboBox();
        lblName4 = new javax.swing.JLabel();
        lblName5 = new javax.swing.JLabel();
        txtstorno = new javax.swing.JTextField();
        txtrokisporuke = new javax.swing.JTextField();
        cmboizlaz = new javax.swing.JComboBox();
        cmboulaz = new javax.swing.JComboBox();
        lblPrice6 = new javax.swing.JLabel();
        lblPrice7 = new javax.swing.JLabel();
        lblPrice8 = new javax.swing.JLabel();
        lblPrice9 = new javax.swing.JLabel();
        lblPrice10 = new javax.swing.JLabel();
        cmbOdobrio = new javax.swing.JComboBox();
        cmbPrimio = new javax.swing.JComboBox();
        cmbPredao = new javax.swing.JComboBox();
        lblPrice11 = new javax.swing.JLabel();
        cmbvrstaprenosnice = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelProduct1.setBorder(javax.swing.BorderFactory.createTitledBorder("Prenosnica"));

        lblID1.setText("broj prenosnice:");

        lblName2.setText("napomena");

        lblPrice1.setText("broj naloga");

        cmbbrojNaloga.setEditable(true);
        cmbbrojNaloga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbrojNalogaActionPerformed(evt);
            }
        });

        lblName3.setText("datum");

        btnIzmeni.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnIzmeni.setText("Dodaj");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnOtkazi.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnOtkazi.setText("Otkazi");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        lblPrice2.setText("Objekat izlaz");

        cmboizadao.setEditable(true);
        cmboizadao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboizadaoActionPerformed(evt);
            }
        });

        lblPrice3.setText("Prevoznik");

        cmbPrevoznik.setEditable(true);
        cmbPrevoznik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrevoznikActionPerformed(evt);
            }
        });

        lblPrice4.setText("Vozac");

        lblPrice5.setText("Vozilo");

        cmbVozac.setEditable(true);
        cmbVozac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVozacActionPerformed(evt);
            }
        });

        cmbVozilo.setEditable(true);
        cmbVozilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVoziloActionPerformed(evt);
            }
        });

        lblName4.setText("rok isporuke");

        lblName5.setText("storno(n/d)");

        cmboizlaz.setEditable(true);
        cmboizlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboizlazActionPerformed(evt);
            }
        });

        cmboulaz.setEditable(true);
        cmboulaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboulazActionPerformed(evt);
            }
        });

        lblPrice6.setText("Objekat ulaz");

        lblPrice7.setText("Objekat izdao");

        lblPrice8.setText("Zaposleni primio");

        lblPrice9.setText("Vrsta prenosnice");

        lblPrice10.setText("Zaposleni predao");

        cmbOdobrio.setEditable(true);
        cmbOdobrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOdobrioActionPerformed(evt);
            }
        });

        cmbPrimio.setEditable(true);
        cmbPrimio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrimioActionPerformed(evt);
            }
        });

        cmbPredao.setEditable(true);
        cmbPredao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPredaoActionPerformed(evt);
            }
        });

        lblPrice11.setText("Zaposleni odobrio");

        cmbvrstaprenosnice.setEditable(true);

        javax.swing.GroupLayout panelProduct1Layout = new javax.swing.GroupLayout(panelProduct1);
        panelProduct1.setLayout(panelProduct1Layout);
        panelProduct1Layout.setHorizontalGroup(
            panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduct1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addComponent(lblID1)
                        .addGap(54, 54, 54)
                        .addComponent(brprenosnice))
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProduct1Layout.createSequentialGroup()
                                .addComponent(lblName3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProduct1Layout.createSequentialGroup()
                                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPrice6)
                                        .addGroup(panelProduct1Layout.createSequentialGroup()
                                            .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblName2)
                                                .addComponent(lblName4)
                                                .addComponent(lblName5)
                                                .addComponent(lblPrice1))
                                            .addGap(2, 2, 2))
                                        .addComponent(lblPrice2))
                                    .addGroup(panelProduct1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPrice3)
                                            .addComponent(lblPrice7)
                                            .addComponent(lblPrice4)
                                            .addComponent(lblPrice5)
                                            .addComponent(lblPrice8)
                                            .addComponent(lblPrice10)
                                            .addComponent(lblPrice9)))
                                    .addComponent(lblPrice11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPrevoznik, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbVozac, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelProduct1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmboulaz, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtnapomena)
                                            .addComponent(cmbbrojNaloga, 0, 965, Short.MAX_VALUE)
                                            .addComponent(cmboizadao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(cmboizlaz, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtstorno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtrokisporuke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbVozilo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelProduct1Layout.createSequentialGroup()
                                        .addComponent(cmbvrstaprenosnice, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnIzmeni)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOtkazi)
                                        .addGap(27, 27, 27))
                                    .addComponent(cmbPrimio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbOdobrio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbPredao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        panelProduct1Layout.setVerticalGroup(
            panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduct1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID1)
                    .addComponent(brprenosnice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName3)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblName2))
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtnapomena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrokisporuke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName5))
                .addGap(18, 18, 18)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbbrojNaloga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboizlaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice6)
                    .addComponent(cmboulaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboizadao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice7))
                .addGap(18, 18, 18)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addComponent(lblPrice3)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrice4))
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addComponent(cmbPrevoznik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbVozac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addComponent(lblPrice5)
                        .addGap(18, 18, 18)
                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice8)
                            .addComponent(cmbPrimio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbVozilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addComponent(lblPrice10)
                        .addGap(47, 47, 47))
                    .addGroup(panelProduct1Layout.createSequentialGroup()
                        .addComponent(cmbPredao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbOdobrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice11))
                        .addGap(1, 1, 1)))
                .addGroup(panelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOtkazi)
                    .addComponent(btnIzmeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrice9)
                    .addComponent(cmbvrstaprenosnice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelProduct1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProduct1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbbrojNalogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbrojNalogaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbrojNalogaActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        try {
            Prenosnica prenosnica=new Prenosnica();
            prenosnica.setBrojPrenosnice(brprenosnice.getText().trim());
            
            jDateChooser2.setDateFormatString("yyyy-MM-dd");
            java.util.Date jud=jDateChooser2.getDate();
            java.sql.Date jsd=new java.sql.Date(jud.getTime());
            prenosnica.setDatum(jsd);
            prenosnica.setNalog((Nalog) cmbbrojNaloga.getSelectedItem());
            
            prenosnica.setObjekatIzdao((Objekat) cmboizadao.getSelectedItem());
            prenosnica.setObjekatIzlaz((Objekat) cmboizlaz.getSelectedItem());
            prenosnica.setObjekatUlaz((Objekat) cmboulaz.getSelectedItem());
            prenosnica.setNapomena(txtnapomena.getText().trim());
            prenosnica.setVozac((Vozac) cmbVozac.getSelectedItem());
            prenosnica.setVozilo((Vozilo) cmbVozilo.getSelectedItem());
            
            prenosnica.setZaposleniOdobrio((Zaposleni) cmbOdobrio.getSelectedItem());
            prenosnica.setZaposleniPredao((Zaposleni) cmbPredao.getSelectedItem());
            prenosnica.setZaposleniPrimio((Zaposleni) cmbPrimio.getSelectedItem());
            
            prenosnica.setVrstaPrenosnice((String) cmbvrstaprenosnice.getSelectedItem());
            prenosnica.setPrevoznik((Prevoznik) cmbPrevoznik.getSelectedItem());
            prenosnica.setStorno(txtstorno.getText().trim());
            prenosnica.setRokIsporuke(Integer.parseInt(txtrokisporuke.getText().trim()));

            Controller.getInstance().addPrenosnica(prenosnica);
            JOptionPane.showMessageDialog(this, "Sistem je zapamtio prenosnicu.", "Uspešno čuvanje prenosnicu", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Sistem ne može da zapamti prenosnicu", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void cmboizadaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboizadaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboizadaoActionPerformed

    private void cmbPrevoznikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrevoznikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPrevoznikActionPerformed

    private void cmbVozacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVozacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVozacActionPerformed

    private void cmbVoziloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVoziloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVoziloActionPerformed

    private void cmboizlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboizlazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboizlazActionPerformed

    private void cmboulazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboulazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboulazActionPerformed

    private void cmbOdobrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOdobrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOdobrioActionPerformed

    private void cmbPrimioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrimioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPrimioActionPerformed

    private void cmbPredaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPredaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPredaoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDodajPrenosnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDodajPrenosnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDodajPrenosnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDodajPrenosnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDodajPrenosnica dialog = new FrmDodajPrenosnica(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField brprenosnice;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JComboBox cmbOdobrio;
    private javax.swing.JComboBox cmbPredao;
    private javax.swing.JComboBox cmbPrevoznik;
    private javax.swing.JComboBox cmbPrimio;
    private javax.swing.JComboBox cmbVozac;
    private javax.swing.JComboBox cmbVozilo;
    private javax.swing.JComboBox cmbbrojNaloga;
    private javax.swing.JComboBox cmboizadao;
    private javax.swing.JComboBox cmboizlaz;
    private javax.swing.JComboBox cmboulaz;
    private javax.swing.JComboBox<String> cmbvrstaprenosnice;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblName5;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblPrice10;
    private javax.swing.JLabel lblPrice11;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblPrice3;
    private javax.swing.JLabel lblPrice4;
    private javax.swing.JLabel lblPrice5;
    private javax.swing.JLabel lblPrice6;
    private javax.swing.JLabel lblPrice7;
    private javax.swing.JLabel lblPrice8;
    private javax.swing.JLabel lblPrice9;
    private javax.swing.JPanel panelProduct1;
    private javax.swing.JTextField txtnapomena;
    private javax.swing.JTextField txtrokisporuke;
    private javax.swing.JTextField txtstorno;
    // End of variables declaration//GEN-END:variables

    private void prepareView() throws Exception {
       pripremiComboIzlaz();
       pripremiComboUlaz();
       pripremiComboObjekatIzdao();
       pripremiComboVozac();
       pripremiComboVozilo();
       pripremiComboPrevoznik();
       pripremiComboZaposleniPrimio();
       pripremiComboZaposleniPredao();
       pripremiComboZaposleniOdobrio();
       pripremaComboNalog();
       pripremaComboVrstaPrenosnice();
       
       
    }

    private void pripremiComboIzlaz() throws Exception {
        List<Objekat> lista = Controller.getInstance().getAllObjekti();
        cmboizlaz.removeAllItems();
        for (Objekat jm : lista) {
            cmboizlaz.addItem(jm);
    }
    
    }

    private void pripremiComboUlaz() throws Exception {
       List<Objekat> lista = Controller.getInstance().getAllObjekti();
        cmboulaz.removeAllItems();
        for (Objekat jm : lista) {
            cmboulaz.addItem(jm);
    }
    }

    private void pripremiComboObjekatIzdao()throws Exception {
       List<Objekat> lista = Controller.getInstance().getAllObjekti();
        cmboizadao.removeAllItems();
        for (Objekat jm : lista) {
            cmboizadao.addItem(jm);
    }
    }
    
    private void pripremiComboVozac() throws Exception {
        List<Vozac> lista = Controller.getInstance().getAllVozac();
        cmbVozac.removeAllItems();
        for (Vozac jm : lista) {
            cmbVozac.addItem(jm);
    }
    }

    private void pripremiComboVozilo() throws Exception {
       List<Vozilo> lista = Controller.getInstance().getAllVozilo();
        cmbVozilo.removeAllItems();
        for (Vozilo jm : lista) {
            cmbVozilo.addItem(jm);
    }
    }

    private void pripremiComboPrevoznik() throws Exception {
       List<Prevoznik> lista = Controller.getInstance().getAllPrevoznik();
        cmbPrevoznik.removeAllItems();
        for (Prevoznik jm : lista) {
            cmbPrevoznik.addItem(jm);
    }
    }
private void pripremiComboZaposleniPrimio()throws Exception {
       List<Zaposleni> lista = Controller.getInstance().getAllZaposleni();
        cmbPrimio.removeAllItems();
        for (Zaposleni jm : lista) {
            cmbPrimio.addItem(jm);
    }
    }
private void pripremiComboZaposleniPredao()throws Exception {
       List<Zaposleni> lista = Controller.getInstance().getAllZaposleni();
        cmbPredao.removeAllItems();
        for (Zaposleni jm : lista) {
            cmbPredao.addItem(jm);
    }
    }
private void pripremiComboZaposleniOdobrio()throws Exception {
       List<Zaposleni> lista = Controller.getInstance().getAllZaposleni();
        cmbOdobrio.removeAllItems();
        for (Zaposleni jm : lista) {
            cmbOdobrio.addItem(jm);
    }
    }

private void pripremaComboNalog() throws Exception{
       List<Nalog> lista = Controller.getInstance().getAllNalog();
        cmbbrojNaloga.removeAllItems();
        for (Nalog jm : lista) {
            cmbbrojNaloga.addItem(jm);
    }
    }

    private void pripremaComboVrstaPrenosnice() {
        cmbvrstaprenosnice.removeAllItems();
        String vrste[]={"Ulaz","Izlaz","Ulaz i izlaz"};
        for (String item : vrste) {
            cmbvrstaprenosnice.addItem(item);
        }
        
    }

        

    
}
