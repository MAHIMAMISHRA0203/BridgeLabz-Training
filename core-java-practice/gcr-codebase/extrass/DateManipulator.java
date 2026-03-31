import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String dateString = scanner.nextLine();
        scanner.close();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate initialDate = LocalDate.parse(dateString, formatter);

            System.out.println("\nOriginal Date: " + initialDate.format(formatter));

            LocalDate intermediateDate = initialDate
                    .plusDays(7)
                    .plusMonths(1)
                    .plusYears(2);

            System.out.println("Date after adding 7 days, 1 month, and 2 years: " + intermediateDate.format(formatter));

            LocalDate finalDate = intermediateDate.minusWeeks(3);

            System.out.println("Final date after subtracting 3 weeks: " + finalDate.format(formatter));

        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Error: Invalid date format. Please use YYYY-MM-DD.");
        }
    }
}
