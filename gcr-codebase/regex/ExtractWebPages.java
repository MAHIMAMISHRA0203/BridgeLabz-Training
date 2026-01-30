package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWebPages {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Pattern pattern=Pattern.compile("[//www.[a-z]+\\.com]|[http://[a-z]+\\.org]");
		Matcher matcher=pattern.matcher(s);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
