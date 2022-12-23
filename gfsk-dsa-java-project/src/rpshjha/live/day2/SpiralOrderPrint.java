package rpshjha.live.day2;

import java.util.Scanner;

public class SpiralOrderPrint {


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




    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
