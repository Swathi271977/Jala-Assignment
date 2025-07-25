

     /**
      * 17. Write a method to verify if the array contains two specified elements(12,23)
 */
     package ARRAYS;
import java.util.*;

     public class Q17Containstwospecificelements {
//method to verify if the array contains two specified elements(12,23)
        //creating a method which receives an array and integers as parameters
        static void contains(int[] arr, int n1,int n2) {
            boolean num1 = false;
            boolean num2 = false;
            //using for-each loop
            for (int i : arr) {
                //checks if given element is present and returns true
                if (i == n1) {
                    num1 = true;
                }
                //checks if given element is present and returns true
                if (i==n2){
                    num2 = true;
                }
            }
            //Executes if(true)
            if (num1) {
                System.out.printf("Contains %d in the array", n1);
            } else {
                System.out.printf("\nDoesn't Contain %d in the array", n1);
            }
            //Executes if(true)
            if (num2) {
                System.out.printf("\nContains %d in the array", n2);
            } else {
                System.out.printf("\nDoesn't Contain %d in the array", n2);
            }
            System.out.println("\nmy_arr[] = " + Arrays.toString(arr));
        }

        public static void main(String[] args) {
            //declaring and initializing an array
            int[] my_arr = {16, 48, 12, 30, 44, 29, 19};
            //User Input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value to verify (n1 & n2): ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            //passing array and Elements to verify
            contains(my_arr, n1,n2);
        }
    }

