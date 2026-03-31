import java.util.Scanner;

public class StudentGradeTwoD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            grade[i] = percent[i] >= 75 ? 'A' : percent[i] >= 60 ? 'B' : 'C';
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + " " + grade[i]);
        }

        sc.close();
    }
}
