package java_junit.src.test;

import java_junit.src.main.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {
    @Test
    void testDivideByZero() {
        ExceptionHandling calculator = new ExceptionHandling();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

}