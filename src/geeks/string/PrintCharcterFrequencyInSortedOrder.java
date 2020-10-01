package geeks.string;

public class PrintCharcterFrequencyInSortedOrder {

    //other approach can be Arrays.sort
    public static void printResultOfString(String str){

        int count[] = new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(count[i]> 0)
            System.out.println((char)(i+'a')+" "+count[i]);
        }
    }

    public static void main(String[] args) {
        
        printResultOfString("geeksforgeeks");


    }
    
}
