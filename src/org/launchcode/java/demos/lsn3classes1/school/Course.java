package org.launchcode.java.demos.lsn3classes1.school;

import java.util.ArrayList;

public class Course {
    private String subject;
    private String instructor;
    private ArrayList<Student> classRoster = new ArrayList<>();

    public Course(String subject, String instructor) {
        this.subject = subject;
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        classRoster.add(student);
    }

    public ArrayList<Student> getClassRoster() {
        return classRoster;
    }
}
