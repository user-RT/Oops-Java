package src;

class Employee {
    int id;
    String name;

    // Method to print details
    public void hlo() {
        // Print the actual values of id and name
        System.out.println("Id and Name of Employee is: " + id + ", " + name);
    }
}

public class practice_class_object {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee();
        employee.id = 1;
        employee.name = "Ravi";
        employee.hlo(); // Call the method to print details
    }
}
