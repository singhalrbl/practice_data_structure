package geeks.string;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {


    public static void main(String[] args) {
        
            String input1 = "geeksforgeeks"; // o:0
            String input2 = "abbcc"; // o:1
            String input3 = "abcd"; // -1
    
            System.out.println(leftMostRepaetingCharacter(input3));
    


    }

    private static int leftMostRepaetingCharacter(String str) {
        
        boolean count[] = new boolean[256];
        Arrays.fill(count,false);
        int result=-1;
        for(int i=str.length()-1;i>=0;i--){

            if(count[str.charAt(i)]==true){
                result=i;
            }else{
                count[str.charAt(i)]=true;
            }
        }
        return result ;
    }
    
}
