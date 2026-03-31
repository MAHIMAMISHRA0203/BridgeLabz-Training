import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerDigits {

    // Count digits
    public static int countDigits(int number) {
        number = Math.abs(number);
        return String.valueOf(number).length();
    }

    // Store digits in array
    public static int[] storeDigits(int number) {
        number = Math.abs(number);
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    // Reverse digits array
    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }

    // Compare two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    // Check palindrome
    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseDigits(digits));
    }

    // Check Duck number (contains zero)
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0)
                return true;
        }
        return false;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);

        System.out.println("\nDigit Count: " + count);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        System.out.println("Palindrome Number: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));

        sc.close();
    }
}
