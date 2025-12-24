public class SumOfN {
    public static int sum(int n) {
        int sumn = 0;
        for (int i = 0; i <= n; i++) {
            sumn += i;

        }
        return sumn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sum(number));
    }

}
