package OPERATORS;

/**
 * 5. Programs on Logical AND,OR operator and Logical NOT
 */


public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        // AND operator examples
        System.out.println("AND examples:");
        System.out.println((c > a) && (c > b));        // true && true = true
        System.out.println((c > a) && (c < b));        // true && false = false
        System.out.println((a > b) && (++b > c));      // false && ... (b not incremented due to short-circuit)
        System.out.println("b after short-circuiting AND: " + b);

        // OR operator examples
        System.out.println("\nOR examples:");
        b = 20; // reset
        System.out.println((a < b) || (c < a));        // true || false = true
        System.out.println((a > b) || (c < a));        // false || false = false
        System.out.println((a < b) || (++b < c));      // true || ... (b not incremented)
        System.out.println("b after short-circuiting OR: " + b);

        // NOT operator examples
        System.out.println("\nNOT examples:");
        System.out.println("!(a < b) = " + !(a < b));  // false -> true
        System.out.println("!(c > b) = " + !(c > b));  // true -> false
    }
}
