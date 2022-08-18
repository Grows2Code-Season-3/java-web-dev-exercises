package org.launchcode.java.lessons.ch7;

import java.util.Objects;

public abstract class Person {

    private static int nextId = 1;

    private String name;
    private int id;

    public Person(String name) {
        this();
        this.name = name;
    }

    // no-arg constructor
    public Person() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
