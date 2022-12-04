package day2;

public class WavePrint {


    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;


        for (int row = 0; row < arr.length; row++) {

            if (row % 2 == 0)
                for (int col = 0; col < arr.length; col++)
                    System.out.print(arr[row][col] + " ");
            else
                for (int col = arr.length -1; col >= 0; col--)
                    System.out.print(arr[row][col] + " ");

            System.out.println();
        }
    }
}
