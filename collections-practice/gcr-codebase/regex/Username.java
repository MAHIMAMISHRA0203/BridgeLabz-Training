package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	Pattern pattern=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_]{5,15}$");
	Matcher matcher=pattern.matcher(name);
	System.out.println(matcher.matches());
	
	sc.close();
}
}
