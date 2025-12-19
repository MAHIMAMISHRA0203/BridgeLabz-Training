import java.util.Scanner;
public class TotalPrice{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int unitPrice=sc.nextInt();
		int quantity=sc.nextInt();
		System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR %d",unitPrice*quantity , quantity , unitPrice  );
	}
}