public class AthleteRun {
    public static double round(int sideone, int sidetwo, int sidethree) {
        int perimeter = sideone + sidetwo + sidethree;
        return perimeter / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sideone = sc.nexInt();
        int sidetwo = sc.nextInt();
        int sidethree = sc.nextInt();
        System.out.println(round(sideone, sidetwo, sidethree));

    }

}
