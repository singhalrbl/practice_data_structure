package revision_30may2020.array;

import java.util.Scanner;

public class BinarySearch {

    public int[] getArray(int length){
        return new int[length];
    }

    public int [] inputDataInArray(int arr[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of the array");
        int size =scan.nextInt();
        for(int i =0;i<size  ;i++){
            System.out.println("Input number:");
            arr[i]=scan.nextInt();
        }
        return arr;
    }

    public int searchTheElement(int arr[], int key){

        int low=0;
        int high=arr.length -1;
        while(low<= high){
            int mid =((low +high)/2);
            if(arr[mid]==key){
                System.out.println("Key is at Index :"+mid);
                return 1;
            }
            else if(key < arr[mid]){
                high = mid -1;    
            }else{
                low = mid +1;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        BinarySearch object = new BinarySearch();
        System.out.println("Input length of the array");
        Scanner scan = new Scanner(System.in);
        int arr [] =object.getArray(scan.nextInt());
        int arrAfterInsert[] = object.inputDataInArray(arr);
        System.out.println("input Key to Find");
        int flag = object.searchTheElement(arrAfterInsert, scan.nextInt());
        scan.close();
        if(flag==-1){
        System.out.println("Data not found");
    }

    }


    
}