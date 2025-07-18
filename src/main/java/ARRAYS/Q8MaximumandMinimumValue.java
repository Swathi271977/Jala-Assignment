/**
 * 8. Write a function to find the minimum and maximum value of an array
 */
package ARRAYS;
import java.util.*;
import java.util.Scanner;
public class Q8MaximumandMinimumValue {

        // Function to find and print the minimum and maximum values in an array
        static void findMinMax(int[] arr) {
            if (arr == null || arr.length == 0) {
                System.out.println("Array is empty. Cannot find min and max values.");
                return;
            }

            int min = arr[0];
            int max = arr[0];

            // Loop through the array to find min and max
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // Print results
            System.out.println("Minimum value in the array: " + min);
            System.out.println("Maximum value in the array: " + max);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input from user
            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                System.out.printf("arr[%d] = ", i);
                arr[i] = sc.nextInt();
            }

            // Display the input array
            System.out.println("Input Array: " + Arrays.toString(arr));

            // Call method to find min and max
            findMinMax(arr);

            sc.close();
        }
    }


