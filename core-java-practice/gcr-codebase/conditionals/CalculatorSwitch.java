import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");

        double number1 = sc.nextDouble();
        System.out.println("Enter anothe number");

        double number2 = sc.nextDouble();
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(a + b);
            case "-":
                System.out.println(a - b);
            case "*":
                System.out.println(a * b);
            case "/":
                System.out.println(a / b);
            case "%":
                System.out.println(a % b);
        }

    }

}
