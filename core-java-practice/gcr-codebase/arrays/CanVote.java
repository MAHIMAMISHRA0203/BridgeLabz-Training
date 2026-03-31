
// Write a program to take user input for the age of all 10 students in a class and check whether  the student can vote depending on his/her age  is greater or equal to 18.
import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your age :");
            age[i] = sc.nextInt();
            if (age[i] < 0)
                System.out.println("Invalid age");// as age cannot be negative
            else if (age[i] >= 18)
                System.out.printf("The person with the age %d can vote", age[i]);// as age is greater than 18
            else
                System.out.printf("The person with the age %d cannot vote", age[i]);// as age is smaller than 18

        }

    }
}
