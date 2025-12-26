
import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character
    public static char findMostFrequentChar(String str) {

        int[] freq = new int[256]; // ASCII character frequency

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find max frequency
        int max = 0;
        char result = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }

        return result;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char mostFrequent = findMostFrequentChar(input);

        System.out.println("Most frequent character: " + mostFrequent);

        sc.close();
    }
}
