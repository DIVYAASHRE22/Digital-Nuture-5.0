//Exercise 3
/*Sorting Algorithms: -
Bubble Sort: Repeatedly compares adjacent elements and swaps them if they are in the wrong order.
Insertion Sort: Builds the sorted array one element at a time by inserting elements into their correct position.
Quick Sort: Selects a pivot and partitions the array into smaller and larger elements, then recursively sorts them.
Merge Sort: Divides the array into halves, sorts each half, and merges them back together.
Analysis: -
Algorithm	Best Case	Average Case	Worst Case
Bubble Sort	O(n)	O(n²)	O(n²)
Quick Sort	O(n log n)	O(n log n)	O(n²)
Why Quick Sort is Preferred: -
Much faster for large datasets.
Average-case complexity is O(n log n).
Uses divide-and-conquer strategy.
Widely used in real-world applications.*/
class Order {
    int orderId;
    String customerName;
    double totalPrice;
    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
    void display() {
        System.out.println(orderId + " " + customerName + " " + totalPrice);
    }
}
public class DSA3 {
    static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }
    static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }
    static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
    static void displayOrders(Order[] orders) {
        for (Order order : orders) {
            order.display();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 2500),
            new Order(102, "Bob", 1200),
            new Order(103, "Charlie", 4500),
            new Order(104, "David", 1800)
        };

        quickSort(orders, 0, orders.length - 1);
        displayOrders(orders);
    }
}