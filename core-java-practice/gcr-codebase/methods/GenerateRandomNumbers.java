import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class GenerateRandomNumbers {

    public static int[] generateRandomNumbers() {

        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();

        int min = 100000;
        int max = 999999;

        while (list.size() < 10) {
            int randomInt = ran.nextInt(max - min + 1) + min;

            if (isUnique(list, randomInt)) {
                list.add(randomInt);
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // Check uniqueness
    public static boolean isUnique(ArrayList<Integer> list, int randomNum) {
        return !list.contains(randomNum);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateRandomNumbers()));
    }
}
