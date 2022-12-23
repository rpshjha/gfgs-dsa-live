package rpshjha.practice.arrays;

import java.util.ArrayList;

public class TrappingRainWater {

    public static void main(String[] args) {
//        int N = 6;
//        int[] arr = {3, 0, 0, 2, 0, 4};

//        int N = 4;
//        int arr[] = {7, 4, 0, 9};

//        int N = 3;
//        int arr[] = {6,9,9};

//        int N = 4;
//        int arr[] = {7, 4, 0, 9};

        int N = 7;
        int arr[] = {8, 8, 2, 4, 5, 5, 1};

        long ans = trappingWater(arr, N);

        System.out.println("ans is " + ans);
    }

    static long trappingWater(int[] arr, int n) {
        // Your code here
        long trappedWater = 0;

        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i], lmax[i - 1]);
        }

        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            trappedWater += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return trappedWater;
    }
}
