public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 100;
        int sum = 0;
        while (i != 0) {
            i = sc.nextInt();
            sum += i;
        }

        System.out.println(sum);
    }

}
