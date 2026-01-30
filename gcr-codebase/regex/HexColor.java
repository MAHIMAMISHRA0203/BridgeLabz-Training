package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColor {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String hexColor=sc.next();
		Pattern pattern=Pattern.compile("^#[0-9A-Fa-f]{6}$");
		Matcher matcher=pattern.matcher(hexColor);
		System.out.println(matcher.matches());
	}
}
