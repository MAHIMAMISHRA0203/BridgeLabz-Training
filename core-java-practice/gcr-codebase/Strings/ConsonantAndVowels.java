public class ConsonantAndVowels {
    public static void main(String margs[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextInt();
        String s = st.toLowerCase();

        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < s.length; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')
                vowels++;
            else
                consonant++;
        }
        System.out.printf("The vowels are %d and consonant are %d", vowel, consonant);

    }
}
