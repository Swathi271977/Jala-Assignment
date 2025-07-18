/**
 * 4. Write a program to print the odd and even numbers
 */
package LOOPS;
public class EvenAndOddNumbers {
    public static void main(String[] args) {
            int limit = 20; // Define the upper limit for checking numbers

            System.out.println("Odd Numbers up to " + limit + ":");
            for (int i = 1; i <= limit; i++) {
                if (i % 2 != 0) { // If the remainder when divided by 2 is not 0, it's odd
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n"); // Newline for better formatting

            System.out.println("Even Numbers up to " + limit + ":");
            for (int i = 1; i <= limit; i++) {
                if (i % 2 == 0) { // If the remainder when divided by 2 is 0, it's even
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Newline at the end
        }
    }

