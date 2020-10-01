package geeks.string;

public class Test {

    public static void main(String[] args) {
        
        String str="geeksforgeeks";
        System.out.println(str.length());
        //left assign not allowed eg. str.charAt(3)='a' as string is immutable
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));//[start,end]
        System.out.println(str.substring(2,5)); //[start,End)

        //test ASCII
        int x ='f'+1;
        System.out.println(x);


    }
    
}
