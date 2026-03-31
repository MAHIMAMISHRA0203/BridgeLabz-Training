import java.util.*;

public class Factors {
    public static int[] factor(int number) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                arr.add(i);
            }
        }
        return arr;

    }

    public static int[] squareFactors(int number) {
        int sqfactors = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                sqfactors = i * i;
            }
        }
        return sqfactors;

    }

    public static int[] productOfFactors(int number) {
        int profac = 1;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                profac = profac * i;
            }
        }

        return profac;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factor(number));
        System.out.println(productOfFactors(number));

        System.out.println(sqfactors(number));

    }
}