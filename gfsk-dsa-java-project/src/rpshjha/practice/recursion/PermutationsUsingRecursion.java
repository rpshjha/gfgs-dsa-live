package rpshjha.practice.recursion;

public class PermutationsUsingRecursion {


    public static void main(String[] args) {

        printPermutation("abc", "");
    }

    static void printPermutation(String str, String ans) {

        if (str.length() == 0)
            System.out.println(ans);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String l = str.substring(0, i);
            String r = str.substring(i + 1);
            String q = l + r;

            printPermutation(q, ans + ch);
        }
    }
}
