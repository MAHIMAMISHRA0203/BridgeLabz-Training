import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Sandeep,Let us start ");
        int count = 0;
        int n = 0;
        while (n < 7) {

            System.out.printf("How many pushup did you do on day %d", n);
            n++;
            count += sc.nextInt();

        }
        System.out.printf("The total pushups are :%d", count);
    }
}
