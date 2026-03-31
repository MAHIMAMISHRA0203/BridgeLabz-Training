package StringLengthChecker;

import java.util.function.Function;


public class Main {
public static void main(String args[]) {
	String string="jfnwf";
	Function<String,Integer> stringlength=s->s.length();
	System.out.println(stringlength.apply(string));		
}
}
