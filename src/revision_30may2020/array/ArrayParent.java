package revision_30may2020.array;

import java.util.Scanner;

public class ArrayParent {

    public int[] getArray(int length) {
        return new int[length];
    }

    public int[] insertDataInArray(int arr[], int length, int size) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("enter element");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public int getElement(int index, int arr[]) {
        if ((index > 0) && (index < arr.length)) {
            return arr[index];
        }
        return -1;
    }

    public int[] setElement(int [] arr,int index,int elementToSet){
            if((index > 0) && (index < arr.length )){
                    arr[index] =elementToSet;
            }
                return arr;
    }

    public int maxElement(int arr[]){

        int max =arr[0];
        for(int i=0;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }       
        return max;
    }

    public int minElement(int arr[]){
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]< min){
                min =arr[i];
            }
        }
        return min;
    }

    public int average(int arr[]){
        int sum =0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        return sum/arr.length;
    }

    public int sum(int arr[]){
        int sum =0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public int sumRecursive(int arr[],int n){
        if(n>=0){
            return sumRecursive(arr,n-1)+arr[n];
        }
        return 0;
    }

    public void display(int arr[]){
        System.out.println("Elements in array");
        for(int i=0;i < arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

}
