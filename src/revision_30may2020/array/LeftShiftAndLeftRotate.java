package revision_30may2020.array;

public class LeftShiftAndLeftRotate extends ArrayParent {

    public int[] leftShiftArray(int arr[]){
        
        for(int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=0;
        return arr; 
    }

    //leftRotate
    public int[] leftRotateArray(int arr[]){
        int temp =arr[0];
        for(int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr; 
    }

    public static void main(String[] args) {
        
        LeftShiftAndLeftRotate object = new LeftShiftAndLeftRotate();
        int arr[] =object.getArray(5);
        int arrayAfterInsert[] = object.insertDataInArray(arr, 5, 5);
        object.display(arrayAfterInsert);
        //leftshift array
        int leftShift[] =object.leftShiftArray(arrayAfterInsert);
        object.display(leftShift);
    }
    
}