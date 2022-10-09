package exercises.technology;

public class Smartphone extends Computer{

    private int numberOfSelfies;

    public Smartphone(int storage, int ram, boolean hasKeyboard, int numberOfSelfies){
        super(storage, ram, hasKeyboard);
        this.numberOfSelfies = numberOfSelfies;
    }
    public void takeSelfie(){
        this.numberOfSelfies = this.numberOfSelfies + 1;
    }
    public int getNumberOfSelfies(){
        return this.numberOfSelfies;
    }

}
