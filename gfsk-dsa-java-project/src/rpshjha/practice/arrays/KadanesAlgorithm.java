package rpshjha.practice.arrays;

public class KadanesAlgorithm {

    public static void main(String[] args) {
//        int N = 4;
//        int[] arr = new int[]{-1, -2, -3, -4};

        int N = 5;
        int[] arr = new int[]{1, 2, 3, -2, 5};

        KadanesAlgorithm kadanesAlgorithm = new KadanesAlgorithm();
        long ans = kadanesAlgorithm.maxSubarraySum(arr, N);
        System.out.println(ans);
    }

    long maxSubarraySum(int[] arr, int n) {

        int currentSum = arr[0];
        int overallSum = arr[0];

        for (int i = 1; i < n; i++) {

            if (currentSum >= 0) {
                currentSum = currentSum + arr[i];
            } else {
                currentSum = arr[i];
            }

            if (currentSum > overallSum) {
                overallSum = currentSum;
            }
        }

        return overallSum;
    }

}
