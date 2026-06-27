//Exercise 2
/*Big O notation measures how the execution time of an algorithm grows as the input size increases.
Search Complexity
Algorithm	Best Case	Average Case	Worst Case
Linear Search	O(1)	O(n)	O(n)
Binary Search	O(1)	O(log n)	O(log n)
Linear Search: Checks elements one by one.
Binary Search: Repeatedly divides a sorted array into halves.*/
class Product {
    int productId;
    String productName;
    String category;
    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}
public class DSA2 {
    static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return i;
            }
        }
        return -1;
    }
    static int binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) {
                return mid;
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Monitor", "Electronics")
        };
        int targetId = 103;
        int linearResult = linearSearch(products, targetId);
        int binaryResult = binarySearch(products, targetId);
        System.out.println("Linear Search Index: " + linearResult);
        System.out.println("Binary Search Index: " + binaryResult);
    }
}