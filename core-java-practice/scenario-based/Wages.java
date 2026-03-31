import java.util.Random;

public class Wages {

    public static void main(String[] args) {

        int wagePerHour = 20;
        int totalSalary = 0;
        Random random = new Random();

        for (int day = 1; day <= 20; day++) {

            int attendance = random.nextInt(3); // 0,1,2
            int dailySalary = 0;

            if (attendance == 0) {
                // Employee absent
                System.out.println("Day " + day + ": Absent 😴 | Salary = ₹0");

            } else if (attendance == 1) {
                // Part-time employee
                dailySalary = 4 * wagePerHour;
                System.out.println("Day " + day + ": Part-Time 🕓 | Salary = ₹" + dailySalary);

            } else {
                // Full-time employee
                dailySalary = 8 * wagePerHour;
                System.out.println("Day " + day + ": Full-Time 🕗 | Salary = ₹" + dailySalary);
            }

            totalSalary += dailySalary;
        }

        System.out.println("\n💵 Total Salary for the Month = ₹" + totalSalary);
    }
}
