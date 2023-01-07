package rpshjha.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAndSecondMax {

    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {

        Arrays.sort(arr);

        ArrayList<Integer> newInt = new ArrayList<>();
        newInt.add(arr[sizeOfArray - 1]);

        int index = sizeOfArray - 2;
        while (index >= 0) {
            if (arr[index] != arr[sizeOfArray - 1]) {
                newInt.add(arr[index]);
                break;
            }
            index--;
        }

        if (newInt.size() == 1) {
            newInt.add(-1);
        }
        return newInt;

    }
}
