public class Volume_of_cylinder {
    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5; // Rate of interest per annum
        double time = 3; // Time in years

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("Simple Interest: " + interest);

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
    }
}