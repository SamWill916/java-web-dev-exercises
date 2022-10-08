package org.launchcode.java.demos.lsn3classes1.school;

// Start working here with your Student class.

// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
    }
    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this(name, studentId);
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        // The above pulls from the constructor above
        //Setting the above auto-filled schoolpractice line6 with autofill Name:/StudentID:/etc

    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

}