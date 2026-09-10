import java.util.HashMap;
import java.util.Map;

public class Restaurant {

    private Map<String, MenuItem> menuItems;

    public Restaurant() {
        this.menuItems = new HashMap<>();
    }

    public void addMenuItem(String name, double price, double rating) {
        MenuItem menuItem = new MenuItem(name, price, rating);
        menuItems.put(name, menuItem);
    }

    public void removeMenuItem(String name) {
        menuItems.remove(name);
    }

    public double calculateAverageRating() {
        double sum = 0;
        int count = 0;
        for (MenuItem menuItem : menuItems.values()) {
            sum += menuItem.getRating();
            count++;
        }
        return sum / count;
    }

    private static class MenuItem {
        private String name;
        private double price;
        private double rating;

        public MenuItem(String name, double price, double rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public double getRating() {
            return rating;
        }
    }
}
