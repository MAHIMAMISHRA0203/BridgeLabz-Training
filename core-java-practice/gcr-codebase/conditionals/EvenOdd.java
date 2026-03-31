public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % 2 == 0) {
                System.out.printf("E %d:Even", i);
            } else {
                System.out.println("%d:Odd", i);
            }
        }
    }

}
