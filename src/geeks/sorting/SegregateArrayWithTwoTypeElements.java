package geeks.sorting;

public class SegregateArrayWithTwoTypeElements {

    public int[] sortArray(int arr[], int low, int high) {
        int i = low - 1;
        int j = high + 1;
        int pivot = arr[low];
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] >= pivot);
            if (i >= j) {
                return arr;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
    }

    public int[] sortOddEven(int arr[], int low, int high) {
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] % 2 != 0);
            do {
                j--;
            } while (arr[j] % 2 == 0);

            if (i >= j) {
                return arr;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        // int arr[] ={15,-3,-2,16,16,19,19,20,-1,-4,-5};
        // int arr[] ={1,0,1,0,1,0,1,1,1,0};
        int arr[] = { 15, 14, 12, 13, 9, 8, 4 };
        SegregateArrayWithTwoTypeElements object = new SegregateArrayWithTwoTypeElements();
        int low = 0;
        int high = arr.length - 1;
        // int display[] =object.sortArray(arr,low,high);
        int display[] = object.sortOddEven(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + display[i]);
        }

    }

}
