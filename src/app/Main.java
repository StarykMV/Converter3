package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter project - converts temperatures between Fahrenheit and and Celsius.");

        System.out.println ("100°F = " + Converter.fahrenheitToCelsius(100) + "°C");

        System.out.println ("37°C = " + Converter.celsiusToFahrenheit(37) + "°F");
    }
}
