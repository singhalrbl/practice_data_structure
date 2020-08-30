package Array;

/**
 * CheckArrrayIsSorted
 */
public class CheckArrrayIsSorted {

    public static void main(String[] args) {
        int arr[] = { 20, 23, 23, 45, 78, 88 };

        for (int i = 1; i < arr.length -1; i++) {

            if(arr[i] <= arr[i+1]){
                continue;
            }else{
                System.out.println("array is not sorted");
            }
        }
    }
}