package revision_30may2020.array;

import java.util.Scanner;


class CustomArray{
    int size;
    int length;
    int [] customArray;
    public CustomArray(int [] customArray,int size, int length){
        this.customArray = new int [length];
        this.size = size;
        this.length =length;
    }
    public int [] getArray(){
        return  customArray;
    }
}

public class ArrayAdt {

    public CustomArray createArray(int length, int size, int a[]){
        CustomArray arrayObject = new CustomArray(a, size, length) ;      
        return arrayObject;
    } 

    //insert for first time in array
    public int [] insertDataInarray(CustomArray insertData, int size){
        Scanner scan  = new Scanner(System.in);
        int [] data  = insertData.getArray();
        for(int i=0 ; i < size;i++){
            data[i] = scan.nextInt();
        }
        return data;

    }
    
    //display data of array
    public void  displayArray(int[] display){
        for(int i=0; i < display.length;i++){
            System.out.println(display[i]);
        }
    }

    //inserting element at particular index.
    public int [] inserttIndex(int[] arrayAdt,int size, int index,int element){
        for(int i=size ; i > index ; i-- ){
            arrayAdt[i] = arrayAdt[i-1];
        }
        arrayAdt[index] = element;
        return arrayAdt;

    }

    //deleting element at particular index.
    public int [] deleteAtIndex(int [] arrayAdt, int size, int index)
    {
        for(int i=index; i< size -1;i++){
            arrayAdt[i] = arrayAdt[i+1];
        }

        return arrayAdt;    
     }
     
    public static void main(String args[]){
        int [] a = null;
        ArrayAdt object = new ArrayAdt();
        Scanner scan = new Scanner(System.in);

        System.out.println("Input length of the array");
        Integer lengthOfArray = scan.nextInt();

        System.out.println("Input size of the array");
        Integer sizeOfArray = scan.nextInt();
        
        CustomArray array =object.createArray(lengthOfArray,sizeOfArray, a);

        System.out.println("Input data in array");
       int arrayAdt [] = object.insertDataInarray(array, sizeOfArray);

        System.out.println("Display data in array");
        object.displayArray(arrayAdt);

        //inserting at particular index
       /*  System.out.print("inserting data in middle");
        System.out.println("what is the index");
        System.out.println("what is element?");
        int [] finalData =object.inserttIndex(arrayAdt, sizeOfArray, scan.nextInt(), scan.nextInt());

        System.out.println("Display data in array");
        object.displayArray(finalData); */
        
        //deleting at index
        int [] afterDeletion = object.deleteAtIndex(arrayAdt, sizeOfArray,scan.nextInt());
        System.out.println("Display data in array");
        object.displayArray(afterDeletion);

    }

}