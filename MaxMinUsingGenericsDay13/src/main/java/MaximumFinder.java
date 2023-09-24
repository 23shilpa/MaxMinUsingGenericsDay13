
public class MaximumFinder {

    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        // Test Case 1: Find maximum among three strings
        String maxString1 = findMax("Apple", "Peach", "Banana");
        System.out.println("Test Case 1: Maximum string is " + maxString1); // Expected output: "Peach"

        // Test Case 2: Find maximum among three strings (different order)
        String maxString2 = findMax("Peach", "Apple", "Banana");
        System.out.println("Test Case 2: Maximum string is " + maxString2); // Expected output: "Peach"

        // Test Case 3: Find maximum among three strings (different order)
        String maxString3 = findMax("Banana", "Peach", "Apple");
        System.out.println("Test Case 3: Maximum string is " + maxString3); // Expected output: "Peach"
    }
}