package rpshjha.practice.arrays;

public class RotateArray {


    public static void main(String[] args) {
        int N = 5, D = 2;
        int arr[] = {1, 2, 3, 4, 5};


        rotateArr(arr, D, N);
    }

    public static void rotateArr(int arr[], int d, int n) {
        // add your code here

        int point = d;

        int[] newArr = new int[n];

        for (int i = 0; i < n - d; i++) {
            newArr[i] = arr[point++];
        }

        int newPoint = n - d;

        for (int i = 0; i < d; i++) {
            newArr[newPoint++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
//            System.out.println(newArr[i]);
            arr[i] = newArr[i];
        }
    }
}
