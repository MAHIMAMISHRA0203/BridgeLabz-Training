import java.util.Scanner;

public class NumberGuessing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int n = sc.nextInt();
        int roll = (int) (Math.random() * (max - min + 1) + min);
        while (roll != n) {
            if (roll > n)
                System.out.println("Go higher");
            else
                System.out.println("Go lower");

        }
        System.out.println("correct");

    }
}