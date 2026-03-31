package collections;

import java.util.*;

public class rotateElement {

        public static void main(String[] args) {

                List<Integer> list = new ArrayList<>(
                                Arrays.asList(10, 20, 30, 40, 50));

                int d = 2;
                d = d % list.size(); // safety

                List<Integer> rotated = new ArrayList<>(list.subList(d, list.size()));

                rotated.addAll(list.subList(0, d));

                System.out.println(rotated);
        }
}
