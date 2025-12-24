import java.util.Scanner;

public class NumberChecker {

    // Count digits
    static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Store digits in array
    static int[] storeDigits(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        return digits;
    }

    // Check Duck Number
    static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0)
                return true;
        }
        return false;
    }

    // Check Armstrong Number
    static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    // Find largest & second largest
    static void findLargestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }

    // Find smallest & second smallest
    static void findSmallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Digit Count: " + digitCount);
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));

        findLargestSecondLargest(digits);
        findSmallestSecondSmallest(digits);
    }
}
