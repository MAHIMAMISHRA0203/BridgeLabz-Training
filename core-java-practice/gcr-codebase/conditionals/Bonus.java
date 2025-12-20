public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int years = sc.nextInt();
        int bonus = 0;
        if (years > 5)
            bonus = (5 * salary) / 100;
        System.out.println(bonus);

    }

}
