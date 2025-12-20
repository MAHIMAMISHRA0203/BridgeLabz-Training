public class AmarAkbarAnthony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int AkbarAge = sc.nextInt();
        int AmarAge = sc.nextInt();
        int AnthonyAge = sc.nextInt();
        int AkbarHeight = sc.nextInt();
        int AmarHeight = sc.nextInt();
        int AnthonyHeight = sc.nextInt();
        if (AkbarAge < AmarAge && AmarAge > AnthonyAge)
            System.out.println("Amar is the oldest ");
        else if (AkbarAge > AmarAge && AkbarAge > AnthonyAge)
            System.out.println("Akbar is the oldest ");
        else if (AnthonyAge > AmarAge && AkbarAge < AnthonyAge)
            System.out.println("Anthony is the oldest ");
        if (AkbarHeight < AmarHeight && AmarHeight > AnthonyHeight)
            System.out.println("Amar is the tallest ");
        else if (AkbarHeight > AmarHeight && AkbarHeight > AnthonyHeight)
            System.out.println("Akbar is the tallest ");
        else if (AnthonyHeight > AmarHeight && AkbarHeight < AnthonyHeight)
            System.out.println("Anthony is the tallest ");
    }

}
