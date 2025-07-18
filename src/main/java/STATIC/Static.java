/**
 * 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
 * methods and a main method.
 * 2. Print instance variables in static methods
 * 3. Print static variables in Instance methods
 * 4. Call instance methods in static methods
 * 5. Call static methods in instance methods
 * 6. Print all the static, instance variables in main method
 * 7. Call static methods and instance methods in main method
 */
package STATIC;

public class Static {
    // 1. Two static variables
        static int staticVar1 = 100;
        static String staticVar2 = "StaticString";

        // 1. Two instance variables
        int instanceVar1 = 200;
        String instanceVar2 = "InstanceString";

        // 2. Static method trying to print instance variables
        public static void staticMethod1() {
            System.out.println("In staticMethod1()");
            // Cannot directly access instance variables from static context.
            // The lines below will NOT compile:
            // System.out.println(instanceVar1);
            // System.out.println(instanceVar2);
            System.out.println("→ Cannot access instance variables directly in static methods");
        }

        public static void staticMethod2() {
            System.out.println("In staticMethod2()");
            // 4. Call instance methods in static methods
            Static obj = new Static();
            obj.instanceMethod1();
            obj.instanceMethod2();
        }

        // 5. Instance methods printing static variables
        public void instanceMethod1() {
            System.out.println("In instanceMethod1()");
            System.out.println("Accessing staticVar1: " + staticVar1);
            System.out.println("Accessing staticVar2: " + staticVar2);
        }

        public void instanceMethod2() {
            System.out.println("In instanceMethod2()");
            // 5. Call static methods in instance methods
            System.out.println("→ Calling staticMethod1() from instance method:");
            staticMethod1();
        }

        public static void main(String[] args) {
            System.out.println("=== MAIN METHOD START ===");

            // 6. Print all static & instance variables in main method
            System.out.println("staticVar1 = " + staticVar1);
            System.out.println("staticVar2 = " + staticVar2);

            Static objMain = new Static();
            System.out.println("instanceVar1 = " + objMain.instanceVar1);
            System.out.println("instanceVar2 = " + objMain.instanceVar2);

            System.out.println();

            // 7. Call static methods and instance methods in main method
            System.out.println("Calling staticMethod1():");
            staticMethod1();

            System.out.println();

            System.out.println("Calling staticMethod2():");
            staticMethod2();

            System.out.println();

            System.out.println("Calling instanceMethod1():");
            objMain.instanceMethod1();

            System.out.println();

            System.out.println("Calling instanceMethod2():");
            objMain.instanceMethod2();

            System.out.println("=== MAIN METHOD END ===");
        }
    }


