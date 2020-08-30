package recursion;

/**
 * ResursiveSumOfNaturalNumbers
 */
public class ResursiveSumOfNaturalNumbers {

    int sum = 0;

    public int sum(int n) {

        if (n > 0) {

            sum=sum(n - 1)+n;
        }

        return sum;
    }

    public static void main(String[] args) {

        ResursiveSumOfNaturalNumbers object = new ResursiveSumOfNaturalNumbers();
        System.out.println(object.sum(4));
        
    }
}