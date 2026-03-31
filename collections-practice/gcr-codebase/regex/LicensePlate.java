package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlate {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String plateNumberString=sc.next();
	Pattern pattern=Pattern.compile("^[A-Z]{2}[0-9]{4}");
	Matcher matcher=pattern.matcher(plateNumberString);
	System.out.println(matcher.matches());
}
}
