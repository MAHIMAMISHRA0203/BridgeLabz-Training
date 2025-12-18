import java.util.Scanner;
public class calculator{
	public static void main(String[]args) {
	Scanner sc=new Scanner (System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int add=a+b;
	int sub=a-b;
	int mul=a*b;
	int div=a/b;
	System.out.printf("The addition , subtarction, multiplication and division is %d,%d,%d and %d  ", add, sub,mul,div);
	}
}