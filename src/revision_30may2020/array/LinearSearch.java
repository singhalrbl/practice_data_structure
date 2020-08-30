package revision_30may2020.array;

import java.util.Scanner;

public class LinearSearch {

    public int[] getArray(int length){
        return new int[length];
    }

    public int[] insertDataInArray(int[] arr,int size){

        Scanner data = new Scanner(System.in);
        for(int i=0; i< size;i++){
            System.out.print("insert data in array");
            arr[i] = data.nextInt();
        }
        //data.close();
        return arr;
    }

    public void displayData(int[] arr){
        for(int i=0; i < arr.length;i++){
                System.out.print(arr[i]+" ");
        }
    }

   public int linearSearch(int [] array,int elementTosearch){
    int i;
        for(i=0 ; i< array.length-1;i++){
            if(array[i]==elementTosearch){
                return i;
            }

        }

    return -1;
   } 


    public static void main(String args[]){


            LinearSearch object = new LinearSearch();

            //create array
            System.out.println("input length");
            Scanner scan = new Scanner(System.in);
            int[] arr = object.getArray(scan.nextInt());

            //insert data in array
            System.out.println("Input size");
            int [] arrAfterInsert =object.insertDataInArray(arr, scan.nextInt());

            //display data
            System.out.println("Display Data");
            object.displayData(arrAfterInsert);

            //searching element
            System.out.println("Enter search key");
           int index = object.linearSearch(arrAfterInsert,scan.nextInt());
        System.out.println("Index of search key "+index);
    }
    
}