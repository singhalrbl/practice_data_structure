package geeks.string.patternmaching;

public class NaiveLongestSuffuxPrefix {

    private static  void fillLPS(String str,int lps[]){

        for(int i=0; i <str.length();i++){
            lps[i] =longestPrefixSuffix(str,i+1);
        }

        for(int i=0;i<lps.length;i++){
            System.out.print(lps[i]+",");
        }
        

    }

    private static int longestPrefixSuffix(String str, int n) {

        for(int len=n-1;len > 0;len--){
            boolean flag=true;
            for(int i=0;i<len;i++){
                if(str.charAt(i)!=str.charAt(n-len+i)){
                    flag=false;
                }
                if(flag==true){
                    return len;
                }

            }
        }
        return 0;
        
    }

    public static void main(String[] args) {
        String str="ababacab";
        int lps[] = new int[str.length()];
        fillLPS(str, lps);




    }
    
}
