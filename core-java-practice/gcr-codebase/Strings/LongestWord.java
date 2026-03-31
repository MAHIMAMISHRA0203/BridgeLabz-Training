import java.util.Scanner;

public class LongestWord {

    // Method to find longest word
    public static String findLongestWord(String sentence) {

        // Trim sentence and split into words
        String[] words = sentence.trim().split("\\s+");

        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String longest = findLongestWord(sentence);

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());

    }
}
