package rpshjha.live.day2;

import java.util.Scanner;

public class WavePrint {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int row = sc.nextInt();
        System.out.println("enter col");
        int col = sc.nextInt();

        System.out.println("enter data");
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printWave(arr);
    }

    private static void printWave(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {

            if (row % 2 == 0)
                for (int col = 0; col < arr.length; col++)
                    System.out.print(arr[row][col] + " ");
            else
                for (int col = arr.length - 1; col >= 0; col--)
                    System.out.print(arr[row][col] + " ");

            System.out.println();
        }
    }
}
