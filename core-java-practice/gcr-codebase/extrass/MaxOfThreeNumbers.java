import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static int getInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        // Ensure that the input is an integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            System.out.print(prompt);
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }

    public static int calculateMax(int num1, int num2, int num3) {

        return Math.max(Math.max(num1, num2), num3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take three integer inputs from the user using the getInput function
        int number1 = getInput("Enter the first integer: ", scanner);
        int number2 = getInput("Enter the second integer: ", scanner);
        int number3 = getInput("Enter the third integer: ", scanner);

        // Calculate the maximum value using the calculateMax function
        int maximum = calculateMax(number1, number2, number3);

        // Print the result
        System.out.println("The maximum of the three numbers is: " + maximum);

        // Close the scanner
        scanner.close();
    }
}
