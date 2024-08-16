package src;

//Create a class named `Person` with an attribute `name` (String). Implement two methods: `setName(String name)` to set the name and `getName()` to return the name.
class Person {
    // Attribute to hold the name
    String name;

    // Method to set the name
    public void setName(String newName) {
        name = newName; // Assign the provided name to the class attribute
    }

    // Method to get the name
    public String getName() {
        return name; // Return the value of the name attribute
    }
}

// Main class to test the Person class
public class crwo_methods {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();

        // Set the name using the setName method
        person.setName("Ravi");

        // Get the name using the getName method and print it
        System.out.println("Name is " + person.getName());
    }
}
