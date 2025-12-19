public class ProfitLoss {
    public static void main(String[] args) {
        int sp = 191;
        int cp = 129;
        if (sp > cp) {
            System.out.println("Profit:" + (sp - cp));
            System.out.println("Profit percentage:" + ((sp - cp) * 100 / cp) + "%");
        } else {
            System.out.println("Loss:" + ((cp - sp)));
            System.out.println("Loss percentage:" + ((cp - sp) * 100 / cp) + "%");
        }

    }
}
