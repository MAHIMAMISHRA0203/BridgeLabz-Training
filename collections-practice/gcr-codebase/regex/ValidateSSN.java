package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Pattern pattern=Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4}");
		Matcher matcher=pattern.matcher(name);
		System.out.println(matcher.matches());
		
		sc.close();
	}
}
