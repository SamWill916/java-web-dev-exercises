package org.launchcode.java.demos.lsn6inheritance.technology;

public class Smartphone extends Computer{

    private String phoneNumber;
    public Smartphone(int storage, int ram, String brand, String phoneNumber) {
        super(storage, ram, brand);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void makeNoise(){
        System.out.println("Ring Ring Rinnnnggg");
    }
}
