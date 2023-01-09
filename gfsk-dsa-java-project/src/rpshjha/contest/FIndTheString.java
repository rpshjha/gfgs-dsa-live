package rpshjha.contest;

public class FIndTheString {

    public static void main(String[] args) {
        isItPossilbe("abcabc");
    }

    static int isItPossilbe(String s) {
        // code here

        String newString = s.substring(0, (s.length() / 2));

        System.out.print(newString);

        return 0;
    }
}
