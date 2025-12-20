public class ArraySum {

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double arr[] = new double[10];
        double total = 0.0;
        int i = 0;

        while (true) {

            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // stop if number is 0 or negative
            if (num <= 0) {
                break;
            }

            // stop if array is full
            if (i == 10) {
                break;
            }

            arr[i] = num;
            i++;
        }

        System.out.println("\nNumbers entered:");
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
            total = total + arr[j];
        }

        System.out.println("\nSum = " + total);

        sc.close();
    }
}
