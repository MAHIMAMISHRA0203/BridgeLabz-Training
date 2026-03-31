import java.util.Scanner;

public class RocketLaunchWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        if (counter == 1) {
            System.out.println(counter);
        } else {
            for (int i = counter; i > 0; i--) {
                System.out.println(counter);
            }
        }

    }

}
