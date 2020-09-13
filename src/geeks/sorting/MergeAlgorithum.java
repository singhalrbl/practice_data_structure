package geeks.sorting;

public class MergeAlgorithum {

    public int[] mergeSort(int arr[], int low, int high) {

        if (low <high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }

    public void merge(int arr[], int low, int mid, int high){

        int a[] = new int[mid-low+1];
        int b[] =new int[high-mid];

        for(int i=0;i < a.length;i++){
            a[i]=arr[low+i];
        }
        for(int j=0; j<b.length;j++){
            b[j]=arr[mid+1+j];
        }
        int i=0;int j=0; int index=0;
        while(i< a.length && j < b.length){
            if(a[i] <= b[j]){
                arr[index]=a[i];
                i++;
                index++;
            }else{
                arr[index]=b[j];
                j++;
                index++;
            }
        }
            while(i< a.length){
                arr[index]=a[i];
                i++;
                index++;
            }

            while(j < b.length){
                arr[index]=b[j];
                j++;
                index++;
            }

        }

    public static void main(String[] args) {

        MergeAlgorithum object = new MergeAlgorithum();
        int arr[] ={38,27,43,3,9,82,10};
        int low=0;
        int high=arr.length-1;
        //object.merge(arr, low,3 ,high);
        object.mergeSort(arr, low, high);
        for(int i=0; i < arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

}
