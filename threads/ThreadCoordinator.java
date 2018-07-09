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
public class ThreadCoordinator implements Runnable {
    
    private String[] msg = new String[3];
    private long[] sleepMillis = new long[3];

    public ThreadCoordinator(String[] msg, long[] sleepMillis) {
        for (int i = 0; i < msg.length; i++) {
            this.msg[i] = msg[i];
            this.sleepMillis[i] = sleepMillis[i];
        }
    }

    public void run() {
        try {
            Runnable printerA = new PrintRunnable(msg[0], sleepMillis[0]);
            Thread threadA = new Thread(printerA);
            threadA.start();
            Runnable printerB = new PrintRunnable(msg[1], sleepMillis[1]);
            Thread threadB = new Thread(printerB);
            threadB.start();
            threadA.join();
            threadB.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadCoordinator.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----");
        try {
            Runnable printerC = new PrintRunnable(msg[2], sleepMillis[2]);
            Thread threadC = new Thread(printerC);
            threadC.start();
            threadC.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadCoordinator.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("------");
    }
}
