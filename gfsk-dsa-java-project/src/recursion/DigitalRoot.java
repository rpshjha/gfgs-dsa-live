package recursion;

public class DigitalRoot {

    public static void main(String[] args) {

        System.out.println(digitalRoot(10514));
    }

    public static int digitalRoot(int n) {
        // add your code here

        if (n == 0 || n == 1)
            return n;

        int sum = n % 10 + digitalRoot(n / 10);

        System.out.println("final sum is " + sum);

        if (sum >= 10) {
            int newSum = 0;
            while (sum > 0) {
                int firstDigit = sum % 10;
//                if (firstDigit == 0)
//                    firstDigit = 1;
                newSum = newSum + firstDigit;
                sum = sum / 10;
            }
            return newSum;
        }

        return sum;
    }
}
