import java.util.Random;
import java.util.Arrays;

public class FootballTeamHeight {

    // Method to generate random heights
    static int[] generateHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // 150 to 250
        }
        return heights;
    }

    // Method to find sum of heights
    static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest height
    static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min)
                min = h;
        }
        return min;
    }

    // Method to find tallest height
    static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max)
                max = h;
        }
        return max;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Player Heights (cm): " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
