package geeks.sorting;

public class SegregateArrayWithThreeTypeElements {

 /*    public int sortArrayRange(int arr[]){



        
    } */
    
    public int[] sortThreeWayArray(int arr[],int mid){
        int i=0;
        int j=0;
        int k=arr.length;

        while(j<k){
            if(arr[j] < mid){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else if(arr[j]> mid){
                k--;
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
            }else{
                j++;
            }
        }
        return arr;
    }

    public static   void main(String[] args) {

        SegregateArrayWithThreeTypeElements object = new SegregateArrayWithThreeTypeElements();
        //int arr[] ={0,1,0,2,1,2};
        int arr[] ={2,1,2,1,10,20,10,20,30};
        int display[]=object.sortThreeWayArray(arr,10);
        for(int i=0;i < display.length;i++){
            System.out.print(" "+arr[i]);
        }

        



    }
    
}
