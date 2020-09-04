package geeks.sorting;

public class MergeTwoArrays {

    public int[] merge(int a[], int b[]){

        int temp[] = new int[a.length+b.length];
        
        int i=0; int j=0; int index=0;

        while(i< a.length && j < b.length){

            if(a[i] <= b[j]){
                temp[index]=a[i];
                i++;
                index++;
            }else{
                temp[index]=b[j];
                j++;
                index++;
            }
        }
        while(i<a.length){
            temp[index]=a[i];
            i++;
            index++;
        }
        while(j < b.length){
            temp[index]=b[j];
            j++;
            index++;
        }
        return temp;
    }


    public static void main(String args[]){
        MergeTwoArrays object = new MergeTwoArrays();
        int a[] ={10,15,20,40};
        int b[] ={5,6,6,10,15};
        int display[] =object.merge(a,b);
        for(int i=0; i < display.length;i++){
            System.out.print(" "+display[i]);
        }



    }
    
}
