/**
 * 13. Write a method to find the second largest number in an array
 14. Write a method to find the second largest number in an array
        */

package ARRAYS;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class Q13Q14Secondlargestnumberinarray {
    //method to find the second-largest number in an array
    //creating a method which receives an array as parameter
    static void secondLargest(int[] arr) {
        int temp;
        //outer loop
        for (int i = 0; i < arr.length; i++) {
            //inner loop
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The second largest number in Array : " + arr[arr.length - 2]);
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] my_arr = {11, 22, 63, 44, 95};
        System.out.println("arr[] = " + Arrays.toString(my_arr));
        //passing array to method
        secondLargest(my_arr);
    }
}

