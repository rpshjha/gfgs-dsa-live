package stringsP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SmallestWindowInaStringContainingAllTheCharacters {


    public static void main(String[] args) {

//        String S = "timetopractice";
//        String P = "toc";

        String S = "zoomlazapzo";
        String P = "oza";
        //apzo

//        System.out.println(smallestWindow(S, P));

        String ans1 = smallestWindow(S, P);
        System.out.println(ans1);

        String ans2 = smallestWindow1(S, P);
        System.out.println(ans2);
    }

    public static String smallestWindow1(String s, String p) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int i = 0;
        int j = 0;
        int macthCount = 0;
        String res = "";
        while (i < p.length()) {
            map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i++), 0) + 1);
        }
        i = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
            if (map1.containsKey(c) && map2.get(c) <= map1.get(c)) macthCount++;
            while (macthCount == p.length() && i <= j) {
                String temp = s.substring(i, j + 1);
                if (res.length() == 0 || temp.length() < res.length()) res = temp;
                char check = s.charAt(i);
                map2.put(check, map2.getOrDefault(check, 0) - 1);
                if (map1.containsKey(check) && map1.get(check) > map2.get(check)) macthCount--;
                i++;
            }
            j++;
        }
        if (res.length() == 0) return "-1";
        return res;
    }

    public static String smallestWindow(String s, String p) {
        List<String> list = new ArrayList<>();

//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                if ((j - 1) >= p.length()) {
//                    String temp = s.substring(i, j + 1);
//                    if (isContains(temp, p)) list.add(temp);
//                }
//            }
//        }

        for (int i = 0; i < s.length() - 1; i++) {
            String subStr = "";

            // Second loop is generating sub-String
            for (int j = i; j < s.length(); j++) {
                subStr += s.charAt(j);
                    if (isContains(subStr, p)) list.add(subStr);
            }
        }
        return list.stream().min(Comparator.comparing(String::length)).get();
    }

    public static boolean isContains(String S, String P) {
        for (char c : P.toCharArray())
            if (!S.contains(String.valueOf(c))) return false;
        return true;
    }


}
