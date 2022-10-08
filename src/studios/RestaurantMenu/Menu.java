package studios.RestaurantMenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public void addMenuItem(MenuItem item){
        this.menuItems.add(item);
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
}
