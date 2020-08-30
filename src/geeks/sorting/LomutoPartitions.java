package geeks.sorting;

public class LomutoPartitions {

    public int[] lomutoPartitions(int arr[], int low, int high, int pivot) {
        int i = low - 1;
        int j = 0;

        while ( j <= high - 1) {
            if (arr[j] <= pivot) {
                i++;
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            } else {
                j++;
            }
        }
        System.out.println(j);
        System.out.println(i);
        
        int temp;
        temp = arr[i + 1];
        arr[i + 1] = arr[j];
        arr[j] = temp;
        
        return arr;
    }

    public static void main(String args[]) {

        LomutoPartitions object = new LomutoPartitions();
        //int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
        int arr[] = { 70,60,80,40,30 };
        //int arr[] = { 30,40,20,50,80 };
        int low = 0;
        int high = arr.length - 1;
        int pivot = arr[high];
        int display[] = object.lomutoPartitions(arr, low, high, pivot);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + display[i]);
        }
    }
}