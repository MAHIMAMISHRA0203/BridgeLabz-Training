package scenerio_based;


public class LexicalTwist {
	public static boolean IsReverse(String first,String second) {
		int len1=first.length()-1;
		int len2=0;
		if(first.length()!=second.length()) {
			return false;
		}
		
		while(len1>=0 && second.length()>len2) {
			if(first.charAt(len1)!=second.charAt(len2)) {
				return false;
			}
			len1--;len2++;
		}
		return true;
	}
	public static String transform(String first) {
		String string="";
		for(char s:first.toCharArray()) {
			if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u') {
				string+='@';
			}else string+=s;
			
		}
		return string;
	}
	public static void main(String [] args) {
		String first="jkl";
		String secondString="LKj";
		if(IsReverse(first, secondString)) {
			first.toLowerCase();
			System.out.println(transform(first));
		}else{
			System.out.println("Unequal Strings");
			
		}
		
	}
}
