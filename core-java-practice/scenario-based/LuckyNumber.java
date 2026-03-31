
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Festival Lucky Draw");

        do {
            System.out.print("please enter your number:");
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("thankyou for playing with us ");
                break;
            }
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("YAY!! You won .");

            } else {
                System.out.println("Please try again later");
            }

        } while (true);

    }
}