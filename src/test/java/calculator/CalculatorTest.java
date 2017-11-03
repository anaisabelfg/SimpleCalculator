package calculator;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void sum(){
        Calculator calculator = new Calculator();

        int result = calculator.add(5, 5);
        assertTrue(result == 10);
    }


    @Test
    public void subtract() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(10, 5);
        assertTrue( result == 5);
    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(10, 5);
        assertTrue(result == 50);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();

        int result = calculator.divide(10, 5);
        assertTrue(result == 2);
    }

}
