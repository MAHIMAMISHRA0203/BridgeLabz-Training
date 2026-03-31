import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int height =sc.nextInt();
		int base=sc.nextInt();
		System.out.printf("The area of triangle in inches is %f and in centimeter is %f ",(0.5*base*height),(0.5*base*height)*0.3937);
	}
}