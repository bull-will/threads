/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shit;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class ShittyClass {
    public int returnRandomInteger () {
        return new Random().nextInt(100);
    }
    
    public String sayHello () {
        return "Hello";
    }
    
    public int divideNumbers (int dividend, int divisor) {
        if (divisor == 0 ) {
            throw new IllegalArgumentException("Divisor should not be 0");
        }
        return dividend/divisor;
    }
}
