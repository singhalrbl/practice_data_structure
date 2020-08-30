package revision_30may2020.recursion;

public class StaticRecursion {

    public static int x = 0;

    public static int func(int n) {

        if (n > 0) {
            x++;
            return func(n - 1) + x;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(func(a));

    }

}