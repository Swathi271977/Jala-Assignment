/**
 * 1. Write a class with a default constructor, one argument constructor and two argument constructors. Instantiate the class to call all the constructors of that class from a main class
 * 2. Call the constructors(both default and argument constructors) of super class from a child class
 * 3. Apply private, public, protected and default access modifiers to the constructor
 * 4. Write constructors with return type int and String
 * 5. Try to call the constructor multiple times with the same object
 */
package CONSTRUCTORS;


// ✅ Q1: Class with default, one-arg, two-arg constructors
class StudentQ1 {

    public StudentQ1() {
        System.out.println("Q1 - Default Constructor: No student information provided.");
    }

    public StudentQ1(String name) {
        System.out.println("Q1 - One-Argument Constructor: Student Name = " + name);
    }

    public StudentQ1(String name, int age) {
        System.out.println("Q1 - Two-Argument Constructor: Student Name = " + name + ", Age = " + age);
    }
}

// ✅ Q2: Superclass and Subclass calling constructors
class StudentQ2 {

    public StudentQ2() {
        System.out.println("Q2 - Student Default Constructor");
    }

    public StudentQ2(String name, int age) {
        System.out.println("Q2 - Student Parameterized Constructor: Name = " + name + ", Age = " + age);
    }
}

class CollegeStudent extends StudentQ2 {

    public CollegeStudent() {
        super(); // calls default constructor of StudentQ2
        System.out.println("Q2 - CollegeStudent Default Constructor");
    }

    public CollegeStudent(String name, int age) {
        super(name, age); // calls parameterized constructor
        System.out.println("Q2 - CollegeStudent Parameterized Constructor: Name = " + name + ", Age = " + age);
    }
}

// ✅ Q3: Constructors with access modifiers
class AccessModifiersExample {

    private AccessModifiersExample() {
        System.out.println("Q3 - Private Constructor");
    }

    public AccessModifiersExample(int a) {
        System.out.println("Q3 - Public Constructor: " + a);
    }

    protected AccessModifiersExample(String msg) {
        System.out.println("Q3 - Protected Constructor: " + msg);
    }

    AccessModifiersExample(double d) {
        System.out.println("Q3 - Default Constructor: " + d);
    }

    public static AccessModifiersExample create() {
        return new AccessModifiersExample();
    }
}

// ✅ Q4: Attempt to give return type (converted to method)//Not possible
class Demo {

    public Demo() {
        System.out.println("Q4 - Valid Constructor");
    }

    public int getRollNo() {
        return 101;
    }

    public String getName() {
        return "Swathi";
    }
}

// ✅ Q5: Trying to call constructor multiple times with same object
class StudentQ5 {
    public StudentQ5() {
        System.out.println("Q5 - Constructor called");
    }

    public void display() {
        System.out.println("Q5 - This is a method, not constructor");
    }
}

// ✅ Main Class to run all Q1 to Q5
public class Q1toQ5 {
    public static void main(String[] args) {

        // ---------- Q1 ----------
        System.out.println("\n--- Q1: Multiple Constructors ---");
        StudentQ1 s1 = new StudentQ1();
        StudentQ1 s2 = new StudentQ1("Swathi");
        StudentQ1 s3 = new StudentQ1("Swathi", 25);

        // ---------- Q2 ----------
        System.out.println("\n--- Q2: Superclass Constructor Call from Subclass ---");
        CollegeStudent cs1 = new CollegeStudent();
        CollegeStudent cs2 = new CollegeStudent("Swathi", 25);

        // ---------- Q3 ----------
        System.out.println("\n--- Q3: Access Modifiers in Constructors ---");
        AccessModifiersExample obj1 = AccessModifiersExample.create(); // private
        AccessModifiersExample obj2 = new AccessModifiersExample(10);  // public
        AccessModifiersExample obj3 = new AccessModifiersExample("Hello"); // protected
        AccessModifiersExample obj4 = new AccessModifiersExample(2.5); // default

        // ---------- Q4 ----------
        System.out.println("\n--- Q4: Constructor vs Method Return Types ---");
        Demo d = new Demo();
        System.out.println("Roll No: " + d.getRollNo());
        System.out.println("Name: " + d.getName());

        // ---------- Q5 ----------
        System.out.println("\n--- Q5: Constructor called only once ---");
        StudentQ5 student = new StudentQ5();
        student.display();
        student.display();
    }
}
