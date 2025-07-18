/**
 * 6. Write a function to copy an array to another array
 */
package ARRAYS;

import java.util.*;

public class Q6CopyArray {
    // Function to copy an array to another array
    static void copyingArray(int[] arr) {
        // Create a new array with the same length
        int[] copy = new int[arr.length];

        // Copy each element from arr to copy
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        // Print the copied array
        System.out.println("Array after copying to copy = " + Arrays.toString(copy));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();

        // Create a new array of size n
        int[] my_arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.printf("my_arr[%d] = ", i);
            my_arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.println("my_arr = " + Arrays.toString(my_arr));

        // Call the function to copy array
        copyingArray(my_arr);

        sc.close(); // Always good to close the scanner
    }
}
