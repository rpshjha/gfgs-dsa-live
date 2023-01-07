package rpshjha.practice.hashing;

import java.util.HashSet;
import java.util.Set;

public class HashingForPair {

    public static void main(String[] args) {
        int N = 10;
        int sum = 14;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sumExists(arr, N, sum));
    }

    public static int sumExists(int[] arr, int N, int sum) {
        // Your code here, Geeks

        Set<Integer> hs = new HashSet<>();

        for (int x : arr) {
            if (hs.contains(sum - x))
                return 1;
            hs.add(x);
        }

        return 0;
    }
}
