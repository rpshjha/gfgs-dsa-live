package arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AllPairs {

    class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {

        String everything = null;
        try (BufferedReader br = new BufferedReader(new FileReader("./testdata/fileInput.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(everything);

        long[] A = {1, 2, 4, 5, 7};
        long[] B = {5, 6, 3, 4, 8};
        long X = 9;


        AllPairs allPairs = new AllPairs();
        pair[] ans = allPairs.allPairs(A, B, A.length, B.length, X);

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
        return pa.toArray(new pair[0]);
    }

}
