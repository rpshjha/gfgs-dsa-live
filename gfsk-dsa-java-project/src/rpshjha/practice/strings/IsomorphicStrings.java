package rpshjha.practice.strings;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {

//        boolean ans = areIsomorphic("aab", "xxy");

        boolean ans = areIsomorphic("aabbc", "xyxyz");

        System.out.println(ans);
    }

//    public static boolean areIsomorphic(String str1, String str2) {
//        // Your code here
//
//        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<>();
//        LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<>();
//
//        for (char temp : str1.toCharArray()) {
//            map1.put(temp, map1.getOrDefault(temp, 0) + 1);
//        }
//
//        for (char temp : str2.toCharArray()) {
//            map2.put(temp, map2.getOrDefault(temp, 0) + 1);
//        }
//
//        List<Integer> integers1 = map1.values().stream().collect(java.util.stream.Collectors.toList());
//        List<Integer> integers2 = map2.values().stream().collect(java.util.stream.Collectors.toList());
//
//        System.out.println(integers1);
//        System.out.println(integers2);
//
//        if (integers1.size() != integers2.size())
//            return false;
//
//        for (int i = 0; i < integers1.size(); i++) {
//            if (integers1.get(i) != integers2.get(i)) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        if (str1.equals(str2)) return true;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (map1.getOrDefault(ch1, ch2) != ch2 || map2.getOrDefault(ch2, ch1) != ch1) return false;
            else {
                map1.put(ch1, ch2);
                map2.put(ch2, ch1);
            }
        }

        return true;
    }
}
