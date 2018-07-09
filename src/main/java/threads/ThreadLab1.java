/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carcass
 */
public class ThreadLab1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String[] msg = {Character.toString((char) ('A'+i*3))+"    .", 
                ".    "+Character.toString((char) ('B'+i*3)), 
                "  "+Character.toString((char) ('C'+i*3))};
            long[] sleepMillis = {99 + i, 100 + i, 200 + i};
            Runnable coor = new ThreadCoordinator(msg, sleepMillis);
            Thread thread = new Thread(coor);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadLab1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
