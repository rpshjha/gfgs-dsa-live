package stringsP;

public class TheModifiedString {

    public static void main(String[] args) {

//        String s = "aabbbcc";
        String s = "aaaaa";
        modified(s);
        System.out.println(modified1(s));
    }

    public static long modified1(String a) {

        int count = 0;
        int cCharCount = 0;
        char lastChar = ' ';
        char ch;
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            if (ch == lastChar) {
                cCharCount++;
                if (cCharCount == 3) {
                    count++;
                    cCharCount = 1;
                }
            } else {
                cCharCount = 1;
            }
            lastChar = ch;
        }
        return count;
    }

    public static long modified(String a) {
        // Your code here

        int count = 1;

        char toBeAdded = a.charAt(a.length() - 1);

        for (int i = 1; i < a.length(); i++) {
            char prev = a.charAt(i - 1);
            char curr = a.charAt(i);

            if (prev == curr)
                count++;
            else count = 1;

            if (count >= 3) {
                a = a.substring(0, i) + ++toBeAdded + a.substring(i);
                System.out.println(a);
                //aabbdbcc
                //aababaa
            }
        }

        System.out.println(a);
        return 0L;
    }
}
