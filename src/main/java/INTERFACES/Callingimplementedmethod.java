package INTERFACES;
/**
*3. Use Interface instances to call the implemented method in the implemented class
package INTERFACES;
*/

// Step 1: Define the interface
interface MyInterface {
    void showMessage();  // Abstract method
}

// Step 2: Implement the interface in a class
class MyImplementation implements MyInterface {
    @Override
    public void showMessage() {
        System.out.println("Hello from MyImplementation class!");
    }
}

// Step 3: Use interface reference to call the method
public class Callingimplementedmethod {
    public static void main(String[] args) {
        // Creating an object of the implementation class using interface reference
        MyInterface obj = new MyImplementation();  // ✅ Interface reference

        // Calling the implemented method
        obj.showMessage();  // ✅ Output: Hello from MyImplementation class!
    }
}
