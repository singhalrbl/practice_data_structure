package sorting;

public class NaiveQuickSortAlgorithum {

    public int[] NaiveSort(int arr[], int low, int high, int pivot){

        int temp[] = new int[high-low+1];
        System.out.println("Lenght of temp "+temp.length);
        int index =0;
        for(int i=low; i<=high;i++){
            if(arr[i] <= arr[pivot]){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=low; i<=high;i++){
            if(arr[i] > arr[pivot]){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=low ; i <=high;i++){
                arr[i]=temp[i];
        }
            return arr;
    }

    public static void main(String[] args) {

        NaiveQuickSortAlgorithum object = new NaiveQuickSortAlgorithum();
        int arr[] = {5,13,6, 9, 12,11,8};
        int low=0;
        int high =arr.length-1;
        int pivot =6;
        int display[] = object.NaiveSort(arr,low,high,pivot);
        for(int i=0; i< display.length;i++){
            System.out.print(" "+display[i]);
        }
    }

}