import java.util.Scanner ;
public class Distance{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int distanceInFeet =sc.nextInt();
		System.out.printf("The distance in mile is %d and in yards is %d ", (distanceInFeet/3),distanceInFeet/5280);
		
	}
}