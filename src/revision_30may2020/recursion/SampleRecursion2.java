package revision_30may2020.recursion;

public class SampleRecursion2 {

    public static void funnc2(int n) {

        if (n > 0) {
            funnc2(n - 1);
            System.out.println("Value of n is " + n);
        }
    }

    public static void main(String[] args) {

        int x = 3;
        funnc2(x);

    }

}