package recursion;

public class PowerOfNos {

    public static void main(String[] args) {

        long ans = power(12, 21);
        System.out.println("ans is " + ans);
    }

    static long power(int N, int R) {

        if (R == 0)
            return 1;

        long temp = power(N, R / 2);
        temp = temp * temp % 1000000007;

        if (R % 2 == 0)
            return temp;
        else
            return temp * N % 1000000007;

    }
}
