package rpshjha.live.day2;

import java.util.Scanner;

public class RotateMatrix {


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


        rotateMatrix(arr);
    }

    private static void rotateMatrix(int[][] arr) {

        int[][] newMatrix = new int[arr.length][arr[0].length];

        for (int i = arr.length - 1; i >= 0; i--) {

            for (int j = 0; j < arr[0].length; j++) {

                int n = arr[i][j];
                System.out.print(n);

                for (int k = 0; k < newMatrix.length; k++) {
                    newMatrix[k][j] = n;
                }


            }
        }

        printMatrix(newMatrix);

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
