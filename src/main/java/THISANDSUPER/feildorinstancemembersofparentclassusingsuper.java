/**
 * 2. Print the fields/instance members of the parent class using super
 */
package THISANDSUPER;

public class feildorinstancemembersofparentclassusingsuper {
    // Parent class
    class Parent {
        int x = 100;
        String msg = "Hello from Parent";
    }

    // Child class
    class Child extends Parent {
        int x = 200;  // This hides the parent's x

        void printParentFields() {
            System.out.println("Parent x = " + super.x);     // Access parent class field
            System.out.println("Parent msg = " + super.msg); // Access parent class field
        }
    }

    // Main method in the outer class
    public static void main(String[] args) {
        feildorinstancemembersofparentclassusingsuper outer = new feildorinstancemembersofparentclassusingsuper();
        Child childObj = outer.new Child(); // Create Child object through outer instance
        childObj.printParentFields();
    }
}
