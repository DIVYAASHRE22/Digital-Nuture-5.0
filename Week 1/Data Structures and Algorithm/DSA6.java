//Exercise 6
/*Search Algorithms
Linear Search: -
Checks each element one by one until the target is found.
Works on both sorted and unsorted data.
Binary Search: -
Searches by repeatedly dividing a sorted array into two halves.
Faster than linear search for large datasets.
Requires the data to be sorted.*/
class Book {
    int bookId;
    String title;
    String author;
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}
public class DSA6 {
    static int linearSearch(Book[] books, String key) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }
    static int binarySearch(Book[] books, String key) {
        int low = 0;
        int high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = books[mid].title.compareToIgnoreCase(key);
            if (result == 0)
                return mid;
            else if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "C Programming", "Dennis Ritchie"),
            new Book(2, "Data Structures", "Mark Allen"),
            new Book(3, "Java Programming", "James Gosling"),
            new Book(4, "Python Basics", "Guido van Rossum")
        };
        String searchTitle = "Java Programming";
        int linearResult = linearSearch(books, searchTitle);
        System.out.println("Linear Search Index: " + linearResult);
        int binaryResult = binarySearch(books, searchTitle);
        System.out.println("Binary Search Index: " + binaryResult);
    }
}