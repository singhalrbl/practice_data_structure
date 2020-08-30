 package recursion;

class Example1 {

    public void  function1(int n){

        if( n > 0){
            
            function1(n-1);
            System.out.println(n);
            
        }

    }

    public static void main(String[] args) {
        
        Example1 a = new Example1();
        int x= 3;
        a.function1(x);


    }
}