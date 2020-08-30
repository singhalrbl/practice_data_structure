package revision_30may2020.recursion;

public class TreeRecursion {

    public static void  func(int n){

            if(n > 0){

                    System.out.println(n);
                    func(n-1);
                    func(n-1);

            }


    }

    public static void main(String[] args) {
        
            int a =3;
            func(a);

    }
    
}