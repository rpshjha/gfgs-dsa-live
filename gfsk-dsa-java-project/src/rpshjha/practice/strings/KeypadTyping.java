package rpshjha.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class KeypadTyping {

    public static void main(String[] args) {


        String S = "geeksforgeeks";

        System.out.println(printNumber(S, S.length()));

    }

    public static String printNumber(String s, int n) {
        //Your code here

        String ans = "";
        Map<String, Integer> map = new HashMap<>();

        map.put("abc", 2);
        map.put("def", 3);
        map.put("ghi", 4);
        map.put("jkl", 5);
        map.put("mno", 6);
        map.put("pqrs", 7);
        map.put("tuv", 8);
        map.put("wxyz", 9);

        for (char c : s.toCharArray()) {
            String temp = map.keySet().stream().filter(s1 -> s1.contains(String.valueOf(c))).findFirst().get();
            int t = map.get(temp);
            ans += t;
        }


        return ans;
    }


}
