package org.launchcode.java.demos.lsn3classes1.school;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", instructor='" + instructor + '\'' +
                ", classRoster=" + classRoster +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(subject, course.subject) && Objects.equals(instructor, course.instructor) && Objects.equals(classRoster, course.classRoster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, instructor, classRoster);
    }
}
