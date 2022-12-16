package arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AllPairs {

    static class pair {
        long first;
        long second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {

        List<String> everything = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("./testdata/fileInput.txt"))) {
            String line = br.readLine();

            while (line != null) {
                everything.add(line);
                line = br.readLine();
            }
            everything.add("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        long[] A = getLong(everything.get(1).split(" "));
        long[] B = getLong(everything.get(2).split(" "));
        long N = Long.parseLong(everything.get(0).split(" ")[0]);
        long M = Long.parseLong(everything.get(0).split(" ")[1]);
        long X = Long.parseLong(everything.get(0).split(" ")[2]);

        AllPairs allPairs = new AllPairs();
        pair[] ans = allPairs.allPairs(A, B, N, M, X);

        for (pair temp : ans) {
            System.out.println(temp.first + " " + temp.second);
        }
    }


    public pair[] allPairs(long[] A, long[] B, long N, long M, long X) {
        // Your code goes here

        List<pair> pa = new ArrayList<>();

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (A[i] + B[j] == X)
                    pa.add(new pair(A[i], B[j]));

        pa.sort((o1, o2) -> (int) (o1.first - o2.first));
        return pa.toArray(new pair[0]);
    }

    public static long[] getLong(String[] arr) {
        long[] LongNum = new long[arr.length];
        for (int i = 0; i < arr.length; i++)
            LongNum[i] = Long.parseLong(arr[i]);
        return LongNum;
    }

}
