public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanne(System.in);
        int counter = sc.nextInt();
        if (counter == 1)
            System.out.println(counter);
        else {
            while (counter > 0) {
                System.out.println(counter);
            }
        }
    }

}
