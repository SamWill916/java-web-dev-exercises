package studios.RestaurantMenu;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;

    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public boolean getIsNew(){
        return this.isNew;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
    public boolean equals(Object toBeCompared) {
       if (toBeCompared == this) {
          return true;
       }

       if (toBeCompared == null) {
          return false;
       }

       if (toBeCompared.getClass() != getClass()) {
          return false;
       }

       MenuItem item = (MenuItem) toBeCompared;
       return this.name.equals(item.getName());
    }
}
