package geeks.string;

public class Naive1LeftMostRepeatingCharacter {

    private static int leftMostRepaetingCharacter(String str){

        for(int i=0;i < str.length();i++){
            for(int j=i+1;j < str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        return i;
                    }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        String input1 ="geeksforgeeks"; //o:1
        String input2 ="abbcc"; //o:1
        String input3 ="abcd"; //-1

        System.out.println(leftMostRepaetingCharacter(input3));        
    }
    
}
