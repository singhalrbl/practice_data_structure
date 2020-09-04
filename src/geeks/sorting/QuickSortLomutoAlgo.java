package geeks.sorting;

public class QuickSortLomutoAlgo {

    public int[] quickSortLomutoAlgorithum(int arr[], int low, int high) {
        if(low < high){
        int partitionPoint = lomutopartition(arr, low, high);
        System.out.println("Partition Point is " + partitionPoint);
        quickSortLomutoAlgorithum(arr,low,partitionPoint-1);
        quickSortLomutoAlgorithum(arr,partitionPoint+1,high);
    }
        return arr;
    }

    public  int lomutopartition(int arr[], int low, int high) {
        System.out.println("low "+low);
        System.out.println("high "+high);
        int i = low - 1;
        int j = low;
        int pivot = arr[high];

        while (j < high-1) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            } else {
                j++;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void main(String[] args) {

        QuickSortLomutoAlgo object = new QuickSortLomutoAlgo();
        int arr[] = {8,4,7,9,3,10,5};
        int low = 0;
        int high = arr.length - 1;
        object.quickSortLomutoAlgorithum(arr, low, high);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}