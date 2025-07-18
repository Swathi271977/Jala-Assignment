/**
 *  2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
 *  * - a. Insert a Key value mapping into the map
 *  * - b. Fetch the value of a Key
 *  * - c. Create a clone/copy of HashMap
 *  * - d. Check if the given Key is in the Map
 *  * - e. Check if the value is in the Map
 *  * - f. Check if the map is empty
 *  * - g. Print the size of the Map to the console
 *  * - h. Print all the Keys of the map to the console
 *  * - j. Remove a specific Key-value pair
 *  * - k. Copy all the elements of the Map to another Map
 */
package COLLECTIONS;

import java.util.Map; // Import Map interface

    public class HashMap {

        public static void main(String[] args) {

            // 1. Create a HashMap with at least 10 key-value pairs of Student ID and Name
            java.util.HashMap<Integer, String> studentMap = new java.util.HashMap<>();

            studentMap.put(101, "Alice Smith");
            studentMap.put(102, "Bob Johnson");
            studentMap.put(103, "Charlie Brown");
            studentMap.put(104, "Diana Prince");
            studentMap.put(105, "Ethan Hunt");
            studentMap.put(106, "Fiona Glenn");
            studentMap.put(107, "George Martin");
            studentMap.put(108, "Hannah Montana");
            studentMap.put(109, "Ivan Drago");
            studentMap.put(110, "Julia Roberts");

            System.out.println("Initial Student Map: " + studentMap); //

            // 2. Insert a Key-value mapping into the map
            studentMap.put(111, "Kyle Reese");
            System.out.println("\nMap after inserting new entry (111, Kyle Reese): " + studentMap); //

            // 3. Fetch the value of a Key
            int keyToFetch = 105;
            String studentName = studentMap.get(keyToFetch);
            System.out.println("\nStudent with ID " + keyToFetch + ": " + studentName); //

            // 4. Create a clone/copy of HashMap
            // The clone() method performs a shallow copy. For Student ID (Integer) and Name (String), this is fine as they are immutable.
            java.util.HashMap<Integer, String> clonedStudentMap = (java.util.HashMap<Integer, String>) studentMap.clone();
            System.out.println("\nCloned Student Map: " + clonedStudentMap); //

            // 5. Check if the given Key is in the Map
            int keyToCheck = 103;
            boolean containsKey = studentMap.containsKey(keyToCheck);
            System.out.println("\nDoes the map contain key " + keyToCheck + "? " + containsKey); //

            int nonExistentKey = 999;
            boolean containsNonExistentKey = studentMap.containsKey(nonExistentKey);
            System.out.println("Does the map contain key " + nonExistentKey + "? " + containsNonExistentKey); //

            // 6. Check if the value is in the Map
            String valueToCheck = "Bob Johnson";
            boolean containsValue = studentMap.containsValue(valueToCheck);
            System.out.println("\nDoes the map contain value '" + valueToCheck + "'? " + containsValue); //

            String nonExistentValue = "Peter Pan";
            boolean containsNonExistentValue = studentMap.containsValue(nonExistentValue);
            System.out.println("Does the map contain value '" + nonExistentValue + "'? " + containsNonExistentValue); //

            // 7. Check if the map is empty
            boolean isEmpty = studentMap.isEmpty();
            System.out.println("\nIs the student map empty? " + isEmpty); //

            // 8. Print the size of the Map to the console
            int mapSize = studentMap.size();
            System.out.println("\nSize of the student map: " + mapSize); //

            // 9. Print all the Keys of the map to the console (First Way: using keySet() and for-each loop)
            System.out.println("\nAll Keys of the map (using keySet() and for-each loop):"); //
            for (Integer id : studentMap.keySet()) { //
                System.out.println(id); //
            }

            // 10. Print all the Keys of the map to the console (Second Way: using entrySet() and iterator)
            System.out.println("\nAll Keys of the map (using entrySet() and iterator):"); //
            for (Map.Entry<Integer, String> entry : studentMap.entrySet()) { //
                System.out.println(entry.getKey()); //
            }

            // 11. Remove a specific Key-value pair
            int keyToRemove = 108;
            String removedName = studentMap.remove(keyToRemove);
            System.out.println("\nRemoved student with ID " + keyToRemove + ": " + removedName); //
            System.out.println("Map after removing entry " + keyToRemove + ": " + studentMap); //

            // 12. Copy all the elements of the Map to another Map
            java.util.HashMap<Integer, String> anotherStudentMap = new java.util.HashMap<>();
            anotherStudentMap.putAll(studentMap); //
            System.out.println("\nAnother Student Map (copied from original): " + anotherStudentMap); //

            // Demonstrate that modifying the new map doesn't affect the original (shallow copy behaviour with immutable types)
            anotherStudentMap.put(200, "New Student");
            System.out.println("Original Map after modifying copied map: " + studentMap); //
            System.out.println("Modified Copied Map: " + anotherStudentMap); //
        }
    }

