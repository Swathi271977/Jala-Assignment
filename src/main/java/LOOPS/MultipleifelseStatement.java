/**
 * 13. Program for multiple if else statement(Largest number in 10,20 and 30)
 */
package LOOPS;

public class MultipleifelseStatement {
    public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;
            int num3 = 30;

            if (num1 >= num2 && num1 >= num3) {
                System.out.println(num1 + " is the largest number.");
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }
    }

