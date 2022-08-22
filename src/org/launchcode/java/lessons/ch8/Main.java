package org.launchcode.java.lessons.ch8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(1, "green");
        Square square = new Square(2);
        Shape anotherCircle = new Circle(42, "yellow");
        Triangle triangle = new Triangle (1, 2);

        // we can use polymorphism to mix data types, as long as the objects implement Shape
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(anotherCircle);
        shapes.add(triangle);

        printAreas(shapes);

    }

    // interfaces allow us to write code that is "loosely coupled"
    public static void printAreas(Iterable<Shape> shapes) {
        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }
    }

}
