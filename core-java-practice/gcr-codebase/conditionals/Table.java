public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.printf("%d * %d = %d", number, i, number * i);
        }
    }
}
