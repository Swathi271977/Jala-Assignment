/**
 * 3. Create a HashSet with at least 10 elements of type String
 *         Write program covering all the operations of HashSet
 */

package COLLECTIONS;
import java.util.Iterator; // For iterating with an Iterator

    public class HashSet {

        public static void main(String[] args) {
            // 1. Creating a HashSet and adding elements
            java.util.HashSet<String> programmingLanguages = new java.util.HashSet<>();
            programmingLanguages.add("Java");
            programmingLanguages.add("Python");
            programmingLanguages.add("JavaScript");
            programmingLanguages.add("C++");
            programmingLanguages.add("C#");
            programmingLanguages.add("PHP");
            programmingLanguages.add("Swift");
            programmingLanguages.add("Kotlin");
            programmingLanguages.add("Go");
            programmingLanguages.add("Ruby");
            programmingLanguages.add("Java"); // Attempting to add a duplicate element

            System.out.println("1. Initial HashSet: " + programmingLanguages); // Output: [C#, Go, Python, Java, JavaScript, Ruby, Swift, C++, PHP, Kotlin] (order may vary)

            // 2. Checking the size of the HashSet
            int size = programmingLanguages.size();
            System.out.println("2. Size of HashSet: " + size); // Output: 10 (duplicates are not counted)

            // 3. Checking for element existence (using contains() )
            boolean containsJava = programmingLanguages.contains("Java");
            boolean containsRust = programmingLanguages.contains("Rust");
            System.out.println("3. Contains 'Java'? " + containsJava);     // Output: true
            System.out.println("   Contains 'Rust'? " + containsRust);     // Output: false

            // 4. Removing an element (using remove() )
            programmingLanguages.remove("PHP");
            System.out.println("4. HashSet after removing 'PHP': " + programmingLanguages); // Output: [C#, Go, Python, Java, JavaScript, Ruby, Swift, C++, Kotlin] (order may vary)

            // 5. Iterating through the HashSet (using enhanced for loop)
            System.out.println("5. Iterating with for-each loop:");
            for (String lang : programmingLanguages) {
                System.out.print(lang + " "); // Output: C# Go Python Java JavaScript Ruby Swift C++ Kotlin (order may vary)
            }
            System.out.println();

            // 6. Iterating through the HashSet (using an Iterator)
            System.out.println("6. Iterating with Iterator:");
            Iterator<String> iterator = programmingLanguages.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " "); // Output: C# Go Python Java JavaScript Ruby Swift C++ Kotlin (order may vary)
            }
            System.out.println();

            // 7. Converting HashSet to an Array
            String[] languagesArray = new String[programmingLanguages.size()];
            programmingLanguages.toArray(languagesArray); // The toArray() method converts the HashSet to an array
            System.out.print("7. Converted to Array: [");
            for (int i = 0; i < languagesArray.length; i++) {
                System.out.print(languagesArray[i]);
                if (i < languagesArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]"); // Output: Converted to Array: [C#, Go, Python, Java, JavaScript, Ruby, Swift, C++, Kotlin] (order may vary)


            // 8. Checking if the HashSet is empty
            boolean isEmpty = programmingLanguages.isEmpty();
            System.out.println("8. Is HashSet empty? " + isEmpty); // Output: false


            // 9. Clearing all elements from the HashSet
            programmingLanguages.clear();
            System.out.println("9. HashSet after clearing: " + programmingLanguages); // Output: []

            // 10. Checking if the HashSet is empty after clearing
            isEmpty = programmingLanguages.isEmpty();
            System.out.println("10. Is HashSet empty after clearing? " + isEmpty); // Output: true
        }
    }

