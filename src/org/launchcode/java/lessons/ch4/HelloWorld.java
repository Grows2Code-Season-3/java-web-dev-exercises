package org.launchcode.java.lessons.ch4;

public class HelloWorld {

    // field / instance variable
    private String message;

    public HelloWorld (String message) {
        this.message = message;
    }

    // constructor overloading
    public HelloWorld () {

        // calls the other constructor
        this("Hello, World!");
    }

    // method / instance method
    public void sayHello() {
        System.out.println(this.message);
    }

    // Accessor methods / ie. getters and setters
    // makes message a property, since we're providing external access
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
