package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReplaceSpaces {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String resultString=s.replaceAll("\\s+"," ");
	System.out.println(s);
	System.out.println(resultString);
}}
