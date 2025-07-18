/**
 * 3. Program to equal operator and not equal operators
 */
package LOOPS;
import java.util.Scanner;

public class Equalandnotequaloperator{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Example using == operator in a loop
            System.out.println("--- Equal To (==) Operator Example ---");
            System.out.print("Enter a number to find its multiples up to 20: ");
            int targetNumber = scanner.nextInt();

            System.out.println("Multiples of " + targetNumber + " up to 20:");
            for (int i = 1; i <= 20; i++) {
                if (i % targetNumber == 0) { // Check if 'i' is a multiple of 'targetNumber'
                    System.out.println(i);
                }
            }

            // Example using != operator in a loop
            System.out.println("\n--- Not Equal To (!=) Operator Example ---");
            System.out.print("Enter a number to exclude from counting up to 10: ");
            int excludedNumber = scanner.nextInt();

            System.out.println("Numbers from 1 to 10 (excluding " + excludedNumber + "):");
            for (int i = 1; i <= 10; i++) {
                if (i != excludedNumber) { // Check if 'i' is not equal to 'excludedNumber'
                    System.out.println(i);
                }
            }

            scanner.close();
        }
    }

