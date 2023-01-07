package rpshjha.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class PossibleWordsFromPhoneDigits {

    public static void main(String[] args) {

        int N = 3;
        int[] a = {2, 3, 4};

        ArrayList<String> ans = possibleWords(a, N);
        System.out.println("ans is " + ans);

    }

    static ArrayList<String> possibleWords(int[] a, int N) {
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> al = new ArrayList<>();
        possibleWords(a, N, 0, al, "", keypad);
        return al;
    }

    public static void possibleWords(int[] a, int N, int idx, List<String> al, String asf, String[] keypad) {

        if (idx == N) {
            al.add(asf);
            return;
        }

        int key = a[idx];

        for (int i = 0; i < keypad[key].length(); i++) {
            char ele = keypad[key].charAt(i);
            possibleWords(a, N, idx + 1, al, asf + ele, keypad);
        }
    }

}
