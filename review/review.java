class review {
    public static void main(String[] args) {
        char ch[] = { 'c', 'f', 'j' };
        char target = 'c';
        char s = ' ';
        for (int i = 0; i < ch.length; i++) {
            char m = ch[i];
            if ((int) (m) > (int) (target)) {
                s = ch[i];
                break;
            }

        }
        System.out.println(s);

    }
}