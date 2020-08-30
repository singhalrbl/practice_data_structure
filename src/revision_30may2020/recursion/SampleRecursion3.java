package revision_30may2020.recursion;

public class SampleRecursion3 {

    public static int func(int n){

        if(n > 0){
            return func(n-1)+n;
        }

        return 0;

    }
    public static void main(String[] args) {
        
        int a =5;
        System.out.println(func(a));
    }
    
}