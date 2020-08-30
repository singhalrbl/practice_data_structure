package revision_30may2020.array;

public class ReverseArray extends ArrayParent {

    // Method1- reverse copy the array to another array and thenagain copy into same
    // array
    public int[] reverseArrayMethod1(int arr[], int lengthOfCopyArray) {

        int[] copyArray = getArray(lengthOfCopyArray);
        for (int i = 0, j = copyArray.length - 1; i < arr.length && j > 0; i++, j--) {
            copyArray[i] = arr[j];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = copyArray[i];
        }
        return arr;
    }

    // Method2 sqp from last to first
    public int[] reverseArrayMethod2(int arr[]) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
            
    public static void main(String[] args) {

        ReverseArray object = new ReverseArray();
        int arr[] = object.getArray(10);
        int arrayafterInsert[] = object.insertDataInArray(arr, 10, 10);
        /*
         * int method1[] =object.reverseArrayMethod1(arrayafterInsert, 10);
         * object.display(method1);
         */
        int method2[] = object.reverseArrayMethod2(arrayafterInsert);
        object.display(method2);

    }

}