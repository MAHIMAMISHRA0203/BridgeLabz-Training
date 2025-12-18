import java.util.Scanner;
public class input_university_discount{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int fees=sc.nextInt();
		int discountpercentage =sc.nextInt();
		double discount=(discountpercentage*125000)/100;
		System.out.println("The  fee after discount is:"+(fees-discount));
		
	}
}