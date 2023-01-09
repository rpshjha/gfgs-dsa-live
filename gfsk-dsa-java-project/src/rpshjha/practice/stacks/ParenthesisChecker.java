package rpshjha.practice.stacks;

import java.util.Stack;

public class ParenthesisChecker {

    public static void main(String[] args) {

//        boolean ans = ispar("(((((");
        String s = "]]]]]";
        boolean ans = ispar(s);
        System.out.println(ans);
    }

    static boolean ispar(String x) {
        // add your code here

        if (x.length() <= 1)
            return false;

        Stack<Character> st = new Stack<>();
        boolean status = false;

        for (char c : x.toCharArray()) {

            if (c == '{' || c == '(' || c == '[') {
                st.push(c);
            } else {

                if (st.empty())
                    return false;
                char temp = st.pop(); //[
                if (c == ']') {
                    status = temp == '[';
                } else if (c == '}') {
                    status = temp == '{';
                } else if (c == ')') {
                    status = temp == '(';
                }
            }
        }

        if (!st.empty())
            return false;
        return status;
    }
}
