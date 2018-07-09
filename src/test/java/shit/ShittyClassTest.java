/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shit;

import java.util.Random;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class ShittyClassTest {
    private ShittyClass shittyClass = new ShittyClass();
    
    @Test
    public void returnRandomIntegerTest () {
        assertThat(shittyClass.returnRandomInteger()).isBetween(0, 100);
    }
    
    @Test
    public void sayHelloTest () {
        assertThat(shittyClass.sayHello()).isNotNull();
        assertThat(shittyClass.sayHello()).contains("Hello");
    }
    
    @Test
    public void divideNumbersTest () {
        int dividend = 4;
        int correctDivisor = 2;
        int zero = 0;
        
        assertThat(shittyClass.divideNumbers(dividend, correctDivisor)).isEqualTo(2);
        Throwable throwable = catchThrowable(()  -> shittyClass.divideNumbers(dividend, zero));
        assertThat(throwable)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("Divisor");
    }
}
