package geeks.hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    public static int maxLengthSubbArray(int arr[], int sum){
        HashMap<Integer,Integer> object = new HashMap<Integer,Integer>();
        int prefix_sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            prefix_sum=prefix_sum+arr[i];
            if(prefix_sum==sum){
                return i+1;
            }
            if(!object.containsKey(prefix_sum)){
                object.put(prefix_sum,i);
            }
            if(object.containsKey(prefix_sum-sum)){
                if(i-(object.get(prefix_sum-sum))> max){
                    max=i-(object.get(prefix_sum-sum));
                }
            }
        }
        return max;
    }


    public static void main(String args[]){
        //int arr[] ={8,3,1,5,-6,6,2,2};
        //int sum=4;
        //int arr[] ={5,8,-4,-4,9,-2,2};
        //int sum=0;
        int arr[]={3,1,0,1,8,2,3,6};
        int sum=5;
        System.out.println(maxLengthSubbArray(arr,sum));
    }
    
}
