package org.launchcode.java.lessons.ch8;

public class Circle implements Shape, Colorable, Comparable<Circle> {

    private double radius;
    private String color;

    private static final double PI = 3.14157;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int compareTo(Circle o) {
        // compare this to o
        double difference = this.radius - o.getRadius();

        if (difference > 0) {
            return 1;
        }

        if (difference < 0) {
            return -1;
        }

        return 0;
    }
}
