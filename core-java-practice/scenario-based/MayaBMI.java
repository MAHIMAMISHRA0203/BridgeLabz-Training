public class MayaBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I know your weight please:");
        double weight = sc.nextDouble();
        System.out.print("May I know your height  please:");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        if (bmi <= 18.4) {
            System.out.println("  YOu Are Underweight");
        } else if (bmi <= 18.4) {
            System.out.println(" YOu Are ");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println(" YOu Are Underweight");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println(" YOu Are Normal");
        } else
            System.out.println(" YOu Are Obese");
    }

}
