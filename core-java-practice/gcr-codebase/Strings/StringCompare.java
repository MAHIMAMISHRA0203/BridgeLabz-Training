import java.util.Scanner;

public class StringCompare {

    public static boolean compareUsingCharAt(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.next();

        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        boolean customResult = compareUsingCharAt(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("charAt() comparison: " + customResult);
        System.out.println("equals() comparison: " + builtInResult);
    }
}
