import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Integer> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(String product, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(String product, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (!products.containsKey(product)) {
            throw new IllegalArgumentException("Product does not exist");
        }
        int currentQuantity = products.get(product);
        if (quantity > currentQuantity) {
            throw new IllegalArgumentException("Quantity to remove cannot be greater than current inventory");
        }
        products.put(product, currentQuantity - quantity);
        if (products.get(product) == 0) {
            products.remove(product);
        }
    }

    public boolean isLowInventory(String product, int threshold) {
        if (threshold < 0) {
            throw new IllegalArgumentException("Threshold cannot be negative");
        }
        if (!products.containsKey(product)) {
            return false;
        }
        return products.get(product) < threshold;
    }

    public Collection<String> getProducts() {
        return products.keySet();
    }

    public int getQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
}
