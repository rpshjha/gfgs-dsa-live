package rpshjha.practice.strings;

import rpshjha.base.ReadFile;

import java.util.*;

public class NonRepeatingCharacter {

    public static void main(String[] args) {

        List<String> data = ReadFile.readTextFile("fileInput.txt");
//        String S = data.get(0);

//        String S = "hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvs";
        String S = "kfteo";
        System.out.println(nonrepeatingCharacter(S));
    }

    static char nonrepeatingCharacter(String S) {
        //Your code here

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);

        int max = Collections.max(map.values());
        System.out.println("max val " + max);

        try {
            char c = map.entrySet().stream()
                    .filter(k -> k.getValue() == 1)
                    .findFirst().get().getKey();
//          return S.indexOf(c);
            return c;
        } catch (java.util.NoSuchElementException e) {
            return (char) -1;
        }

    }

}
