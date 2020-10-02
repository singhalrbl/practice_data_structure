package geeks.string;

import java.util.Arrays;

public class Naive3LeftMostRepeatingCharacter {

    public static void main(String[] args) {
        String input1 = "geeksforgeeks"; // o:0
        String input2 = "abbcc"; // o:1
        String input3 = "abcd"; // -1

        System.out.println(leftMostRepaetingCharacter(input1));
    }

    private static int leftMostRepaetingCharacter(String str) {

        final int CHAR = 256;
        int count[] = new int[CHAR];
        Arrays.fill(count, -1);
        int max = Integer.MAX_VALUE;
        int result = max;
        for (int i = 0; i < str.length(); i++) {
            int first = count[str.charAt(i)];
            if (first == -1) {
                count[str.charAt(i)] = i;
            } else {
                result = Integer.min(first, result);
            }
        }
        return result==max?-1:result;
    }

}
