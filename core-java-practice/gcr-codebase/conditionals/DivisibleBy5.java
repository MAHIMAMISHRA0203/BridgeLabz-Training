import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        bool isdiv = number % 5 == 0 ? true : False;
        System.out.println("Is the number divisible by 5? " + isdiv);

    }
}
