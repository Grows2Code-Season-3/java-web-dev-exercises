package org.launchcode.java.lessons.ch5;

public class PetRunner {

    public static void main(String[] args) {

//        System.out.println(Pet.getNumberOfPets());

        Pet jack = new Pet("Jackson", 13, "dog");
        Pet whitney = new Pet("Whitney", 5, "cat");
        Pet anotherJack = new Pet("Jackson", 13, "dog");

        System.out.println(jack.equals(whitney));

        // default .equals() compares memory locations
        System.out.println(jack.equals(anotherJack));

//        System.out.println(jack);
//        System.out.println(whitney);
//
//        System.out.println(Pet.getNumberOfPets());

    }

}
