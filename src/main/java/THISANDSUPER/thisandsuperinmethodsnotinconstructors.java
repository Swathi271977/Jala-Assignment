/**
 * 6. Use this() and super() in methods not in constructors
 */
package THISANDSUPER;

class Person {
    String name = "John Doe";

    void sayHello() {
        System.out.println("Hello from Person – " + name);
    }
}

class Student extends Person {
    String name = "Jane Smith";      // hides Person.name

    @Override
    void sayHello() {
        System.out.println("Hello from Student – " + name);
    }

    void introduce() {
        this.sayHello();                         // calls Student.sayHello
        super.sayHello();                        // calls Person.sayHello
        System.out.println("Student name (this.name):  " + this.name);
        System.out.println("Person  name (super.name): " + super.name);
    }
}

/** The single public class that contains main(). */
public class thisandsuperinmethodsnotinconstructors {
    public static void main(String[] args) {
        Student s = new Student();               // fine now—Student is top‑level
        s.introduce();
    }
}
