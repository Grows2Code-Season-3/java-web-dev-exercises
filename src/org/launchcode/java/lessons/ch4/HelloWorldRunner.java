package org.launchcode.java.lessons.ch4;

public class HelloWorldRunner {

    public static void main(String[] args) {

        HelloWorld hello = new HelloWorld();
        hello.sayHello();

        String theMessage = hello.getMessage();

        // this is illegal
        // hello.message = "new message";

        hello.setMessage("new message");

        Temperature temp = new Temperature(85);
        double tempCelsius = temp.getCelsius();

    }

}
