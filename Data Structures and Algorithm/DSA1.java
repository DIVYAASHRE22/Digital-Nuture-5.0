//Exercise 1
/*Importance of Data Structures and Algorithms: -
Enable efficient storage, searching, updating, and deletion of products.
Improve performance when handling large inventories.
Reduce processing time and memory usage.
Suitable Data Structure: -
HashMap<Integer, Product>
Key: productId
Value: Product
Provides fast access to products.*/
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
    @Override
    public String toString() {
        return productId + " " + productName + " " + quantity + " " + price;
    }
}
class InventoryManager {
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
}
public class DSA1 {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addProduct(new Product(101, "Laptop", 20, 55000));
        manager.addProduct(new Product(102, "Mouse", 100, 500));
        manager.updateProduct(101, 15);
        manager.deleteProduct(102);
        manager.displayProducts();
    }
}