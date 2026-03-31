import java.util.Scanner;

public class UpperCaseUsingAscii {

    public static String convertToUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String customUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Converted text: " + customUpper);
        System.out.println("Result matched: " +
                compareStrings(customUpper, builtInUpper));
    }
}
