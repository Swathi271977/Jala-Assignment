/**
 * 6. Write a program to print even number between 10 and 100 using while
 */
package LOOPS;
public class EvenNumbers10_100 {
    public static void main(String[] args) {
            int number = 10; // Initialize with the starting even number

            System.out.println("Even numbers between 10 and 100:");

            while (number <= 100) { // Loop while the number is within the range
                System.out.println(number); // Print the current even number
                number += 2; // Increment by 2 to get the next even number
            }
        }
    }

