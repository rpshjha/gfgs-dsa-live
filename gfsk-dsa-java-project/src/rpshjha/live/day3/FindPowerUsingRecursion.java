package rpshjha.live.day3;

public class FindPowerUsingRecursion {


    public static void main(String[] args) {

        System.out.println(findPower(5, 3));
    }

    private static int findPower(int i, int i1) {

        if (i1 == 0)
            return 1;

        return i * findPower(i, i1 - 1);
    }

}
