package geeks.search_array;

/* https://www.geeksforgeeks.org/find-the-missing-number/ */

public class MissingNumber {

    public int returnMissingNumber(int arr[]) {

        // since the number is missing from the array, atual length of the array is
        // arr.length +1
        int n = arr.length + 1;

        // sum of the contents in the array is
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // total of n natural no. in array is
        int total = n * (n + 1) / 2;
        return total - sum;
    }

    public static void main(String args[]) {

        int arr[] ={13, 12, 11, 15};
        System.out.println(arr.length);
        MissingNumber object = new MissingNumber();
        int missingNumber = object.returnMissingNumber(arr);
        System.out.println("Missing Number is " + missingNumber);
    }

}