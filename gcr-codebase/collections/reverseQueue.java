package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        Stack<Integer> stack = new Stack<>();

        // Step 1: Move queue elements to stack
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }

        // Step 2: Move stack elements back to queue
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        System.out.println(q);
    }
}
