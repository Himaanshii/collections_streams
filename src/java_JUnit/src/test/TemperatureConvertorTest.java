package java_junit.src.test;

import java_junit.src.main.TemperatureConvertor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConvertorTest {
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConvertor.convertToFahrenheit((0)), 0.01);
        assertEquals(98.6, TemperatureConvertor.convertToFahrenheit((37)), 0.01);
        assertEquals(212.0, TemperatureConvertor.convertToFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConvertor.convertToCelsius(32), 0.01);
        assertEquals(37.0, TemperatureConvertor.convertToCelsius(98.6), 0.01);
        assertEquals(100.0, TemperatureConvertor.convertToCelsius(212), 0.01);
    }

}