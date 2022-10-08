package studios.RestaurantMenu;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem corndog = new MenuItem("corndog", 2.99, "hotdog in fluff", "main", false);
        MenuItem pizza = new MenuItem("pizza", 7.99, "is it even real pizza", "main", true);

        Menu menu = new Menu();
        menu.addMenuItem(corndog);
        menu.addMenuItem(pizza);

        for(MenuItem item: menu.getMenuItems()){
            System.out.println(item.getName());
        }
        menu.setLastUpdated();
        System.out.println(menu.getLastUpdated());
    }
}
