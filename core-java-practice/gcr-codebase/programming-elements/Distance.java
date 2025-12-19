import java.util.Scanner ;
public class Distance{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int distanceinfeet =sc.nextInt();
		System.out.printf("The distance in mile is %d and in yards is %d ", (distanceinfeet/3),distanceinfeet/5280);
		
	}
}