package geeks.hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    
    public static void main(String[] args) {
        
        //int arr[] ={5,8,6,13,3,-1};
        int arr[] ={15,2,8,10,-5,-8,6};
        //int arr[] ={3,2,5,6};
        //int sum=22;
        int sum=3;
        //int sum=10;
        System.out.println( subArrayWithGivenSum(arr,sum));
        
    }

    private static boolean subArrayWithGivenSum(int[] arr, int sum) {
        HashSet<Integer> object = new HashSet<Integer>();
        int prefix_sum=0;
        for(int i=0;i<arr.length;i++){
            prefix_sum=prefix_sum+arr[i];
            if(prefix_sum==0){
                return true;
            }
           if(object.contains(prefix_sum-sum)){
               return true;
           }else{
               object.add(prefix_sum);
           }
        }

        return false;
    }


    
}
