package geeks.arrays;

/* https://www.geeksforgeeks.org/array-rotation/ */

public class RotationOfArray {

    public int[] rotate(int arr[],int d,int n){

        for(int i =0; i< d;i++){
           leftRotate(arr,arr.length);               //O(n) *d
        }
        display(arr,n);   

            return arr;
    }

    public void leftRotate(int arr[], int length){

        int temp;
        temp =arr[0];
        int i;
        for(i=0;i < length -1;i++){                            //O(n)                 
            System.out.print(" i="+ i);
              arr[i] =arr[i+1]  ;
        }
        arr[i] = temp;
       
    }

    public void display(int arr[], int length){
        for(int i=0;i < length ;i++){
            System.out.print(" display i="+ i);
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        RotationOfArray object = new RotationOfArray();         //o(n)*d +o(n)
        int arr[] ={1,2,3,4,5,6,7};                             
        object.rotate(arr, 2, arr.length);                      //o(n)*d




    }

    
}