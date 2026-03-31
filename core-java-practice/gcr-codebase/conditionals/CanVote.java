import java.util.Scanner;

public class CanVote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your age");

        int yourAge = sc.nextInt();
        if (yourAge > 18)
            System.out.printf("The persons age is  %d and can vote", yourAge);
        else {
            System.out.printf("The persons age is  %d and can't vote", yourAge);
        }
    }
}
