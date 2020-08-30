package Array;

/**
 * RearrangeNumbers
 */
public class RearrangeNumbers {

    public static void main(String[] args) {
        int arr[] = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int i = 0;
        int j = arr.length - 1;

        while (arr[i] > 0  || arr[j] < 0) {

            if (i < j) {
                int temp = 0;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }else{
                break;
            }
            i++;
            j--;
        }
        for(int k=0;k < arr.length;k++){
            System.out.println(arr[k]);
        }

    }
}