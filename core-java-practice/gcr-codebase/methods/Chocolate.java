public class Chocolate {
    public static String chocolates(int childern, int totalChocolates) {
        int rem = 0;
        for (int i = childern; i >= 1; i--) {
            if (totalChocolates % childern == 0) {
                return "Number of chocolate each childern would get is " + i + " the remaining chocolate is" + rem;
            } else {
                rem++;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int childern = sc.nextInt();
        int totalChocolates = sc.nextInt();
        System.out.println(chocolates(childern, totalChocolates));
    }
}