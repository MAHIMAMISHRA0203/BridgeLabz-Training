package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidareCreditCardNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Pattern pattern=Pattern.compile("(^4[0-9]{15}$|^5[0-9]{15}$)");
		Matcher matcher=pattern.matcher(name);
		System.out.println(matcher.matches());
		
		sc.close();
	}
}
