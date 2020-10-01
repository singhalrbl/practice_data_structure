package geeks.string;

public class FunctionsInString {

    public static void main(String args[]){

        //indexOf() return negative value if string s2 is not present is s1
        //if it has the value it will return first occurence of the index
        //if we compare this with,contains() function return boolean 
        String s8="geeksforgeeks";
        String s9 ="geeks";
        System.out.println("indexOf() "+s8.indexOf(s9));
        System.out.println("indexOf() "+s8.indexOf(s9,1));

        //CompareTo() function-- compares function lexographically
        String s1="geeksforgeeks";
        String s2="her";
        
        int res = s1.compareTo(s2);
        if(res==0){
            System.out.println("same");
        }else if(res <0){
            System.out.println("less than");
        }else{
            System.out.println("greater than");
        }

        //equals()
        String s3="geeksforgeeks";
        String s4="geeksforgeeks";

        System.out.println(s3.equals(s4));

        //intresting fact about java
        String s5="geeks";
        String s6="geeks";
        String s7 =new String("geeks");
        System.out.println("are they equal");
        if(s5==s6){
            System.out.println("they are same");
        }else{
            System.out.println("they are different");
        }

        if(s5==s7){
            System.out.println("They are same");
        }else{
            System.out.println("They are different");
        }
    }
    
}
