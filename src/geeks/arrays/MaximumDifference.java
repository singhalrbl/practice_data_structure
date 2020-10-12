package geeks.arrays;

public class MaximumDifference {

    public static int maxDifference(int arr[]) {
        int res = arr[1] - arr[0];
        int min =arr[0];
        for(int i=0;i < arr.length;i++){
            res = Integer.max(res,arr[i]-min);
            min =Integer.min(min,arr[i]); 
        }
        return res;
    }

    public static void main(String[] args) {
        
        //int arr[] ={2,3,10,6,4,8,1};
        //int arr[] ={7,9,5,6,3,2};
        //int arr[] ={10,20,30};
        int arr[]  ={30,10,8,2};
        System.out.println(maxDifference(arr));
    }    
}
