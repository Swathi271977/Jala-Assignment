/**
 * 7. Print the smaller and larger number
 */
package OPERATORS;
public class LargerSmallerNumber {

        public static void main(String[] args) {
            int number1 = 15;
            int number2 = 7;

            int smallerNumber = Math.min(number1, number2);
            int largerNumber = Math.max(number1, number2);

            System.out.println("The smaller number is: " + smallerNumber);
            System.out.println("The larger number is: " + largerNumber);
        }
    }

