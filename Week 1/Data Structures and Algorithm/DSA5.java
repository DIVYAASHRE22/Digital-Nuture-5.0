//Exercise 5
/*Linked Lists
A Linked List is a linear data structure where elements (nodes) are connected using pointers (references).
Types of Linked Lists: -
Singly Linked List: -
Each node contains data and a reference to the next node.
Traversal is possible only in the forward direction.
Doubly Linked List: -
Each node contains data, a reference to the next node, and a reference to the previous node.
Traversal is possible in both forward and backward directions.
Advantages of Linked Lists over Arrays: -
Dynamic size (can grow or shrink at runtime).
Efficient insertion and deletion without shifting elements.
No need to allocate memory in advance.
Limitations: -
No direct index access.
Extra memory required for storing references.
Searching is slower than arrays.*/
class Task {
    int taskId;
    String taskName;
    String status;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }
}

class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}
public class DSA5 {
    Node head;
    void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }
    void traverseTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task.taskId + " " +
                               temp.task.taskName + " " +
                               temp.task.status);
            temp = temp.next;
        }
    }
    void deleteTask(int taskId) {
        if (head == null)
            return;
        if (head.task.taskId == taskId) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null &&
               temp.next.task.taskId != taskId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    public static void main(String[] args) {
        TaskManagement tm = new TaskManagement();
        tm.addTask(new Task(1, "Design", "Pending"));
        tm.addTask(new Task(2, "Coding", "In Progress"));
        tm.addTask(new Task(3, "Testing", "Completed"));
        tm.traverseTasks();
        Task t = tm.searchTask(2);
        if (t != null) {
            System.out.println("Found: " + t.taskName);
        }
        tm.deleteTask(2);
        System.out.println("After Deletion:");
        tm.traverseTasks();
    }
}