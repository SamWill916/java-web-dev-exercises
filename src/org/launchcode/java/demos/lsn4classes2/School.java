package org.launchcode.java.demos.lsn4classes2;

public class School {
    public static void main(String[] args){

        Student bob = new Student("Bob");
        bob.setNumberOfCredits(67);
        bob.setGpa(3.8);
        System.out.println(bob);

        Student mike = new Student("Mike");
        System.out.println(mike);

        Student jan = new Student("Jan");
        System.out.println(jan);



        //want to see if they have the same student id
        System.out.println(bob.equals(jan));
    }
}
