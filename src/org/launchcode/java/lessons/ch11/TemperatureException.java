package org.launchcode.java.lessons.ch11;

// This is a "checked" exception, because it does not extend RuntimeException or Error
public class TemperatureException extends Exception {

    public TemperatureException(String message){
        super(message);
    }

}
