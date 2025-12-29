import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter marks of student " + (i + 1));

            System.out.print("Physics: ");
            double physics = sc.nextDouble();

            System.out.print("Chemistry: ");
            double chemistry = sc.nextDouble();

            System.out.print("Maths: ");
            double maths = sc.nextDouble();

            // calculate percentage
            percentage[i] = (physics + chemistry + maths) / 3;

            // calculate grade
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("\nResult:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Student " + (i + 1) +
                            " | Percentage = " + percentage[i] +
                            " | Grade = " + grade[i]);
        }

        sc.close();
    }
}
