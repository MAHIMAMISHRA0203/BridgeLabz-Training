public class RemainderAndQuotient {
    public static String remandquo(int number, int divisor) {
        return "The quotient and remainder are :" + (number % divisor) + " " + (number / divisor);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println(remAndQuo(number, divisor));
    }
}