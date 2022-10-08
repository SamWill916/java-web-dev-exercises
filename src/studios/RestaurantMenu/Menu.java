package studios.RestaurantMenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public void addMenuItem(MenuItem item){
        this.menuItems.add(item);
    }

    //taking in a string instead of MenuItem (String item) to only use the name as a reference instead of having to pass the entire object
    public void removeMenuItem(String itemName){
        MenuItem toBeRemoved = null;
        for(MenuItem item:this.menuItems){
            if(item.getName().equalsIgnoreCase(itemName.toLowerCase())){
                toBeRemoved = item;
            }
        }
        if(toBeRemoved != null) {
            this.menuItems.remove(toBeRemoved);
        }
    }
    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }
    public LocalDate getLastUpdated(){
        return lastUpdated;
    }
    public void setLastUpdated(){
        lastUpdated = LocalDate.now();
    }
    @Override
    public String toString(){
        String output = "";
        for(MenuItem item: this.getMenuItems()){
            output += item.getName() + "-" + item.getDescription() + "\n" +
            "Price: " + item.getPrice() + "\n";
        }
        output += "Last updated: " + this.lastUpdated;
        return output;
    }
}
