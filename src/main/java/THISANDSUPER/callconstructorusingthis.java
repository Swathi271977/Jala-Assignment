/**
*3. Call constructor of the current class using this()
 */
package THISANDSUPER;

public class callconstructorusingthis {


        // No-argument constructor
        callconstructorusingthis() {
            this(10); // Calling the constructor with one int parameter
            System.out.println("No-argument constructor called.");
        }

        // Constructor with one int parameter
        callconstructorusingthis(int a) {
            this(a, "Hello"); // Calling the constructor with two parameters
            System.out.println("Constructor with int called: a = " + a);
        }

        // Constructor with int and String parameters
        callconstructorusingthis(int a, String msg) {
            System.out.println("Constructor with int and String called: a = " + a + ", msg = " + msg);
        }

        public static void main(String[] args) {
            callconstructorusingthis obj = new callconstructorusingthis();
        }
    }


