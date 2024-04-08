import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(10.0, Calculator.add(5.0, 5.0), 0.0001);
    }

    @Test
    public void testSubtract() {
        assertEquals(5.0, Calculator.subtract(10.0, 5.0), 0.0001);
    }

    @Test
    public void testMultiply() {
        assertEquals(25.0, Calculator.multiply(5.0, 5.0), 0.0001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, Calculator.divide(10.0, 5.0), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator.divide(10.0, 0.0);
    }
}
