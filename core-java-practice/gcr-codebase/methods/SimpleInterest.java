public class SimpleInterest {
    public static double simpleInterest(double principle, double rate, double time) {
        return (principle * rate * time) / 100.0;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        System.out.println(simpleInterest(principle, rate, time));
    }
}
