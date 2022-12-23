package rpshjha.practice.arrays;


public class RearrangeArrayAlternately {

    static int n = 6;
    static long[] arr = {1, 2, 3, 4, 5, 6};//6 1 5 2 4 3
    private static long MOD = 10000067;

    public static void main(String[] args) {
        rearrange(arr, n);
    }

    public static void rearrange(long[] arr, int n) {

        // Your code here
        int l = 0;

        int r = n - 1;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                long newValue = arr[r--] % MOD;

                arr[i] = newValue * MOD + arr[i];

            } else {

                long newValue = arr[l++] % MOD;

                arr[i] = newValue * MOD + arr[i];

            }

        }

        for (int i = 0; i < n; i++) {

            arr[i] = arr[i] / MOD;

        }

    }
}
