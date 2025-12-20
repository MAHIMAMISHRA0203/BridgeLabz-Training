public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i > 0) {
            int temp = number % 10;
            number /= 10;
            sum += temp * temp;

        }
        if (sum == number)
            System.out.println("The number is armstrong ");
        else
            System.out.println("The number is  not armstrong ");
    }

}
