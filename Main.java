public class Main {
    public static void main(String[] args) {
        // Test Data 1
        byte[] array1 = {5, 8, 3, 12, 6};
        System.out.println("Test Data 1: Maximum Element = " + findMaximum(array1));

        // Test Data 2
        byte[] array2 = {-10, -3, -7, -1};
        System.out.println("Test Data 2: Maximum Element = " + findMaximum(array2));
    }

    public static byte findMaximum(byte[] array) {
        // Initialize max with the first element
        byte max = array[0];

        // Loop through the array to find the maximum
        for (byte num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
