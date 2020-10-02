package geeks.hashing;

import java.util.HashSet;

public class LongestSubArrayWithSumZero {


    public static void main(String[] args) {
        
             //int arr[]={5,8,-4,-4,9,-2,2};
        //int arr[]={3,1,0,1,8,2,3,6};
        int arr[]={8,3,7};
        //int data=0;
        //int data=5;
        int data=15;

        System.out.println(longestSubArrayWithGivenSum(arr,data));

    }

    private static int longestSubArrayWithGivenSum(int[] arr, int data) {

        HashSet<Integer> object = new HashSet<>();
        int prefix_sum=0;
        for(int i=0;i<arr.length;i++){
            prefix_sum=prefix_sum+arr[i];
            if(object.contains(prefix_sum-data)){
                return i;
            }else{
                object.add(prefix_sum);
            }
        }
        return 0;
    }
    
}
