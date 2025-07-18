/**
 * 01. Write two methods with the same name but different number of parameters of same type
 * and call the methods from main method
 * 02. Write two methods with the same name but different number of parameters of different
 data type and call the methods from main method
 * 03. Write two methods with the same name and same number of parameters of same type
 and call from main method
 * 04. Write two methods with the same name and same number of parameters of different
 * type and call from main method
 * 05. Write two methods with the same name, number of parameters and data type but
 * different return Type
 */
package METHODOVERLOADING;
public class Methodoverloading {


        // 1️⃣ Same name, different number of parameters (same type)
        public static void show(int a) {
            System.out.println("Method with 1 int: " + a);
        }

        public static void show(int a, int b) {
            System.out.println("Method with 2 ints: " + a + ", " + b);
        }

        // 2️⃣ Same name, different number of parameters (different type)
        public static void display(int a) {
            System.out.println("Display method with 1 int: " + a);
        }

        public static void display(int a, double b) {
            System.out.println("Display method with 1 int and 1 double: " + a + ", " + b);
        }

        // 3️⃣ Same name, same number of parameters, same type
        public static void print(int a) {
            System.out.println("Print method with 1 int: " + a);
        }

        // ⚠️ Cannot overload with exact same signature:
        // public static void print(int a) { }

        // So here we change the parameter **name** but keep same type — still same method signature, so NOT overloaded

        // 4️⃣ Same name, same number of parameters, different type
        public static void process(int a) {
            System.out.println("Process with int: " + a);
        }

        public static void process(double a) {
            System.out.println("Process with double: " + a);
        }

        // 5️⃣ Same name, same number of parameters, same type, different return type — ⚠️ NOT VALID OVERLOADING
        // Overloading must differ in **parameter list**, return type alone does NOT allow overloading

    /*
    public static int calculate(int a) {
        return a * 2;
    }

    public static double calculate(int a) {
        return a * 2.5; // ❌ Compilation error: Duplicate method
    }
    */

        // ✅ Correct example — if we want different return types, we **must** change parameters
        public static int calculate(int a) {
            return a * 2;
        }

        public static double calculate(double a) {
            return a * 2.5;
        }

        public static void main(String[] args) {

            // Case 1: Different number of parameters (same type)
            show(10);
            show(10, 20);

            // Case 2: Different number of parameters (different type)
            display(5);
            display(5, 5.5);

            // Case 3: Same name, same number, same type
            print(99);

            // Case 4: Same number, different type
            process(100);      // int
            process(99.99);    // double

            // Case 5: Same number and type, different return type (only works if parameter list is different)
            int result1 = calculate(5);
            double result2 = calculate(5.5);
            System.out.println("Result (int): " + result1);
            System.out.println("Result (double): " + result2);
        }
    }



