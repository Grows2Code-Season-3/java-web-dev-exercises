package org.launchcode.java.lessons.ch7;

public class Teacher extends Person {

    private String subject;
    private int yearsTeaching;

    public Teacher(String name, String subject, int yearsTeaching) {

        super(name);

        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

}
