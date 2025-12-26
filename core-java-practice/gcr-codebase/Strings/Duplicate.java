public class Duplicate {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            if (set.contains(s.charAt(i)))
                System.out.println(s.charAt(i));

        }

    }

}
