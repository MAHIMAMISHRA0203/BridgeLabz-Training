package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIP {
	public static void mai(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Pattern pattern=Pattern.compile("^^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}\r\n"
				+ "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$\r\n"
				+ "");
		Matcher matcher=pattern.matcher(name);
		System.out.println(matcher.matches());
		
		sc.close();
	}
}
