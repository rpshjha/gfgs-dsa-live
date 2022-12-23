package rpshjha.practice.arrays;

import java.util.ArrayList;

public class StockBuyAndSell {

    public static void main(String[] args) {


        int N = 7;
        int A[] = {100, 180, 260, 310, 40, 535, 695};


        stockBuySell(A, N);

    }

    static ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
        // code here

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int min, max = 0;
        for (int i = 0; i < n; i++) {

            int initValueOfStock = arr[i];

            for (int j = i + 1; j < n; j++) {

                if (initValueOfStock < arr[j]) {
                    int profit = arr[j] - arr[i];
                    max = Math.max(profit, max);
                } else {
                    initValueOfStock = arr[j];
                    ;
                }
            }

//            System.out.println("maximum profit is "
//                    + max +
//                    " by buying at day "
//                    + i +
//                    " and selling at day "
//                    + (j - 1));

        }
        return ans;
    }
}
