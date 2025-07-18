package INTERFACES;


    /**
     * 05. Create two interfaces with the same method (same signature) in both the interfaces.
     * Implement these two interfaces in one class. Call the method.
     */

    // First interface
    interface InterfaceOne {
        void sameMethod();
    }

    // Second interface
    interface InterfaceTwo {
        void sameMethod();
    }

    // Class implementing both interfaces
    public class TwoInterfaceSameMethod implements InterfaceOne, InterfaceTwo {

        @Override
        public void sameMethod() {
            System.out.println("This single implementation satisfies both interfaces!");
        }

        public static void main(String[] args) {
            TwoInterfaceSameMethod obj = new TwoInterfaceSameMethod();

            // Call via concrete class
            obj.sameMethod();

            // Or cast to interface type—both work the same
            ((InterfaceOne) obj).sameMethod();
            ((InterfaceTwo) obj).sameMethod();
        }
    }

    