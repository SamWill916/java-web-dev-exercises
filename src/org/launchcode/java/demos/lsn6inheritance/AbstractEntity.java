package org.launchcode.java.demos.lsn6inheritance;

public abstract class AbstractEntity {

    private int id;
    private static int counter = 0;

    public AbstractEntity(){
        this.id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }
}
