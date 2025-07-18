/**
 * 11. Program to check whether a number is EVEN or ODD using switch
 */
package LOOPS;
import java.util.Scanner;
public class EvenoroddusingSwitch {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an number: ");
            int number = scanner.nextInt();

            // Calculate the remainder when dividing by 2
            int remainder = number % 2;

            // Use a switch statement based on the remainder
            switch (remainder) {
                case 0:
                    System.out.println(number + " is an Even number.");
                    break;
                case 1:
                    System.out.println(number + " is an Odd number.");
                    break;
                default:
                    // This case is theoretically unreachable for integers,
                    // as remainder will always be 0 or 1 when dividing by 2.
                    System.out.println("Error: Unexpected remainder.");
            }

            scanner.close(); // Close the scanner to prevent resource leaks
        }
    }

