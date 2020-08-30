 package recursion;

class StaticAndGlobalRecursion {

    static int xy = 0;
    public   int func(int n){
         
        if (n > 0){
            xy++;
          return  func(n-1) + xy;
        }

        return 0;
    }

    public static void main(String[] args) {

        int x =5;
        StaticAndGlobalRecursion a = new StaticAndGlobalRecursion();
        System.out.println(a.func(5));
        
    }

    
}