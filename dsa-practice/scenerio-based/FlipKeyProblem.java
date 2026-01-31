package scenerioBased;

import java.util.Scanner;

public class FlipKeyProblem {
	public static String cleansAndInvert(String s) {
		if(s.length()<6) {
			return "";
		}
		for(int i=0;i<s.length();i++) {
			if(!Character.isAlphabetic(s.charAt(i)))
				return "";
		}
		String string=s.toLowerCase();
		StringBuilder st=new StringBuilder();
		for(int i=0;i<string.length();i++) {
			if(!((int)string.charAt(i)%2==0)) {
				st.append(string.charAt(i));
				
			}
			
		}
		st.reverse();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<st.length();i++) {
			if(i%2==0) {
				result.append(st.charAt(i));
				
				
			}
			else {
				result.append(String.valueOf(s.charAt(i)).toUpperCase());
			}
		}
		return String.valueOf(result);
	}
	
public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	 String string=scanner.nextLine();
	 System.out.println(cleansAndInvert(string));
}
}
