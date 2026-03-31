
import java.util.*;

public class LineComparison {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Line Comprison Computation Program");

        System.out.println(useCase1(2, 4, 5, 6));
        useCase2(2, 3, 4, 5, 6, 7, 8, 9);
        useCase3(2, 3, 4, 5, 6, 7, 8, 9);

    }

    public static double useCase1(int x1, int y1, int x2, int y2) {
        System.out.printf("The Points are (x1:%d,y1:%d),(x2:%d,y2:%d)", x1, y1, x2, y2);
        System.out.print("The length of line is:");
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }

    public static void useCase2(int l1x1, int l1y1, int l1x2, int l1y2, int l2x1, int l2y1, int l2x2, int l2y2) {
        System.out.printf("The Points of line 1 are (l1x1:%d,l1y1:%d),(l1x2:%d,l1y2:%d)\n", l1x1, l1y1, l1x2, l1y2);
        System.out.printf("The Points of line 2 are (l2x1:%d,l2y1:%d),(l2x2:%d,l2y2:%d)\n", l2x1, l2y1, l2x2, l2y2);
        Double length1 = Math.sqrt(Math.pow(l1x2 - l1x1, 2) + Math.pow(l1y2 - l1y1, 2));
        Double length2 = Math.sqrt(Math.pow(l2x2 - l2x1, 2) + Math.pow(l2y2 - l2y1, 2));
        if (length1.equals(length2))
            System.out.println("Line 1 and Line 2 are Equal");
        else
            System.out.println("Line 1 and Line 2 are not Equal");

    }

    public static void useCase3(int l1x1, int l1y1, int l1x2, int l1y2, int l2x1, int l2y1, int l2x2, int l2y2) {

        Double length1 = Math.sqrt(Math.pow(l1x2 - l1x1, 2) + Math.pow(l1y2 - l1y1, 2));
        Double length2 = Math.sqrt(Math.pow(l2x2 - l2x1, 2) + Math.pow(l2y2 - l2y1, 2));
        if (length1.compareTo(length2) == 0) {
            System.out.println("Line 1 and Line 2 are Equal");
        }
        if (length1.compareTo(length2) == 1) {
            System.out.println("Line 1 is greater than line 2 ");
        } else
            System.out.println("Line 2 is greater than line 1 ");

    }

}
