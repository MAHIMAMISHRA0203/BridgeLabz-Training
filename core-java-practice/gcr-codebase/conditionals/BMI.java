import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter weight");
        double weight = sc.nextDouble();
        System.out.println("please enter height");

        double height = sc.nextDouble();
        double BodyMassIndex = weight / (height * height);
        if (BodyMassIndex <= 18.4) {
            System.out.println("Underweight");
        } else if (BodyMassIndex <= 18.4) {
            System.out.println("Underweight");
        } else if (BodyMassIndex >= 18.5 && BodyMassIndex < 24.9) {
            System.out.println("Underweight");
        } else if (BodyMassIndex >= 25.0 && BodyMassIndex <= 39.9) {
            System.out.println("Underweight");
        } else
            System.out.println("Obese");

    }

}
