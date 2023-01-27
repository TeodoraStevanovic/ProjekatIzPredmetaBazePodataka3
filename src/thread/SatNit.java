/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Teodora
 */
public class SatNit extends Thread{
    private final JLabel labela;

    public SatNit(JLabel labela) {
        this.labela = labela;
    }
    
    @Override
    public void run() {
       DateFormat df = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            labela.setText("Trenutno vreme: "+df.format(new Date()));
        }
    }
}
