
import java.util.*;

public class Palindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int f = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                ;
            {
                System.out.println(false);
                f = 1;
            }
        }
        if (f == 0)
            System.out.prinltn(true);

    }

}
