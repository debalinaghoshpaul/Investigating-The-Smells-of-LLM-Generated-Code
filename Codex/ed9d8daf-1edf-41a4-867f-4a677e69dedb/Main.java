import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getLowInventoryProducts(int threshold) {
        List<Product> lowInventoryProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getQuantity() < threshold) {
                lowInventoryProducts.add(product);
            }
        }
        return lowInventoryProducts;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Inventory class
        Inventory inventory = new Inventory();

        // Add products to the inventory
        inventory.addProduct(new Product("Product 1", 10));
        inventory.addProduct(new Product("Product 2", 5));
        inventory.addProduct(new Product("Product 3", 15));

        // Remove a product from the inventory
        Product productToRemove = new Product("Product 2", 5);
        inventory.removeProduct(productToRemove);

        // Get low inventory products
        List<Product> lowInventoryProducts = inventory.getLowInventoryProducts(10);
        System.out.println("Low inventory products:");
        for (Product product : lowInventoryProducts) {
            System.out.println(product.getName() + " - Quantity: " + product.getQuantity());
        }
    }
}
