package org.launchcode.java.lessons.ch5;

import java.util.Objects;

public class Pet {

    private static int numberOfPets = 0;

    // create "constants" to store the conversion factors for cat and dog years
    public static final int HUMAN_YEARS_TO_DOG_YEARS = 7;
    public static final int HUMAN_YEARS_TO_CAT_YEARS = 5;

    private String name;
    private int age;

    // final means that a field can't be changed after it has been initially set/initialized
    private final String type;

    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
        numberOfPets++;
    }

    public int getAgeInAnimalYears() {

        if (this.type.equals("dog")) {
            return this.age * HUMAN_YEARS_TO_DOG_YEARS;
        } else if (this.type.equals("cat")) {
            return this.age * HUMAN_YEARS_TO_CAT_YEARS;
        }
        return this.age;
    }

    // static methods can only access other static methods and fields
    public static int getNumberOfPets() {
        return numberOfPets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.type + ", " + this.age + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return this.age == pet.age && this.name.equals(pet.name) && this.type.equals(pet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, type);
    }
}
