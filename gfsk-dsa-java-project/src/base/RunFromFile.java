package base;

import rpshjha.practice.arrays.RotateArray;

import java.util.List;
import java.util.stream.Stream;

public class RunFromFile {

    public static void main(String[] args) {

        List<String> data = ReadFile.readTextFile("fileInput.txt");

        int N = Integer.parseInt(data.get(0).split(" ")[0]);
        int D = Integer.parseInt(data.get(0).split(" ")[1]);
        int[] arr = Stream.of(data.get(1).split(" ")).mapToInt(token -> Integer.parseInt(token)).toArray();

//        ArrayList<Integer> ans = MaxAndSecondMax.largestAndSecondLargest(N, arr);
//        System.out.println("ans is " + ans);

        RotateArray.rotateArr(arr, D, N);
    }
}
