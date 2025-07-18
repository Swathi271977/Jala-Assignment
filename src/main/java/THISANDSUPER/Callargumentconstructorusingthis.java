package THISANDSUPER;
/**
4. Call argument constructor of current class using this()
 */
public class Callargumentconstructorusingthis {
    static class Student {
        int id;
        String name;

        // Default constructor
        Student() {
            this(101, "John"); // Calls the parameterized constructor
            System.out.println("Default constructor called");
        }

        // Parameterized constructor
        Student(int id, String name) {
            this.id = id;
            this.name = name;
            System.out.println("Parameterized constructor called");
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Triggers default constructor
    }
}
