import java.util.Scanner;

public class CanVote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18)
            System.out.printf("The persons age is  %d and can vote");
        else {
            System.out.printf("The persons age is  %d and can't vote");
        }
    }
}
