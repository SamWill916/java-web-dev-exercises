package org.launchcode.java.demos.lsn6inheritance.cats;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
    HouseCat garfield = new HouseCat("Garfield", 12);
    garfield.eat();
        System.out.println(garfield.isTired()); //prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); //prints 13

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

        Cat salem = new Cat(8);


    }


}
