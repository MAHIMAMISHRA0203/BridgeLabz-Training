public class length_of_last_String {

    public static int lengthOfLastWord(String str) {
        int len = 0;
        String s = str.trim();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            } else {
                return len;
            }
        }
        return len;
    }

    public static void main(String[] args) {

        String str = "   Hello World   ";
        int result = lengthOfLastWord(str);

        System.out.println("Length of last word: " + result);
    }
}
