package org.launchcode.java.lessons.ch7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student jack = new Student("Jackson", 30, 3.5);
        Teacher jill = new Teacher("Jill", "Math", 7);

        // A Student "is a" Person, so I can put one inside of a Person variable
        Person sally = new Student("Sally", 50, 4.0);
        Person stewart = new Teacher("Stewart", "Biology", 12);

        // using "polymorphism" to mix data types
        ArrayList<Person> allPeople = new ArrayList<>();
        allPeople.add(sally);
        allPeople.add(stewart);
        allPeople.add(jack);
        allPeople.add(jill);

        // print out all of the people in the system
        for (Person p : allPeople) {
            printPersonInfo(p);
        }
    }

    public static void printPersonInfo(Person person) {

        String outStr = person.getId() + ": " + person.getName();

        if (person instanceof Student) {

            // casting person from Person type to Student type
            Student castedPerson = (Student) person;

            outStr += " (" + castedPerson.getGpa() + ")";
        } else if (person instanceof Teacher) {
            Teacher castedPerson = (Teacher) person;
            outStr += " (" + castedPerson.getSubject() + ")";
        }

        System.out.println(outStr);
    }

}
