public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            int temp = number % 10;
            number /= 10;
            sum += temp;

        }
        if (sum > number)
            System.out.println("It is a Abundant Number");
        else
            System.out.println("It is not a Abundant Number");

    }

}
