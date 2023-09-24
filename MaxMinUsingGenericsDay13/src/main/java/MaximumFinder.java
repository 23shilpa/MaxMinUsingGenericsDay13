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

        Integer max1 = findMax(7, 4, 2);
        System.out.println("Test Case 1: Max is " + max1); //


        Integer max2 = findMax(3, 9, 1);
        System.out.println("Test Case 2: Max is " + max2); //


        Integer max3 = findMax(5, 2, 8);
        System.out.println("Test Case 3: Max is " + max3);
    }
}