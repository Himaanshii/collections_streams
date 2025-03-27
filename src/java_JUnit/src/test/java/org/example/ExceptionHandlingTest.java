package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {
    @Test
    void testDivideByZero() {
        ExceptionHandling e1 = new ExceptionHandling();
        assertThrows(ArithmeticException.class, () -> e1.divide(10,0));
    }

}