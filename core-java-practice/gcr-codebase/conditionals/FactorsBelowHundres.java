public class FactorsBelowHundres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 101) {
            System.out.println("Invalid");

        } else {
            for (int i = 0; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i + ":True");
                }
            }
        }
    }
}
