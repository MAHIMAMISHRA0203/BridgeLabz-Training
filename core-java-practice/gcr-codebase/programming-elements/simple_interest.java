public class simple_interest {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        double time = 3;

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + interest);

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
    }
}