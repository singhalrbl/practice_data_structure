package revision_30may2020.array;

import java.util.Scanner;

/**
 * LinearSearchMoveToHead
 */
public class LinearSearchMoveToHead {

    public int [] getArray(int length){
        return new int[length];
    }

    public void displayTheElements(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Elements in array ");
            System.out.print(arr[i]+" ");
        }
    }

    public int[] swapToHead(int arr[],int elementFound, int index){
            int header = arr[0];
            arr[0] =elementFound;
            arr[index] = header;
            return arr;
    }

    public int moveToHead(int [] arr,int elementToSearch){
            int i;
        for(i=0;i< arr.length;i++){
            if(arr[i]==elementToSearch){
                swapToHead(arr,arr[i],i);
                return i; 
            }
        }
            return -1;
    }

    public static void main(String args[]){

    LinearSearchMoveToHead object = new LinearSearchMoveToHead();
    int [] a =object.getArray(5);
    
    a[0] =2;
    a[1] =4;
    a[2] =6;
    a[3] =8;
    a[4] =10;
    
    System.out.println("Display elements");
    object.displayTheElements(a);

    System.out.println("Search the element");
    System.out.println("Enter the Element");
    Scanner  scan = new Scanner(System.in);
    object.moveToHead(a, scan.nextInt());
    scan.close();
    System.out.println("Display elements");
    object.displayTheElements(a);
    }

    
}