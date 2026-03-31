public class MultipleUntilHund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int mul = 1;
        int i = 1;
        while (mul < 101) {

            System.out.println(number * i);
            i++;
        }
    }

}
