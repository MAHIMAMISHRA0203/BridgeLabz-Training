package Regex;

import java.util.Scanner;

public class BadWords {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String badWords[]= {"stupid","bad"};
		for(String st:badWords)
			s = s.replaceAll("\\b" + st + "\\b", "*".repeat(st.length()));
		System.out.println(s);
		
	}
}
