public class IsPositiveOrNegativeOrZero {
    public static void main(Sting args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive");

        } else if (number == 0) {
            System.out.println("Zero");

        } else
            System.out.println("Negative");

    }

}
