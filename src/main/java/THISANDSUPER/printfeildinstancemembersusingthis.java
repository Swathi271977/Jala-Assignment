/**
 * 1. Print the fields/instance members of the current class using this and without using object
 */
package THISANDSUPER;

public class printfeildinstancemembersusingthis {
    static class MyClass {
        int a = 10;
        String b = "Hello";

        void printFields() {
            System.out.println("a = " + this.a);
            System.out.println("b = " + this.b);
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();   // no need to create an outer‑class object
        obj.printFields();
    }
}
