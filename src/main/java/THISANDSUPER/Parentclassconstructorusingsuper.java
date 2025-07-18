/**
 * 5. Call constructor of the parent class using super()
 */
package THISANDSUPER;

public class Parentclassconstructorusingsuper {

    // Static Parent class
    static class Person {
        String name;

        // Constructor of the parent class
        Person(String name) {
            this.name = name;
            System.out.println("Person constructor called");
            System.out.println("Name: " + name);
        }
    }

    // Static Child class
    static class Student extends Person {
        int id;

        // Constructor of the child class
        Student(String name, int id) {
            super(name); // Calls parent class constructor
            this.id = id;
            System.out.println("Student constructor called");
            System.out.println("ID: " + id);
        }

        public static void main(String[] args) {
            Student s1 = new Student("Alice", 101);
        }
    }
}
