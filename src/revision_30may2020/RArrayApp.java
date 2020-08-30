package revision_30may2020;

public class RArrayApp {

    // Display elements in Array

    public void displayElements(long[] arrElement) {

        for (int i = 0; i < arrElement.length; i++) {
            System.out.println(arrElement[i]);
        }

    }

    //search an element in array
    public void searchTheElement(long[] arrElement, int searchKey){

        System.out.println("Lenght of the array, "+arrElement.length);
        for(int i=0;i<arrElement.length;i++){
            if(arrElement[i]==searchKey){
                System.out.println("search key found on index "+i+" and the lement is "+arrElement[i]);
                break;
            }
        }
        System.out.println("Can't find the search key");

    }

    //search the key and delete the element
    public void deleteTheKey(long[] arrElement,int searchKey ){
        Integer searachIndex=null;
        int i;
        System.out.println("Lenght of the array, "+arrElement.length);
        for( i=0;i<arrElement.length;i++){
            if(arrElement[i]==searchKey){
                System.out.println("search key found on index "+i+" and the lement is "+arrElement[i]);
                searachIndex = i;
                break;
            }
        }
        for(int j=i ;j<arrElement.length -1;j++){
            arrElement[j]=arrElement[j+1];
    }
      

        displayElements(arrElement);

    }

    public static void main(String args[]) {

        long[] arr;
        arr = new long[20];

        arr[0] = -10;
        arr[1] = 0;
        arr[2] = 10;
        arr[3] = 20;
        arr[4] = 30;
        arr[5] = 40;
        arr[6] = 50;
        arr[7] = 60;
        arr[8] = 70;
        arr[9] = 80;
        arr[10] = 90;

        RArrayApp object = new RArrayApp();
        //object.displayElements(arr);
        //object.searchTheElement(arr, 100);
        object.deleteTheKey(arr, 70);
        //object.displayElements(arr);

    }

}