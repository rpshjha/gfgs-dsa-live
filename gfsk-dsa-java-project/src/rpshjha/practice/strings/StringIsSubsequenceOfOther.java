package rpshjha.practice.strings;

public class StringIsSubsequenceOfOther {

    public static void main(String[] args) {


//        String A = "A";
//        String B = "A";

        String A = "AASDFGHJKLLKJHGFDSAASDFGHJKLLKJHGFDSAASDFGHJKL";
        String B = "ASDFGHJKLLKJHGFDSAASDFGHJKLLKJHGFDSAASDFGHJKLASDF";

//        String A = "AXY";
//        String B = "YADXCP";

//        String A = "gksrek";
//        String B = "geeksforgeeks";

        System.out.println(isSubSequence(A, B));
    }


    public static boolean isSubSequence(String A, String B) {
        //code here

        boolean flag = false;
        if (A.length() > B.length()) return false;

        int marker = 0;

        for (int i = 0; i < A.length(); i++) {

            char temp = A.charAt(i);

            if (marker >= B.length())
                flag = false;

            for (int j = marker; j < B.length(); ++j) {

                char tempB = B.charAt(j);

                if (temp == tempB) {

                    if (j >= marker) {
                        marker = j + 1;
                        flag = true;
                        break;
                    } else {
                        return false;
                    }
                } else flag = false;
            }


        }

        return flag;
    }
}
