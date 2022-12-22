package arrays;

import java.util.Arrays;

public class MeanAndMedianofArray {

    public static void main(String[] args) {

//        int N = 5;
//        int a[] = {1, 2, 19, 28, 5};

        int N = 4;
        int a[] = {2, 8, 3, 4};


        MeanAndMedianofArray m = new MeanAndMedianofArray();
        System.out.println(m.mean(a, N));
        System.out.println(m.median(a, N));
    }

    public int median(int A[], int N) {

        Arrays.sort(A);

        //Your code here
        //If median is fraction then conver it to integer and return

        int n;

        if (N % 2 == 0) {
             n = (N / 2);
        }else{
             n = (N / 2) + 1;
        }

        System.out.println("n is " + n);
        for (int t : A) {
            System.out.print(t + ",");
        }
        System.out.println();
        if (N % 2 == 0) {
            return A[n - 1];
        }
        return A[n - 1];
    }

    //Function to find median of the array elements.
    public int mean(int A[], int N) {
        //Your code here
        int sum = 0;

        for (int i = 0; i < N; i++) {

            sum += A[i];
        }

        if (N % 2 == 0) {
            int ans = sum / N;
            return (int) Math.floor(ans);
        } else {
            return sum / N;
        }

    }
}
