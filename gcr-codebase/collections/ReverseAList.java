package collections;
import java.util.*;

public class ReverseAList {

    public static void reverse(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);

      reverse(list);
    }
}
