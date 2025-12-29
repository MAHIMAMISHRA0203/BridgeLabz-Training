public class PollingBoothManager {
    public static void main(String args[]) {

        Scanner sc = new Scanner(
                System.in);
        System.out.println("Jaaniye apni parties ko:");
        System.out.println("1. Kaam Karenge");
        System.out.println("2. Sirf Baat Karenge Kaam nahi ");
        System.out.println("3. Kuch nahi karenge ");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        while (true) {
            System.out.println("Please enter your age:");
            int age = c.nextInt();
            if (age >= 18) {
                System.out.println("Please enter your party number.");
                int vote = sc.nextInt();
                if (vote == 1)
                    one++;
                else if (vote == 2)
                    two++;
                else if (vote == 3)
                    three++;
                else
                    System.out.println("Not existent party");
            } else {
                System.out.println("Sorrry , you are  not eligible for vote as you are below 18.");
            }

        }
    }

}