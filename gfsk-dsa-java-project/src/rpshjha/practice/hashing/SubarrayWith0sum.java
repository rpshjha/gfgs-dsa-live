package rpshjha.practice.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SubarrayWith0sum {

    public static void main(String[] args) {
//        int N = 5;
//        int[] arr = {4, 2, -3, 1, 6};

        int N = 2;
        int[] arr = {10, -10};

        System.out.println(findsum(arr, N));
    }

    static boolean findsum(int arr[], int n) {
        //Your code here

        HashSet<Integer> hset = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];
            if (hset.contains(sum) || sum == 0) {
                return true;
            }
            hset.add(sum);
        }
        return false;
    }
}
