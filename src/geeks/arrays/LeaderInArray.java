package geeks.arrays;

public class LeaderInArray {

    public static void main(String[] args) {
        
        int arr[] ={7,10,4,3,6,5,2};
       // int arr[] ={10,20,30};
        //int arr[] ={30,20,10};

        leadersInArr(arr);        
    }

    private static void leadersInArr(int[] arr) {
        int current_max = arr[arr.length-1];
        System.out.println(arr[arr.length-1]);
        for(int i= arr.length-2; i >= 0;i--){
            if(arr[i] > current_max){
               System.out.println(arr[i]);
               current_max = Integer.max(arr[i],current_max);
            } 

        }

    }
    
}
