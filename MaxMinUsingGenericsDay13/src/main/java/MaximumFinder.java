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
        // Test Case: Find maximum among three floats
        Float maxFloat = findMax(7.5f, 4.3f, 9.8f);
        System.out.println("Maximum float is " + maxFloat); // Expected output: 9.8
    }
}