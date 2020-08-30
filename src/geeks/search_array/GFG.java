package geeks.search_array;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public int binarySearch(int arr[],int low,int high, int x){
        
        if(arr.length==0){
            return -1;
        }
        if(low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] > x){
            return binarySearch(arr,mid+1,high,x);
        }else if(arr[mid] < x){
            return binarySearch(arr,low,mid-1,x);
        }else{
            
            if(arr[mid]!=arr[mid-1]){
                return mid;
            }else{
                return binarySearch(arr,low,mid-1,x);
            }
        }
        
    }
    
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int T =scan.nextInt();
		for(int i=0; i< T;i++){
		 int N = scan.nextInt();
		 int arr[] = new int[N];
        for(int k=0 ; k < N;k++){
            arr[k] = scan.nextInt();  
        }
        GFG object = new GFG();
        int index = object.binarySearch(arr,0,(arr.length-1),0);
        System.out.println((arr.length - index)+1);
		    
		}
	}
}