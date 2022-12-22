package day3;

public class FibonacciUsingRecursion {


    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    private static int fibonacci(int n) {

        if (n == 0 || n == 1)
            return n;

        return fibonacci((n - 1)) + fibonacci(n - 2);
    }
}
