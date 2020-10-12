package geeks.string.patternmaching;

public class ImprovedNaivePattermatchingAlgorithum {

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
 
         //0: 3 7
         String input4="ABCABCDABCD";
         String patrren4="ABCD";
         improvedNaivePatterMatching(input3, pattern3);


    }

    private static void improvedNaivePatterMatching(String input, String pattern) {

        int n=input.length();
        

    }
    
}
