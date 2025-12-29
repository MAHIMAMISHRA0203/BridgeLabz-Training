import java.util.Scanner;
public class InputUniversityDiscount{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int fees=sc.nextInt();
		int discountPercentage =sc.nextInt();
		double discount=(discountPercentage*125000)/100;
		System.out.println("The  fee after discount is:"+(fees-discount));
		
	}
}