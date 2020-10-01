package geeks.string;

public class CheckAnagram {

    public static Boolean checkAnagramOrNot(String str1, String str2) {
        //corner case
        if(str1.length()!=str2.length()){
            return false;
        }
        int count[] =new int[26];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }
        for(int i=0;i< 26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){

        String str1="aaabc";
        String str2 ="bacaa";
       System.out.println( checkAnagramOrNot(str1,str2));

    }
    
}
