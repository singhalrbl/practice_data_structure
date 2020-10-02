package geeks.string.patternmaching;

public class NaivePattermatchingAlgorithum {

    private static void naivePatterMatching(String input, String pattern) {

        int n = input.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < pattern.length(); j++) {
                if (pattern.charAt(j) != input.charAt(i + j)) {
                    break;
                }
            }

            if (j == m) {
                System.out.println("pattern found at:" + i);
            }
        }

    }

    public static void main(String[] args) {

        // o:2 10
        String input1 = "GEEKSFORGEEKS";
        String pattern1 = "EKS";

        // o:0 1 2
        String input2 = "AAAAA";
        String pattern2 = "AAA";

        // o:-1
        String input3 = "ABCABCD";
        String pattern3 = "ABD";

        naivePatterMatching(input3, pattern3);

    }
    
}
