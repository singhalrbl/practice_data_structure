package geeks.recursion;

public class SumOfNatualnumber {

    public static int func(int n){

        if(n==0){
            return 0;
        }
        return n+func(n-1);
    }

    public static void main(String args[]){

        System.out.println(func(1));


    }
    

    
}
