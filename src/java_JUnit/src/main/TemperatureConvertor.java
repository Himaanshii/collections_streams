package java_junit.src.main;

public class TemperatureConvertor {
    public static double convertToFahrenheit(double temperature) {
        return (temperature * 9 / 5) + 32;
    }

    public static double convertToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
