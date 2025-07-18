/**
 * 1.Create an ArrayList of type String with 10 string elements. Add 10 string elements to
        * ArrayList and perform the below operations
        * - a. Add an element to the ArrayList
        * - b. Iterate through the ArrayList by using Iterator object
        * - c. Add an element at a specific index
        * - d. Remove an element from the ArrayList, Remove at an index
        * - e. Update the element at a specific index
        * - f. Check the element is present at a particular index
        * - g. Get an element at a particular index
        * - h. Find out the size of the ArrayList
        * - i. Check the given element is present in the ArrayList
        * - j. Remove all elements of the ArrayList
        */
package COLLECTIONS;

import java.util.Arrays;
import java.util.Iterator; // Import for Iterator

public class ArrayList {

    public static void main(String[] args) {

        // 1. Create an ArrayList of type String with 10 elements and initialize it
        java.util.ArrayList<String> fruits = new java.util.ArrayList<>(
                Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry",
                        "Fig", "Grape", "Honeydew", "Imbe", "Jackfruit"));
        System.out.println("Initial ArrayList (fruits): " + fruits); // Output: Initial ArrayList (fruits): [Apple, Banana, Cherry, Date, Elderberry, Fig, Grape, Honeydew, Imbe, Jackfruit]

        // a. Add an element to the ArrayList
        fruits.add("Kiwi"); // Adds at the end
        System.out.println("\nAfter adding 'Kiwi': " + fruits); // Output: After adding 'Kiwi': [Apple, Banana, Cherry, Date, Elderberry, Fig, Grape, Honeydew, Imbe, Jackfruit, Kiwi]

        // b. Iterate through the ArrayList by using Iterator object
        System.out.println("\nIterating through fruits with Iterator:");
        Iterator<String> fruitIterator = fruits.iterator(); // Create an Iterator object
        while (fruitIterator.hasNext()) { // Checks if there are more elements
            System.out.print(fruitIterator.next() + " "); // Prints the next element
        }
        System.out.println();

        // c. Add an element at a specific index
        fruits.add(3, "Dragonfruit"); // Adds "Dragonfruit" at index 3
        System.out.println("\nAfter adding 'Dragonfruit' at index 3: " + fruits); // Output: After adding 'Dragonfruit' at index 3: [Apple, Banana, Cherry, Dragonfruit, Date, Elderberry, Fig, Grape, Honeydew, Imbe, Jackfruit, Kiwi]

        // d. Remove an element from the ArrayList by value and by index
        fruits.remove("Banana"); // Removes the first occurrence of "Banana"
        System.out.println("\nAfter removing 'Banana' by value: " + fruits); // Output: After removing 'Banana' by value: [Apple, Cherry, Dragonfruit, Date, Elderberry, Fig, Grape, Honeydew, Imbe, Jackfruit, Kiwi]

        fruits.remove(0); // Removes the element at index 0 ("Apple")
        System.out.println("After removing element at index 0: " + fruits); // Output: After removing element at index 0: [Cherry, Dragonfruit, Date, Elderberry, Fig, Grape, Honeydew, Imbe, Jackfruit, Kiwi]

        // e. Update the element at a specific index
        fruits.set(1, "Golden Dragonfruit"); // Replaces element at index 1 ("Dragonfruit") with "Golden Dragonfruit"
        System.out.println("\nAfter updating element at index 1: " + fruits); // Output: After updating element at index 1: [Cherry, Golden Dragonfruit, Date, Elderberry, Fig, Grape, Honeydew, Imbe, Jackfruit, Kiwi]

        // f. Check the element is present at a particular index
        int targetIndex = 4;
        if (targetIndex >= 0 && targetIndex < fruits.size()) { // Check for valid index
            System.out.println("\nElement at index " + targetIndex + ": " + fruits.get(targetIndex)); // Output: Element at index 4: Fig
        } else {
            System.out.println("\nIndex " + targetIndex + " is out of bounds.");
        }


        // g. Get an element at a particular index
        String fruitAtIndex2 = fruits.get(2); // Retrieves the element at index 2 ("Date")
        System.out.println("\nElement at index 2: " + fruitAtIndex2); // Output: Element at index 2: Date

        // h. Find out the size of the ArrayList
        int currentSize = fruits.size(); // Returns the number of elements
        System.out.println("\nSize of the ArrayList: " + currentSize); // Output: Size of the ArrayList: 10

        // i. Check the given element is present in the ArrayList
        boolean containsGrape = fruits.contains("Grape"); // Checks if "Grape" exists
        boolean containsMango = fruits.contains("Mango"); // Checks if "Mango" exists
        System.out.println("\nDoes ArrayList contain 'Grape'? " + containsGrape); // Output: Does ArrayList contain 'Grape'? true
        System.out.println("Does ArrayList contain 'Mango'? " + containsMango); // Output: Does ArrayList contain 'Mango'? false

        // j. Remove all elements of the ArrayList
        fruits.clear(); // Removes all elements
        System.out.println("\nAfter removing all elements (clear()): " + fruits); // Output: After removing all elements (clear()): []
        System.out.println("Is ArrayList empty now? " + fruits.isEmpty()); // Output: Is ArrayList empty now? true
    }
}