/**
 * 16. Write a function to get the difference of largest and smallest value
 */
package ARRAYS;
import java.util.Arrays;
import java.util.Collections;
public class Q16Differencelargestandsmallestvalue {
    //method to get the difference of largest and smallest value
    //creating a method which receives an array as parameter
    static void difference_Min_Max(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int difference;
        for (int i = 1; i < arr.length; i++) {
            //Executes if value at index is larger
            if (arr[i] > max) {
                max = arr[i];
                //Executes if value at index is smaller
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        //Difference of both max and min is assigned
        difference = max - min;
        //prints largest and smallest values
        System.out.printf("Maximum value : %d , Minimum value : %d ", max, min);
        //prints difference of largest and smallest value
        System.out.println("\nDifference of largest and smallest values : " + difference);
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] my_arr = {13, 22, 33, 84, 56};
        System.out.println("my_arr[] = " + Arrays.toString(my_arr));
        //passing array to method to get difference
        difference_Min_Max(my_arr);
    }
}