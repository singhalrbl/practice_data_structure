package geeks.hashing;

public class NaiveSubArrayWithZeroSum {

    public static boolean subArraywithZeroSum(int arr[]){

        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    return true;
                }
                sum=sum+arr[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        //int arr[]={1,4,13,-3,-10,5};
       // int arr[]={1,4,-3,1,2};
        //int arr[]={3,-1,-2,5,6};
        int arr[]={5,6,0,8};
       System.out.println( subArraywithZeroSum(arr));

    }
    
}
