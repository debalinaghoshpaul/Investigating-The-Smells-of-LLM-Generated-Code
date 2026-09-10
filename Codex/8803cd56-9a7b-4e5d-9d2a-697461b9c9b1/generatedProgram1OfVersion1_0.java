public class Restaurant {
    private List<String> menuItems;
    private List<Double> prices;
    private List<Integer> ratings;

    public Restaurant() {
        menuItems = new ArrayList<>();
        prices = new ArrayList<>();
        ratings = new ArrayList<>();
    }

    public void addItem(String item, double price, int rating) {
        menuItems.add(item);
        prices.add(price);
        ratings.add(rating);
    }

    public void removeItem(String item) {
        int index = menuItems.indexOf(item);
        if (index != -1) {
            menuItems.remove(index);
            prices.remove(index);
            ratings.remove(index);
        }
    }

    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }

        return (double) sum / ratings.size();
    }
}