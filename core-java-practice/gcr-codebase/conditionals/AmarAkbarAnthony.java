public class AmarAkbarAnthony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int akbarAge = sc.nextInt();
        int amarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();
        int akbarHeight = sc.nextInt();
        int amarHeight = sc.nextInt();
        int anthonyHeight = sc.nextInt();
        if (akbarAge < amarAge && amarAge > anthonyAge)
            System.out.println("Amar is the oldest among three ");
        else if (akbarAge > amarAge && akbarAge > anthonyAge)
            System.out.println("Akbar is the oldest among three");
        else if (anthonyAge > amarAge && akbarAge < anthonyAge)
            System.out.println("Anthony is the oldest  among three");
        if (akbarHeight < amarHeight && amarHeight > anthonyHeight)
            System.out.println("Amar is the tallest  among three");
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
            System.out.println("Akbar is the tallest among three ");
        else if (anthonyHeight > amarHeight && akbarHeight < anthonyHeight)
            System.out.println("Anthony is the tallest  among three");
    }

}
