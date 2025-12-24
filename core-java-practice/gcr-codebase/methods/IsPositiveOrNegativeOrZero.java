public class IsPositiveOrNegativeOrZero {
    public static Strinng positiveOrNegativeOrZero(int n) {
        if (n == 0)
            return "Zero";
        if (n > 0)
            return "Positive";
        else
            return "Negative";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        System.out.println(positiveOregativeOrZero(number));

    }

}
