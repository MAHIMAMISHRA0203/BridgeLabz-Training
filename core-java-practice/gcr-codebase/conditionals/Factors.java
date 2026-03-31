public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Sccanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i + ":True");
            }
        }

    }

}
