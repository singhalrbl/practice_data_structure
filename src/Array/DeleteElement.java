package Array;

/**
 * DeleteElement
 */
public class DeleteElement {

    public static int[] deleteElement(int index,int a[]){

            for(int i=index ; i < a.length -1 ;i++){

                a[i] = a[i+1]; 
            }

            for(int i=0 ; i < a.length -1 ;i++){

               System.out.println("display elements");
               System.out.println(a[i]);
            }

            return a;
    }
    

    public static void main(String[] args) {


    
        int a[] ={1,2,3,4,5,6};

        deleteElement(3, a);

    }
}