import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = Integer.parseInt(in.nextLine());
        System.out.print("Enter year: ");
        int year = Integer.parseInt(in.nextLine());
        System.out.print("Starting day: ");
        String day = in.next().toLowerCase();
        int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
            m[1] = 29;
        }
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        int start = 0;
        switch (day) {
            case "sunday":
                start = 0;
                break;
            case "monday":
                start = 1;
                break;
            case "tuesday":
                start = 2;
                break;
            case "wednesday":
                start = 3;
                break;
            case "thursday":
                start = 4;
                break;
            case "friday":
                start = 5;
                break;
            case "saturday":
                start = 6;
                break;
        }
        int count = 0;
        for (int i = 1; i <= start; i++) {
            System.out.print("\t");
            count++;
        }
        for (int i = 1; i <= m[month - 1]; i++) {
            if (count % 7 == 0)
                System.out.println();
            System.out.print(i + "\t");
            count++;
        }
    }
}