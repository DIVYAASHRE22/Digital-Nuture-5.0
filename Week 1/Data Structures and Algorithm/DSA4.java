//Exercise 4
/*Array Representation
An array stores elements in contiguous memory locations. Each element can be accessed using its index.
Advantages
Fast access using index (O(1)).
Easy to implement.
Efficient memory usage for fixed-size data.
Limitations of Arrays
Fixed size (cannot grow dynamically).
Insertion and deletion are costly due to shifting elements.
Wasted memory if array size is larger than required.
When to Use Arrays
When the number of records is known in advance.
When fast index-based access is needed.
For small to medium-sized datasets with infrequent insertions/deletions.*/
class Employee {
    int employeeId;
    String name;
    String position;
    double salary;
    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    void display() {
        System.out.println(employeeId + " " + name + " " + position + " " + salary);
    }
}
public class DSA4 {
    Employee[] employees = new Employee[10];
    int count = 0;

    void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
        }
    }
    Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }
    void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
    void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                break;
            }
        }
    }
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();
        em.addEmployee(new Employee(101, "John", "Manager", 60000));
        em.addEmployee(new Employee(102, "Alice", "Developer", 50000));
        em.addEmployee(new Employee(103, "Bob", "Tester", 45000));
        em.traverseEmployees();
        Employee e = em.searchEmployee(102);
        if (e != null) {
            System.out.println("Found: " + e.name);
        }
        em.deleteEmployee(102);
        System.out.println("After Deletion:");
        em.traverseEmployees();
    }
}