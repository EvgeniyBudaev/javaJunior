package Podgotovka.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class CalculatorTest {
    @Test
    public void whenDivFirstonSecondThenResult5(){
        Calculator calculator = new Calculator();
        int result = calculator.div(15, 5);
        Assert.assertEquals(3, result);
        }

     @org.junit.Test(expected = ArithmeticException.class)
    public void whenDivOnZeroThenArithmeticException(){
         Calculator calculator = new Calculator();
         calculator.div(15, 0);
     }

     @Test
    public void whenDivThenResultNotNull(){
         Calculator calculator = new Calculator();
         int result = calculator.div(15, 5);
         assertNotNull(result);
     }

}
