package sorting;

/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String args[]) {
        int temp=0;
        int arr[] = { 12, 11, 13, 5, 6 };

        for (int i = 1; i < arr.length; i++) {

            for( int j = i ; j > 0  ; j --){

                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }

            }

        }
        for(int i=0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

}