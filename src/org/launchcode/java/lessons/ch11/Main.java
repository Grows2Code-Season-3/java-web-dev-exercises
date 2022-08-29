package org.launchcode.java.lessons.ch11;

import org.launchcode.java.lessons.ch11.Temperature;

public class Main {

    public static void main(String[] args) {

        try {
            Temperature temp = new Temperature(85);
            temp.setFahrenheit(-500);
        } catch (TemperatureException e) {
            System.out.println("Invalid temperature. Please fix and try again.");
            e.printStackTrace();
        }

    }

}
