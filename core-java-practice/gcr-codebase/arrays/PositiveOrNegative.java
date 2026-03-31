// Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter your number:");
            number[i] = sc.nextInt();

            if (number[i] > 0) {
                if (number[i] % 2 == 0)
                    System.out.println("The number  is positive and even");// as the number is completely divided by 2
                                                                           // and is greater than 0
                else
                    System.out.println("The number  is positive and odd");// as the number is completely divided by 2
                                                                          // and is greater than 0

            } else if (numbers[i] == 0) {
                System.out.println("Zero");

            } else
                System.out.println("Negative");
        }
        if (number[0] > number[4])
            System.out.println("The first number is greatre than last number ");
        else
            System.out.println("The last number is greatre than first number ");

    }

}
