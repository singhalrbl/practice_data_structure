package geeks.hashing;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean checkPair(int arr[], int sum) {

        HashSet<Integer> object = new HashSet<Integer>();

        /* for (int i = 0; i < arr.length; i++) {
            
            object.add(arr[i]);
        } */
        for (int i = 0; i < arr.length; i++) {
            if (object.contains(sum - arr[i])) {
                return true;
            }else{
                object.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String args[]) {

        //int arr[] = { 3, 2, 8, 15, -8 };
         //int arr[] ={2,4,6,3};
      //   int arr[] = { 5, 8, -3, 6 };
      int arr[]={11,5,6};

        //int sum = 17;
        // int sum=11;
     //    int sum = 3;
     int sum=10;

        System.out.println(checkPair(arr, sum));

    }

}
