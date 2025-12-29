import java.util.Scanner ;
public class Handshake{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int noOfStudents=sc.nextInt();
		System.out.printf("The number of hanshake are "+(noOfStudents*(noOfStudents-1))/2);
	}
}
