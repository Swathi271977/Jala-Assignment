/**
 * 8. Write a program to find Armstrong number or not
 */
package LOOPS;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {

            /* 1️⃣  Get the number from the user instead of hard‑coding it */
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a three‑digit number: ");
            int number = sc.nextInt();
            sc.close();                      // good practice

            /* 2️⃣  Your original algorithm, unchanged */
            int originalNumber = number;
            int result = 0;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);   // power 3 → for 3‑digit inputs
                originalNumber /= 10;
            }

            /* 3️⃣  Display the answer */
            if (result == number)
                System.out.println(number + " is an Armstrong number.");
            else
                System.out.println(number + " is not an Armstrong number.");
        }
    }
