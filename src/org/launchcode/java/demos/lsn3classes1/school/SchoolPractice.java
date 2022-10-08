package org.launchcode.java.demos.lsn3classes1.school;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student ("Samantha Lowrie", 34, 1, 4.0);
//System.out.println(newStudent.getName());
//newStudent.setName("Bubba");
//System.out.println(newStudent.getName());
        //Above commented out shows name name (get/setter)

        Student corey = new Student("Corey", 23);
        Student topanga = new Student("Topanga", 24);
        Course english = new Course("English", "Mr.Feeney");
        english.addStudent(newStudent);
        english.addStudent(corey);
        english.addStudent(topanga);

        ArrayList<Student> roster = english.getClassRoster();
        for(Student student: roster){
            System.out.println(student.getName());

    }
    }
}