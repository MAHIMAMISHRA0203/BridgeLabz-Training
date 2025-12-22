import java.util.Scanner;

public class NumberFormatExceptions {

    public static void generateException(String text) {
        Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (RuntimeException e) {
            System.out.println("Runtime exception occurred");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as text: ");
        String input = scanner.next();

        // generateException(input);
        handleException(input);
    }
}
