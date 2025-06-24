public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {33, 20, 30, 15, 15};

        int result = findSum(numbers, 0);

        System.out.println("Sum of Array Elements: " + result);
    }

    public static int findSum(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + findSum(arr, index + 1);
    }
}
