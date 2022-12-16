package stringsP;

public class CircleOfStrings {

    public static void main(String[] args) {

        String[] arr = {"for", "geek", "rig", "kaf"};
        int ans = isCircle(arr.length, arr);

        System.out.println(ans);
    }

    static int isCircle(int N, String[] A) {
        // code here

        boolean status = false;

        for (int i = 0; i < N; i++) {

            char c = A[i].charAt(A[i].length() - 1);

            for (int j = i + 1; j < N; j++) {

                if ((A[j].charAt(0) != c)) {
                    status = false;
                } else {
                    status = true;

                    String temp = A[i + 1];
                    A[i + 1] = A[j];
                    A[j] = temp;
                    break;
                }
            }

            if (!status) {
                return 0;
            }
        }

        return 1;
    }
}
