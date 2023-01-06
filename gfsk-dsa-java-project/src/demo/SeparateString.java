package demo;


public class SeparateString {

    public static void main(String[] args) {

        String str = "ab12@$cd445";

        solutionByRegEx(str);

        solution(str);
    }


    static void solutionByRegEx(String str) {
        String alpha = str.replaceAll("[^a-zA-Z]", "");
        String num = str.replaceAll("[^0-9]", "");
        String special = str.replaceAll("[a-zA-Z0-9]", "");

        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }

    static void solution(String str) {
        StringBuilder alpha = new StringBuilder();
        StringBuilder num = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if (Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }

        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }
}
