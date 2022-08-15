package org.launchcode.java.lessons.ch5;

public class Student {

    private static int nextStudentId = 1;

    private final int studentId;
    private String name;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int numberOfCredits, double gpa) {
        this.name = name;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;

        // automatically assign a unique studentId
        this.studentId = nextStudentId;
        nextStudentId++;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public int getStudentId() {
        return studentId;
    }
}
