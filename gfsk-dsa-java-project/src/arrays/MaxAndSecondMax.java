package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAndSecondMax {

    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        //code here.

//        int max = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//        ArrayList<Integer> newInt = new ArrayList<>();
//
//        for (int i = 0; i < sizeOfArray; i++) {
//
//            int tempElement = arr[i];
//
//            if (tempElement == 32761)
//                System.out.println("current element is " + tempElement);
//
//            if (secondMax < tempElement && tempElement < max)
//                secondMax = tempElement;
//
//            if (max < tempElement)
//                max = tempElement;
//        }
//
//        if (secondMax == Integer.MIN_VALUE)
//            secondMax = -1;
//
//        newInt.add(max);
//        newInt.add(secondMax);
//
//        return newInt;

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
