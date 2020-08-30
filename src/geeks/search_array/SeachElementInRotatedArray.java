package geeks.search_array;

import java.rmi.server.RemoteRef;

import revision_30may2020.array.BinarySearch;

public class SeachElementInRotatedArray {

    public int search(int arr[],int key){


        int pivotIndex = findPivot(arr,0,arr.length-1);
        System.out.println("Pivot is at index "+pivotIndex);
        if(arr[pivotIndex]==key){
            return pivotIndex;
        }
        if(arr[0] <= key){
            return binarySearch(arr,0,pivotIndex -1,key);
        }
        return binarySearch(arr,pivotIndex +1,arr.length -1,key);
    }

    public int binarySearch(int arr[],int low, int high,int key){

        if(high < low){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(key > arr[mid]){
            return binarySearch(arr, (mid +1), high, key);
        }
        return binarySearch(arr, low, (mid -1), key);
    }

    public int findPivot(int arr[], int low,int high){

        
        if(high < low){
            return -1;
        }
        if(low==high){
            return low;
        }
        int mid = (low+high)/2;
        if(arr[mid] < arr[mid -1]){
            return mid-1;
        }
        if(arr[mid] > arr[mid +1] ){
            return mid;
        }
        if(arr[low] >= arr[mid]){
            return findPivot(arr, low, mid -1);
        }
        return findPivot(arr, mid+1,high); 
    }

    public static void main(String args[]){

        SeachElementInRotatedArray object = new SeachElementInRotatedArray();
        int arr[] =  {5, 6, 7, 8, 9, 10, 1, 2, 3};
        //int arr[] =  {1,2,3,4,5,6,7,8,9};
        int key =5;
       int keyIndex = object.search(arr,key);
       System.out.println(keyIndex);

        

    }

}