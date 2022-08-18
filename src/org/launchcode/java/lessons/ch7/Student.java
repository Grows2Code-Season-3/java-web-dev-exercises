package org.launchcode.java.lessons.ch7;

public class Student extends Person {

    private int numberOfCredits;
    private double gpa;

    public Student (String name, int numberOfCredits, double gpa) {

        super(name);

        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String studentInfo() {
        return (this.getName() + " has a GPA of: " + this.gpa);
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

}
