
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;

public class wages {
    public static String isPresent(char ch) {

        if (ch == 'A') {
            return "Absent ";

        } else
            return "present ";
    }

    public static int partTimeWage(int wagePerHour, int hours) {
        return wagePerHour * hours;
    }

    public static int wages(int wagePerHour, int hours) {
        return wagePerHour * hours;
    }

    public static int wagesPerMonth(int days, int wage) {
        return days * 8 * wage;
    }

    public static int usageWage(int hours, int wage) {
        return hours * wage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Wage Computation ");
        Random ran = new Random();

        String aOrp = isPresent('A');
        int totalWages = wages(20, 8);
        int partTimeWages = partTimeWage(10, 8);
        int usageWage = usageWage(100, 20);
        System.out.println(totalWages);
        System.out.println(partTimeWages);
        System.out.println(usageWage);

    }
}