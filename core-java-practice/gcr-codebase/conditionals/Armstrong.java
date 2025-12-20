public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            int temporaryVariable = number % 10;
            number /= 10;
            sum += temporaryVariable * temporaryVariable;

        }
        if (sum == number)
            System.out.println("The number is armstrong ");
        else
            System.out.println("The number is  not armstrong ");
    }

}
