package collections;

import java.util.HashSet;
import java.util.Set;

public class EqualSets {
    public static void main(String[] args) {
        Set<Integer> s1 = Set.of(7, 3, 5, 6);
        Set<Integer> s2 = Set.of(7, 3, 5, 6);
        if (s1.equals(s2)) {
            System.out.println(true);

        } else
            System.out.println(false);

    }
}
