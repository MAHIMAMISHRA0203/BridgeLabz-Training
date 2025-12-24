public class SpringSeason {
    public static String isSpring(String month, int date) {
        if ((month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20)) {

            return "Its a Spring Season";
        } else {
            return "Not a Spring Season";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        int date = sc.nextInt();
        System.out.println(isSpring(month, date));
    }

}
