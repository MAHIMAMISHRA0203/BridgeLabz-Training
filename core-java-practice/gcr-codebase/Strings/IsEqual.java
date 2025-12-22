public class IsEqual {
    public static void main(String args[]) {
        // taking input od both words to be checked equal
        String string1 = sc.next();
        String string2 = sc.next();
        // to check if length of both the strings are equal or not
        if (s1.length() != s2.length())
            System.out.println(false);
        else {
            int f = 0;
            // loop to iterate over string
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i))
                    // if chararcter at certain index do not matches break the loop and print false
                    System.out.println(false);
                f = 1;
                break;
            }
        }
        // if the complete string matched print true
        if (f == 1)
            System.out.println(true);
    }
}
