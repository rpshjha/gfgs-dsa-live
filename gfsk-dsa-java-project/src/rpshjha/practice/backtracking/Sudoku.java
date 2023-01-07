package rpshjha.practice.backtracking;

public class Sudoku {

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

        boolean ans = solveSudoku(arr);
        System.out.println(ans);
    }

    static boolean solveSudoku(int[][] grid) {
        // add your code here
        return solveSudoku(grid, 0, 0);
    }

    static boolean solveSudoku(int[][] grid, int i, int j) {

        if (i == grid.length) {
            printGrid(grid);
            return true;
        }

        int ni;
        int nj;

        if (j == grid[0].length - 1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }

        if (grid[i][j] != 0) {
            if (solveSudoku(grid, ni, nj))
                return true;
        } else {
            for (int po = 1; po <= 9; po++) {
                if (isSafe(grid, i, j, po)) {
                    grid[i][j] = po;

                    if(solveSudoku(grid, i, j)){
                        return true;
                    }

                    grid[i][j] = 0;
                }
            }
        }
        return false;
    }

    //Function to print grids of the Sudoku.
    static void printGrid(int[][] grid) {
        // add your code here

        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }

    static boolean isSafe(int[][] grid, int x, int y, int val) {

        for (int j = 0; j < grid[0].length; j++) {
            if (grid[x][j] == val) {
                return false;
            }
        }

        for (int[] ints : grid) {
            if (ints[y] == val) {
                return false;
            }
        }

        int smi = x / 3 * 3;
        int smj = y / 3 * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[smi + i][smj + j] == val) {
                    return false;
                }
            }
        }

        return true;
    }
}
