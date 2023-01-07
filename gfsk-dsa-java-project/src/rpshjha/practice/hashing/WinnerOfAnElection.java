package rpshjha.practice.hashing;

import java.util.*;

public class WinnerOfAnElection {

    public static void main(String[] args) {
        int n = 13;
        String[] Votes = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};

        String[] ans = winner(Votes, n);

        for (String temp : ans)
            System.out.println(temp);
    }

    public static String[] winner(String arr[], int n) {
        // add your code
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String curr : arr) {
            hashMap.put(curr, hashMap.getOrDefault(curr, 0) + 1);
        }

        Integer maxVote = Collections.max(hashMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();

        List<String> candidateList = hashMap.entrySet().stream().filter(i -> Objects.equals(i.getValue(), maxVote))
                .map(Map.Entry::getKey).sorted().collect(java.util.stream.Collectors.toList());

        String[] ans = new String[2];
        ans[0] = candidateList.get(0);
        ans[1] = String.valueOf(maxVote);
        return ans;
    }

}
