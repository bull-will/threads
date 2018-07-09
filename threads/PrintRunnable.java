/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Carcass
 */
public class PrintRunnable implements Runnable {

    private String msg;
    private long sleepMillis;

    public PrintRunnable(String msg, long sleepMillis) {
        this.msg = msg;
        this.sleepMillis = sleepMillis;
    }

    public void run() {
        for (int k = 0; k < 10; k++) {
            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(msg);
        }
    }
}
