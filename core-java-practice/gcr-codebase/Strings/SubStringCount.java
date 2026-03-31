import java.util.Scanner;

public class SubstringCount {

    // Method to count occurrences of a substring
    public static int countSubstring(String text, String sub) {

        if (sub.length() == 0) {
            return 0; // avoid infinite loop
        }

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); // move past current match
        }

        return count;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        int result = countSubstring(text, sub);

        System.out.println("Substring occurs " + result + " times.");

        sc.close();
    }
}
