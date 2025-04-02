package java_junit.src.test;

import java_junit.src.main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAdd() {
         Calculator calculator= new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
    }
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(3, 2));
        assertEquals(0, calculator.multiply(0, 1));
    }
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-3, calculator.divide(-9, 3));
    }
    @Test
    public void testDivideByZero() {
        Calculator Calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }


}