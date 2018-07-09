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
public class ThreadExample {

    public static void main(String[] args) {
        Runnable printer = new PrintRunnable(" B", 1000);
        Thread thread = new Thread(printer);
        thread.start();
        
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadExample.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("A");
        }
    }

}
