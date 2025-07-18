package INTERFACES;
/**
     * 02. Create an interface with two methods, but implement only one in a class. Call the
     * method implemented.
     */


    interface Jala_02 {
        void methodOne();

        void methodTwo();
    }

    public class InterfaceTwoMethod implements Jala_02 {
        //cannot implement only one method in a class
        @Override
        public void methodOne() {
            System.out.println("First Method");
        }

        @Override
        public void methodTwo() {
            System.out.println("Second Method");
        }

        //main method
        public static void main(String[] args) {
            InterfaceTwoMethod if2 = new InterfaceTwoMethod();
            //Calling the methods implemented
            if2.methodOne();
            if2.methodTwo();
        }
    }

