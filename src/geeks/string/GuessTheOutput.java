package geeks.string;

public class GuessTheOutput {

    public static void main(String[] args) {
        
        String s1="geeks";
        String s2 = s1;

        s1=s1+"forgeeks";
        System.out.println(s1);

        System.out.println(s1==s2);

    }
    
}
