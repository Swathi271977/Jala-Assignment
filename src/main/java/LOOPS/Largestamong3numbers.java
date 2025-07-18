/**
 * 5.Write a program to print largest number among three numbers
 */
package LOOPS;
import java.util.Scanner;
public class Largestamong3numbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input for three numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            int num3 = scanner.nextInt();

            // Store numbers in an array
            int[] numbers = {num1, num2, num3};

            int i = 0;
            int largest = numbers[0]; // assume the first number is the largest

            // Loop to find the largest number
            while (i < numbers.length) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
                i++;
            }

            // Display result
            System.out.println("The largest number is: " + largest);

            scanner.close();
        }
    }


