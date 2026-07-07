
import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return productId + " " + productName + " Qty:" + quantity + " Price:" + price;
    }
}

public class InventoryManagementSystem {

    HashMap<Integer, Product> inventory = new HashMap<>();

    void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    void updateProduct(int id, int quantity) {
        if (inventory.containsKey(id)) {
            inventory.get(id).quantity = quantity;
        }
    }

    void deleteProduct(int id) {
        inventory.remove(id);
    }

    void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        InventoryManagementSystem ims = new InventoryManagementSystem();

        ims.addProduct(new Product(101, "Laptop", 10, 50000));
        ims.addProduct(new Product(102, "Mouse", 25, 500));

        System.out.println("Inventory:");
        ims.displayProducts();

        ims.updateProduct(101, 15);

        System.out.println("\nAfter Update:");
        ims.displayProducts();

        ims.deleteProduct(102);

        System.out.println("\nAfter Delete:");
        ims.displayProducts();
    }
}

