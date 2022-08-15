package org.launchcode.java.lessons.ch5;

public class StudentRunner {

    public static void main(String[] args) {


        Student jack = new Student("Jack Smith", 50, 3.5);
        Student jane = new Student("Jane White", 45, 4.0);

        System.out.println("Jack's ID: " + jack.getStudentId());
        System.out.println("Jane's ID: " + jane.getStudentId());

    }

}
