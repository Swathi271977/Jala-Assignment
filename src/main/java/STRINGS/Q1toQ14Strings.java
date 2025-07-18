/**
 * Strings Assignment 01 - 14 Problems
 */
package STRINGS;
public class Q1toQ14Strings {

    public static void main(String[] args) {

            // 1. Different ways of creating a String
            System.out.println("\n1. Different ways creating a string");
            String str1 = "Java String"; // String literal
            String str2 = new String("Java Object String"); // String using new keyword
            char[] charArray = {'J', 'A', 'V', 'A'};
            String str3 = new String(charArray); // From character array
            byte[] byteArray = {74, 65, 86, 65};
            String str4 = new String(byteArray); // From byte array
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str4);

            // 2. Concatenating two strings using + operator
            System.out.println("\n2. Concatenating two strings using + operator");
            String first = "Hello";
            String second = "World";
            String full = first + " " + second;
            System.out.println(full);

            // 3. Finding the length of the string
            System.out.println("\n3. Finding the length of the string");
            String s = "LengthExample";
            System.out.println("Length: " + s.length());

            // 4. Extract a string using Substring
            System.out.println("\n4. Extract a string using Substring");
            String original = "ExtractThisText";
            String sub1 = original.substring(7);
            String sub2 = original.substring(0, 7);
            System.out.println("Substring from index 7: " + sub1);
            System.out.println("Substring (0 to 7): " + sub2);

            // 5. Searching in strings using indexOf()
            System.out.println("\n5. Searching in strings using indexOf()");
            String searchStr = "Java Programming Language";
            System.out.println("Index of 'Programming': " + searchStr.indexOf("Programming"));
            System.out.println("Index of 'a' after index 5: " + searchStr.indexOf("a", 5));

            // 6. Matching a String Against a Regex With matches()
            System.out.println("\n6. Matching a String Against a Regex");
            String matchStr = "Code123";
            System.out.println("Matches regex '[A-Za-z0-9]+': " + matchStr.matches("[A-Za-z0-9]+"));

            // 7. Comparing strings using equals()
            System.out.println("\n7. Comparing strings using equals()");
            String cmp1 = "Java";
            String cmp2 = "java";
            System.out.println("Equals: " + cmp1.equals(cmp2));
            System.out.println("Equals Ignore Case: " + cmp1.equalsIgnoreCase(cmp2));
            System.out.println("Starts with 'Ja': " + cmp1.startsWith("Ja"));
            System.out.println("Ends with 'va': " + cmp1.endsWith("va"));
            System.out.println("CompareTo: " + cmp1.compareTo(cmp2));

            // 8. equalsIgnoreCase(), startsWith(), endsWith(), compareTo() — already covered above

            // 9. Trimming strings with trim()
            System.out.println("\n9. Trimming strings with trim()");
            String trimStr = "   Hello Trim!   ";
            System.out.println("Before Trim: '" + trimStr + "'");
            System.out.println("After Trim: '" + trimStr.trim() + "'");

            // 10. Replacing characters with replace()
            System.out.println("\n10. Replacing characters in strings with replace()");
            String replaceStr = "banana";
            System.out.println("Replace 'a' with 'o': " + replaceStr.replace('a', 'o'));

            // 11. Splitting strings with split()
            System.out.println("\n11. Splitting strings with split()");
            String splitStr = "apple,banana,grape";
            String[] fruits = splitStr.split(",");
            for (String fruit : fruits) {
                System.out.println("Fruit: " + fruit);
            }

            // 12. Converting Numbers to Strings with valueOf()
            System.out.println("\n12. Converting Numbers to Strings with valueOf()");
            int num = 123;
            String numStr = String.valueOf(num);
            System.out.println("Number as String: " + numStr);

            // 13. Converting Integer objects to Strings
            System.out.println("\n13. Converting integer objects to Strings");
            Integer i = 456;
            String intStr = i.toString();
            System.out.println("Integer to String: " + intStr);

            // 14. Converting to uppercase and lowercase
            System.out.println("\n14. Converting to uppercase and lowercase");
            String up = "hello world";
            String low = "JAVA CODE";
            System.out.println("Uppercase: " + up.toUpperCase());
            System.out.println("Lowercase: " + low.toLowerCase());
        }
    }


