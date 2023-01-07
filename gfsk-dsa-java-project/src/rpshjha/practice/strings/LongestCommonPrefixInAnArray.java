package rpshjha.practice.strings;

import base.ReadFile;

import java.util.*;

public class LongestCommonPrefixInAnArray {

    public static void main(String[] args) {

        LongestCommonPrefixInAnArray longestCommonPrefixInAnArray = new LongestCommonPrefixInAnArray();

//        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};

        List<String> data = ReadFile.readTextFile("fileInput.txt");
        int N = Integer.parseInt(data.get(0));
        String[] arr = data.get(1).split(" ");

        String ans = longestCommonPrefixInAnArray.longestCommonPrefix(arr, N);
        System.out.println(ans);
    }

    String longestCommonPrefix(String[] arr, int n) {
        // code here

        int least = Arrays.stream(arr).min(Comparator.comparing(String::length)).get().length();

        Set<String> common = new HashSet<>();

        while (0 < least) {

            int i = 0;

            while (i < n) {
                String subString = arr[i].substring(0, least);
                common.add(subString);
                i++;
            }

            least--;
            if (common.size() == 1)
                return common.stream().findFirst().get();
            else common.clear();
        }
        return "-1";
    }
}
