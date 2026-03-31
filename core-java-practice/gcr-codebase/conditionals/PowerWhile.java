public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pow = sc.nextInt();
        int power = 1;
        int i = 1;
        while (i < pow + 1) {
            power = number * number;
        }
        System.out.println(power);
    }

}
