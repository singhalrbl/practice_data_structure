 package sorting;

 public class BubbleSortAlgorithum {
    //Bubble sort min time complexity is O(n) and maximum is O(n2)
    //lets take example of arr[] ={8,5,7,3,2}

    public int[] bubbleSort(int arr[]){

        for(int i=0 ; i < arr.length ; i++)
        {
            for(int j =0;j < arr.length-1-i ;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        
        int arr[] ={8,5,7,3,2};

        BubbleSortAlgorithum object = new BubbleSortAlgorithum();
        int arrResult[] =object.bubbleSort(arr);
        
        //Display function after result
        for(int i =0 ; i < arrResult.length ;i++ ){
            System.out.print(" "+arrResult[i]);
        }

    }

    
}