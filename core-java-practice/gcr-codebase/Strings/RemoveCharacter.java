import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove a specific character
    public static String removeCharacter(String str, char ch) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String output = removeCharacter(input, ch);

        System.out.println("String after removing '" + ch + "': " + output);

        sc.close();
    }
}
