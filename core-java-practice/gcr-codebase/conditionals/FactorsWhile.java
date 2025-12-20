public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 2;
        while (i <= number / 2) {
            if (number % i == 0) {
                System.out.println(i + ":True");
            }

        }
    }

}
