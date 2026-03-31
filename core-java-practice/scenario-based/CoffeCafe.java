
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("********----------Welcome to THE COFFEE CHRONICLES----------*********");

        System.out.println("Chai: Rs. 50\n"
                + "Espresso: Rs. 450\n" +
                "Americano:Rs. 400\n" +

                "Cappuccino:Rs. 350\n" +

                "Latte:Rs. 325\n" +

                "Mocha:Rs. 300");

        while (true) {
            System.out.print("Which coffee do you need:");
            String type = sc.next();
            if (type.equals("exit")) {
                System.out.println("TATA");
                return;
            }
            System.out.print("May I know the Quantity please:");
            int qty = sc.nextInt();
            type = type.toLowerCase();
            switch (type) {
                case "espresso":
                    System.out.println("Your bill is:" + (450 * qty) / 5);
                case "americano":
                    System.out.println("Your bill is:" + (400 * qty) / 5);
                    System.out.println("Thankyou for ordering from us .");
                    break;

                case "capucchino":
                    System.out.println("Your bill is:" + (350 * qty) / 5);
                    System.out.println("Thankyou for ordering from us .");
                    break;

                case "latte":
                    System.out.println("Your bill is:" + (325 * qty) / 5);
                    System.out.println("Thankyou for ordering from us .");
                    break;

                case "mocha":
                    System.out.println("Your bill is:" + (300 * qty) / 5);
                    System.out.println("Thankyou for ordering from us .");
                    break;

                case "chai":
                    System.out.println("Your bill is:" + (40 * qty) / 5);
                    System.out.println("Thankyou for ordering from us .");
                    break;

                default:
                    System.out.println("Sorry , we don't have that!!! \n Would you like to try something else ?");
                    break;

            }
        }

    }

}
