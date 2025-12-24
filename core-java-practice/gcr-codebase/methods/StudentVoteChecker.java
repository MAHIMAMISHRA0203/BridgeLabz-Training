import java.util.Scanner;

public class StudentVoteChecker {

    static boolean canStudentVote(int age) {
        if (age < 0)
            return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter age of student " + i + ": ");
            int age = sc.nextInt();

            if (canStudentVote(age))
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }
    }
}
