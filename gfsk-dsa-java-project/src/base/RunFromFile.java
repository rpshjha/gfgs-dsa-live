package base;

import arrays.MaxAndSecondMax;
import utils.ReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RunFromFile {

    public static void main(String[] args) {

        List<String> data = ReadFile.readTextFile("fileInput.txt");

        int N = Integer.parseInt(data.get(0));
        int[] arr = Stream.of(data.get(1).split(" ")).mapToInt(token -> Integer.parseInt(token)).toArray();

        ArrayList<Integer> ans = MaxAndSecondMax.largestAndSecondLargest(N, arr);

        System.out.println("ans is " + ans);
    }
}
