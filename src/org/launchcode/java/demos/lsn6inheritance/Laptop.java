package org.launchcode.java.demos.lsn6inheritance;

public class Laptop extends Computer{

    private boolean hasFullSizeKeyboard;

    public Laptop(int storage, int ram, String brand, boolean hasFullSizeKeyboard) {
        super(storage, ram, brand);
        this.hasFullSizeKeyboard = hasFullSizeKeyboard;
    }

    public boolean isHasFullSizeKeyboard() {
        return hasFullSizeKeyboard;
    }

    @Override
    public void makeNoise(){
        System.out.println("Brrrrrrrrrrrrr");
    }
}
