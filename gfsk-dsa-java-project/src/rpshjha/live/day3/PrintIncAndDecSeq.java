package rpshjha.live.day3;

public class PrintIncAndDecSeq {

    public static void main(String[] args) {


        increasing(5);

//        decreasing(5);
    }

    private static void increasing(int n) {
        if (n == 0)
            return;

        increasing(n - 1);
        System.out.println(n);
    }

    private static void decreasing(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        increasing(n - 1);
    }


}
