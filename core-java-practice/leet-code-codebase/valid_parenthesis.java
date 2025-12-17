import java.util.Stack;

public class valid_parenthesis {
    public boolean isValid(String st) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '[') {
                s.add(']');
            } else if (st.charAt(i) == '{') {
                s.add('}');
            } else if (st.charAt(i) == '(') {
                s.add(')');
            } else if (s.isEmpty() || s.pop() != st.charAt(i))
                return false;
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        valid_parenthesis vp = new valid_parenthesis();
        String st = "{[()]}";
        System.out.println("Is the parentheses valid? " + vp.isValid(st));
    }
}
