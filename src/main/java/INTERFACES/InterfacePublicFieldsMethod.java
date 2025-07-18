package INTERFACES;

/**
 * 08. Create a PUBLIC interface with fields and methods, fields should have values assigned.
 * Implement this interface to some class and print the values of the interface fields and
 * call the interface methods
 */

// Public interface with fields and methods
public interface InterfacePublicFieldsMethod {
    // All fields are implicitly public, static, and final
    int num = 181;

    void myMethod(); // abstract method
}

// Class implementing the interface
class InterfaceDemo implements InterfacePublicFieldsMethod {
    @Override
    public void myMethod() {
        System.out.println("This is a method implemented from the interface.");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();

        // Print interface field
        System.out.println("Value of num: " + num);

        // Call interface method
        obj.myMethod();
    }
}
