package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.HashMap;

public class Students {

    public static void main(String[] args) {

        HashMap<String, String> student1 = new HashMap<>();
        student1.put("firstName", "Jimmy");
        student1.put("lastName", "Smith");
        student1.put("grade", "9");
        student1.put("gpa", "3.5");

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("firstName", "Jane");
        student2.put("lastName", "Doe");
        student2.put("grade", "11");
        student2.put("gpa", "3.9");

        HashMap<String, String> student3 = new HashMap<>();
        student3.put("firstName", "Jackson");
        student3.put("lastName", "Brown");
        student3.put("grade", "7");
        student3.put("gpa", "2.5");

        ArrayList<HashMap<String, String>> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);


    }

}
