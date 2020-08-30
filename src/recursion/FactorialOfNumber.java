package recursion;

/**
 * FactorialOfNumber
 */
public class FactorialOfNumber {

    int sum = 1;

    public int factorial(int n) {
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(new FactorialOfNumber().factorial(5));

    }
}