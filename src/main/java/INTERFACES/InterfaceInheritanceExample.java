package INTERFACES;

// Base interface
interface BaseInterface {
    void baseMethod();
}

// Derived interface inheriting from BaseInterface
interface DerivedInterface extends BaseInterface {
    void derivedMethod();
}

// Class implementing the derived interface
public class InterfaceInheritanceExample implements DerivedInterface {

    // Overriding base interface method
    @Override
    public void baseMethod() {
        System.out.println("Base method implemented.");
    }

    // Overriding derived interface method
    @Override
    public void derivedMethod() {
        System.out.println("Derived method implemented.");
    }

    public static void main(String[] args) {
        // Creating object of implementing class
        InterfaceInheritanceExample obj = new InterfaceInheritanceExample();

        // Calling both methods
        obj.baseMethod();
        obj.derivedMethod();
    }
}
