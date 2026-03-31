public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i > 0) {
            int temp = number % 10;
            number /= 10;
            sum += temp;

        }
        if (sum / 3 == 0)
            System.out.println("It is a Hardhad Number");
        else
            System.out.println("It is not a Harshad Number");
    }

}
