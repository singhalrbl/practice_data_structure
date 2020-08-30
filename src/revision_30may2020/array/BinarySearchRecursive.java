package revision_30may2020.array;

import java.util.Scanner;

public class BinarySearchRecursive {

    public int[] getArray(int length) {
        return new int[length];
    }

    private int[] insertDataInArray(int[] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lenght  of the array is "+arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input Data");
            arr[i] = scan.nextInt();
        }
        scan.close();
        return arr;
    }

    private int binarySearchRecursive(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("data Found at index " + mid);
                return 1;
            } else if (key < arr[mid]) {
                return binarySearchRecursive(arr, low, mid - 1, key);
            } else {
                return binarySearchRecursive(arr, mid + 1, high, key);
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int low=0;
        BinarySearchRecursive obj = new BinarySearchRecursive();
        System.out.println("Enter length");
        Scanner scan = new Scanner(System.in);
       int arr[] = obj.getArray(scan.nextInt());
       int arrayAfterInsert [] = obj.insertDataInArray(arr);
       int flag = obj.binarySearchRecursive(arrayAfterInsert, low, arrayAfterInsert.length -1, 21);
       if(flag==-1){
           System.out.println("Data not Found");
       }
       scan.close();
}

}