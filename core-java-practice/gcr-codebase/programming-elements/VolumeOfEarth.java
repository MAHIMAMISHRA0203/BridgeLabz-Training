import java.util.*;
public class VolumeOfEarth{
	public static void main(String args[]) {
		int radius=6378;
		double volume=(4/3) *Math.PI * radius*radius*radius;
		System.out.println("The voule of earth is:"+volume);
	}
}