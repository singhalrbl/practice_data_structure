package revision_30may2020.array;
import java.util.Scanner;

public class LinearSearchTranspositionMethod {

    public int [] getArray(int length){
        
        return new int[length];
    }

    public void displayTheElements(int [] arr){

        for(int i=0;i<arr.length;i++){
            System.out.println("Elements in array ");
            System.out.print(arr[i]+" ");
        }
        
    }

    public int[] swap(int arr[],int i){
        int temp =arr[i-1];
        arr[i-1] =arr[i];
        arr[i]=temp;
            return arr;
    }

    public int search(int [] arr,int elementToSearch){
            int i;
        for(i=0;i< arr.length;i++){
            if(arr[i]==elementToSearch){
                swap(arr,i);
                return i; 
            }
        }
            return -1;
    }

    public static void main(String args[]){

    LinearSearchTranspositionMethod object = new LinearSearchTranspositionMethod();
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
    object.search(a, scan.nextInt());
    scan.close();
    System.out.println("Display elements");
    object.displayTheElements(a);


    }

    
}