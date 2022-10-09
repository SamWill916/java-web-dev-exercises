package exercises.technology;

import org.launchcode.java.demos.lsn6inheritance.technology.AbstractEntity;

public class Computer extends AbstractEntity {
    //computer is my parent class

    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int storage, int ram, boolean hasKeyboard){
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }
    public void increaseRam (int n){
        this.ram = this.ram + n;
    }
    public void increaseStorage (int x){
        this.storage = this.storage + x;
    }
}
