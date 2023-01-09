package rpshjha.practice.stacks;

import java.util.Stack;

class GetMin {

    public static void main(String[] args) {

        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        Stack<Integer> st = _push(arr, n);
        _getMinAtPop(st);
    }

    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int[] arr, int n) {
        // your code here
        Stack<Integer> st = new Stack<>();

        for (int curr : arr) {
            st.push(curr);
        }

        return st;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer> s) {
        // your code here
        int min = Integer.MAX_VALUE;

        while (!s.empty()) {

            for (int curr : s)
                if (curr < min)
                    min = curr;

            System.out.print(min + " ");
            int cu = s.pop();

            if (cu == min && !s.empty())
                min = Integer.MAX_VALUE;
        }
    }
}