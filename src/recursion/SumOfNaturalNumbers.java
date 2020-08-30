package recursion;

/**
 * SumOfNaturalNumbers
 */
public class SumOfNaturalNumbers {

    int n = 0;
    int sum = 0;

    // formula for n Natural Number
    // n*(n+1)/2
    /*
     * public int sum(int n){ return n*(n+1)/2 }
     */

    public int sum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    /*
     * public int sum(int n) {
     * 
     * for(int i =1 ; i<=n ; i++){ System.out.println(sum); sum = sum + i; } return
     * sum;
     * 
     * }
     */
    public static void main(String[] args) {

        SumOfNaturalNumbers object = new SumOfNaturalNumbers();
        System.out.println(object.sum(4));

    }
}