import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter students count: ");
        int n = sc.nextInt();

        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            double phy = sc.nextDouble();
            double chem = sc.nextDouble();
            double math = sc.nextDouble();

            percent[i] = (phy + chem + math) / 3;

            if (percent[i] >= 75)
                grade[i] = 'A';
            else if (percent[i] >= 60)
                grade[i] = 'B';
            else
                grade[i] = 'C';
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + " " + grade[i]);
        }

        sc.close();
    }
}
