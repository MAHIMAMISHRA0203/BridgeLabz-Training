package Regex;

public class RepeatedWords {
	 public static void main(String[] args) {

	        String text = "This is is a test test sentence";

	        Pattern pattern = Pattern.compile("\\b(\\w+)\\b\\s+\\1\\b", Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(text);

	        while (matcher.find()) {
	            System.out.println(matcher.group(1));
	        }
	    }
}
