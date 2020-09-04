package geeks.sorting;

public class QuickSortHoaresAlgorithum {

    private int[] quickSortHoares(int[] arr, int low, int high) {
        int partionPoint = getPartition(arr, low, high);
        quickSortHoares(arr,low,partionPoint);
        quickSortHoares(arr,partionPoint+1,high);
        return arr;
    }

    public int getPartition(int arr[], int low, int high) {

        int i = low - 1;
        int j = high + 1;
        int pivot = arr[high];
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i > j) {
                return i;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        QuickSortHoaresAlgorithum object = new QuickSortHoaresAlgorithum();
        int arr[] = {8,4,7,9,3,10,5};
        int low = 0;
        int high = arr.length - 1;
        object.quickSortHoares(arr, low, high);
        for(int i=0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
