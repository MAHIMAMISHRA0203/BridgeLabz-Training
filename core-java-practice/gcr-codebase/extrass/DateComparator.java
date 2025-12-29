import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Define the expected date format (e.g., 2025-12-25)
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

        System.out.println("Enter the first date (YYYY-MM-DD): ");
        String dateInput1 = scanner.nextLine();

        System.out.println("Enter the second date (YYYY-MM-DD): ");
        String dateInput2 = scanner.nextLine();

        try {
            // Parse the input strings into LocalDate objects
            LocalDate date1 = LocalDate.parse(dateInput1, formatter);
            LocalDate date2 = LocalDate.parse(dateInput2, formatter);

            // Compare the dates using the provided methods
            if (date1.isBefore(date2)) {
                System.out.println("Result: The first date is BEFORE the second date.");
            } else if (date1.isAfter(date2)) {
                System.out.println("Result: The first date is AFTER the second date.");
            } else if (date1.isEqual(date2)) {
                System.out.println("Result: The first date is the SAME as the second date.");
            } else {
                // This branch should theoretically never be reached with LocalDate
                System.out.println("Result: The dates could not be compared.");
            }

        } catch (DateTimeParseException e) {
            System.err.println("Error: Invalid date format entered. Please use YYYY-MM-DD.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
