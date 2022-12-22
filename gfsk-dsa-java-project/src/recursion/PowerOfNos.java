package recursion;

public class PowerOfNos {

    public static void main(String[] args) {

        long ans = power(12, 21);
        System.out.println("ans is " + ans);
    }

    static long power(int N, int R) {
        //Your code here
        // if(R==0)
        // return 1;
        if (R == 1)
            return N;

//         return N * power(N, R - 1) / 1000000007;
        return 1l;
    }
}
