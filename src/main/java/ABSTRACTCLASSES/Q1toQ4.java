/**
 * 1. Create an abstract class with abstract and non-abstract methods.
 * 2. Create a sub class for an abstract class. Create an object in the child class for the
 * abstract class and access the non-abstract methods
 * 3. Create an instance for the child class in child class and call abstract methods
 * 4. Create an instance for the child class in child class and call non-abstract methods
 */
package ABSTRACTCLASSES;


    // ✅ 1. Abstract class with abstract and non-abstract methods
    abstract class Vehicle {
        abstract void drive();  // abstract

        void fuelUp() {         // non-abstract
            System.out.println("Vehicle: Fueling up...");
        }
    }

    // ✅ 2. Subclass of Vehicle
    class Car extends Vehicle {
        // 🔧 3. Implement the abstract method in child class
        @Override
        void drive() {
            System.out.println("Car: Driving on the road!");
        }

        // ✅ Main method in subclass to test everything
        public static void main(String[] args) {
            // 2. Create object of child to access non-abstract method of Vehicle
            Vehicle v = new Car();
            v.fuelUp();  // Accessing Vehicle's non-abstract method

            // 4. Create instance of child class and call both methods
            Car myCar = new Car();
            myCar.drive();   // Calling overridden abstract method
            myCar.fuelUp();  // Calling inherited non-abstract method
        }
    }


