package collections;

import java.util.*;

public class GenerateBinary {
    public static void main(String[] args) {

        int N = 5;
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < N; i++) {
            String curr = q.remove();
            System.out.println(curr);

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}
