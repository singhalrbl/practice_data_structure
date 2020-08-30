package revision_30may2020.recursion;
class sampleRecursion {

    public static void fun1(int n) {

        if (n > 0) {

            System.out.println("value of n is " + n);
            fun1(n - 1);

        }
    }

    public static void main(String args[]) {

        int x =3;
        fun1(x);
    }

}
