/**
         * Calculates the sum of all integer elements in an array.
         *
         * @param arr The integer array to sum.
         * @return The total sum of the elements in the array.
         */
package ARRAYS;

    public class Q1AddIntegerValues {
        public static int sumArrayElements(int[] arr) {
            // Initialize a variable to store the sum
            int sum = 0;

            // Iterate through each element of the array
            for (int i = 0; i < arr.length; i++) {
                // Add the current element to the sum
                sum += arr[i];
            }

            // Return the calculated sum
            return sum;
        }

        public static void main(String[] args) {
            int[] numbers = {10, 40, 30, 60, 50};
            int totalSum = sumArrayElements(numbers);
            System.out.println("The sum of array elements is: " + totalSum);

        }
    }

