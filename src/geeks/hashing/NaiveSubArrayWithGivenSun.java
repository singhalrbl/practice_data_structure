package geeks.hashing;

public class NaiveSubArrayWithGivenSun {
    
    public static boolean subArrayWithGivenSum(int arr[],int sum){

        for(int i=0;i < arr.length;i++){
            int data=0;
            for(int j=i;j<arr.length;j++){
                data=data+arr[j];
                if(data==sum){
                    return true;
            }

        }
               
    }
    return false;
}

    public static void main(String[] args) {
        int arr[] ={5,8,6,13,-3,10};
        //int arr[] ={15,2,8,10,-8,6};
        //int arr[] ={3,2,5,6};
        int sum=25;
        //int sum=3;
        //int sum=10;
        System.out.println( subArrayWithGivenSum(arr,sum));

    }

}
