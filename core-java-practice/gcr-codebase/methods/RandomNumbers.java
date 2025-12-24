import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

    static int[] generate4DigitRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + r.nextInt(9000);
        return arr;
    }

    static double[] findAverageMinMax(int[] nums) {
        int min = nums[0], max = nums[0], sum = 0;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            sum += n;
        }
        return new double[] { (double) sum / nums.length, min, max };
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(arr);

        System.out.println("Numbers: " + Arrays.toString(arr));
        System.out.println("Average: " + result[0]);
        System.out.println("Min: " + result[1]);
        System.out.println("Max: " + result[2]);
    }
}
