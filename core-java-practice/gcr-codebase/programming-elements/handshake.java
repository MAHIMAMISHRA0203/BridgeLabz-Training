import java.util.Scanner ;
public class handshake{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int noofstudents=sc.nextInt();
		System.out.printf("The number of hanshake are "+(noofstudents*(noofstudents-1))/2);
	}
}
