package ACCESSMODIFIERS;
/**
     * 2. Create a class with DEFAULT fields and methods. Access these fields and methods
     * from any other class in the same package
     */

    //class with default fields and methods
     class Q2 {
        //Default fields
        int myAge;
        String myName;

        //Default method
        void defaultMethod() {
            System.out.println("My name is " + myName + " and my age is " + myAge);
        }
    }

    //Accessing default fields and method from other class in the same package
    public class DefaultClassFieldsMethod {
        public static void main(String[] args) {
            //Creating object of Q2.
            Q2  obj = new  Q2 ();
            //Accessing default fields
            obj.myAge = 27;
            obj.myName = "Swathi";
            //calling default method
            obj.defaultMethod();
        }
    }

