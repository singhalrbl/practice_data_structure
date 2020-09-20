package geeks.hashing;

public class NaivePairWithGivenSum {

    public static boolean pairWithGivenSum(int arr[], int sum){

        for(int i=0;i < arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){

      //  int arr[] ={3,2,8,15,-8};
      //  int arr[] ={2,4,6,3};
        int arr[] ={5,8,-3,6};

      // int sum=17;
      // int sum=11;
       int sum=3;
      System.out.println(  pairWithGivenSum(arr, sum));


    }
    
}
