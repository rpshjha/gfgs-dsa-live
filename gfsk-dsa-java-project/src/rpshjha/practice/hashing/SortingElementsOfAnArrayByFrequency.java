package rpshjha.practice.hashing;

import java.util.*;
import java.util.stream.Collectors;

public class SortingElementsOfAnArrayByFrequency {


    public static void main(String[] args) {

        int N = 5;
        int[] arr = {5, 5, 4, 6, 4};

        ArrayList<Integer> ans = sortByFreq(arr, N);

        System.out.println(ans);

    }

    static ArrayList<Integer> sortByFreq(int[] arr, int n) {
        // add your code here

        HashMap<Integer, Integer> hMap = new HashMap<>();

        for (int temp : arr) {
            hMap.put(temp, hMap.getOrDefault(temp, 0) + 1);
        }

        TreeSet<Integer> mk = new TreeSet<>(Collections.reverseOrder());
        mk.addAll(new HashSet<>(hMap.values()));

        ArrayList<Integer> output = new ArrayList<>();

        for (int temp : mk) {
            List<Integer> tempList = new ArrayList<>();

            for (Map.Entry<Integer, Integer> t : hMap.entrySet()) {
                if (t.getValue().equals(temp))
                    for (int i = 0; i < t.getValue(); i++)
                        tempList.add(t.getKey());
            }
            Collections.sort(tempList);
            output.addAll(tempList);
        }

        return output;
    }
}
