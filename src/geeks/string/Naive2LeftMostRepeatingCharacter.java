package geeks.string;

/**
 * Naive2LeftMostRepeatingCharacter
 */
public class Naive2LeftMostRepeatingCharacter {

    private static int leftMostRepaetingCharacter(String str){

        final int CHAR=256;
        int count[] = new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }

        for(int i=0;i<CHAR;i++){
        if(count[str.charAt(i)]> 1){
            return i;
        }
    }
        return -1;
    }

    public static void main(String[] args) {
        
        String input1 ="geeksforgeeks"; //o:1
        String input2 ="abbcc"; //o:1
        String input3 ="abcd"; //-1

        System.out.println(leftMostRepaetingCharacter(input2));        
    }
}