/**
 * 1. How to create a class, object, method and its signature.
 */
package JAVABASICS;

public class Creatingclassobjectmethod {
    private String name;  // Field

    // Constructor
    public Creatingclassobjectmethod(String name) {
        this.name = name;
    }

    // Method 1 – signature: getName()
    public String getName() {
        return name;
    }

    // Method 2 – signature: printName()
    public void printName() {
        System.out.println("Name: " + name);
    }

    // Method 3 – overloaded – signature: printName(String)
    public void printName(String title) {
        System.out.println(title + ": " + name);
    }

    public static void main(String[] args) {
        Creatingclassobjectmethod p1 = new Creatingclassobjectmethod("Swathi");  // Object creation
        p1.printName();                   // Calls printName()
        p1.printName("User");            // Calls overloaded printName(String)
        System.out.println("Returned: " + p1.getName()); // Uses getName()
    }
}
