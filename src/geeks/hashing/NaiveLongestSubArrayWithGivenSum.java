package geeks.hashing;

public class NaiveLongestSubArrayWithGivenSum {


    public static void main(String[] args) {
        
        //int arr[]={5,8,-4,-4,9,-2,2};
        int arr[]={3,1,0,1,8,2,3,6};
        //int arr[]={8,3,7};
        //int data=0;
        int data=5;
        //int data=15;
       System.out.println(longestSubArrayWithGivenSum(arr,data)); 

    }

    private static int longestSubArrayWithGivenSum(int[] arr,int data) {

        int length=0;
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==data){
                    if((j-i+1)>length){
                        length=j-i+1;
                    }
                   
                }
            }
        }
        return length;
    }
    
}
