package rpshjha.practice.backtracking;

public class RatInAMazeProblem {

    public static void main(String[] args) {

        int n = 4;
        int[][] m = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        boolean ans = findPath(m, n);

        System.out.println("ans is " + ans);
    }

    static boolean isSafe(int[][] m, int i, int j) {
        return i < m.length - 1 && j < m[0].length - 1 && m[i][j] == 1;
    }


    public static boolean findPath(int[][] m, int n) {
        // Your code here
        int[][] sol = new int[n][n];

        boolean bol = solution(m, 0, 0, n, sol);

        if (bol)
            return false;
        else {
            printMaze(sol);
            return true;
        }
    }

    private static boolean solution(int[][] m, int i, int j, int n, int[][] sol) {

        if (i == n - 1 && j == n - 1) {
            sol[i][j] = 1;
            return true;
        }

        if (isSafe(m, i, j)) {
            sol[i][j] = 1;

            if (solution(m, i + 1, j, n, sol))
                return true;

            else if (solution(m, i, j + 1, n, sol))
                return true;

            sol[i][j] = 0;
        }
        return false;
    }

    static void printMaze(int[][] m) {

        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
