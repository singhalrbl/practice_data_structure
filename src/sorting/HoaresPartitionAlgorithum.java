package sorting;

public class HoaresPartitionAlgorithum {

    public int[] hoaresPartitions(int arr[], int low, int high, int pivot) {
        while (true) {
            int i = low - 1;
            int j = high + 1;
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return arr;
            }
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
       
    }

    public static void main(String[] args) {

        HoaresPartitionAlgorithum object = new HoaresPartitionAlgorithum();
        int arr[] = { 5, 3, 8, 4, 2, 7, 1, 10 };
        int low = 0;
        int high = arr.length - 1;
        int pivot = arr[low];
       int display[] = object.hoaresPartitions(arr, low, high, pivot);
       for(int i=0; i< arr.length;i++){
        System.out.print(" "+display[i]);
    }
    }

}