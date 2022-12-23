package rpshjha.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {


        String a = "swalrl";
        String b = "lsrasw";

        System.out.println(isAnagram(a, b));

    }

    public static boolean isAnagram(String a, String b) {

        // Your code here
        if (a.length() != b.length())
            return false;

        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for (char c : a.toCharArray())
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);

        for (char c : b.toCharArray())
            mapB.put(c, mapB.getOrDefault(c, 0) + 1);

        System.out.println(mapA);
        System.out.println(mapB);

        return mapA.equals(mapB);
    }
}
