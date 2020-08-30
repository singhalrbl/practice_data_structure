package sorting;

public class Test {

    public int[] naivePartition(int arr[], int low, int high, int pivot) {

        System.out.println("Low is " + low);
        System.out.println("High is " + low);
        System.out.println("Pivot is " + low);
        int temp[] = new int[high - low + 1];
        int index = 0;
        for (int i = low; i <= high; i++) {
            if (arr[i] <= pivot) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = low; i <= high; i++)
            if (arr[i] > pivot) {
                temp[index] = arr[i];
                index++;
            }

        for(int i=0;i< arr.length;i++){
            arr[i]=temp[i];
        }

        return arr;
    }

    public static void main(String args[]) {

        Test object = new Test();
        int arr[] = { 3, 8, 6, 12, 10, 7 };
        int low = 0;
        int high = arr.length - 1;
        int pivot = arr[high];
    int display[] =object.naivePartition(arr, low, high, pivot);
        for(int i=0; i< display.length;i++){
            System.out.print(" "+display[i]);
        }
    }

}