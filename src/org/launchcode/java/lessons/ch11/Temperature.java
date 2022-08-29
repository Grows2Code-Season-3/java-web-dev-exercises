package org.launchcode.java.lessons.ch11;

public class Temperature {

    private double fahrenheit;

    public Temperature (double fahrenheit) throws TemperatureException {
        setFahrenheit(fahrenheit);
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) throws TemperatureException {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            throw new TemperatureException("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }

    public double getCelsius() {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public void setCelsius(double celsius) throws TemperatureException {
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        setFahrenheit(fahrenheit);
    }
}
