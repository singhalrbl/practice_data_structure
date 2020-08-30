package search;

/**
 * Linearsearch
 */
public class Linearsearch {

    //Transposation 
    public int [] transposationAlgorithum(int a[],int searchKey,int indexFound){
        return swapTwoElements(indexFound, a);
    }

    public int[] swapTwoElements(int indexFound, int a[]){
        int temp=0;
        temp = a[indexFound -1];
        a[indexFound -1] =a[indexFound];
        a[indexFound] =temp;
        return a;
    }

    //move to header

    public int searchElement(int a[], int searchKey) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == searchKey) {
                return i;
            }

        }

        return -1;

    }

    public void display(int a[]){

        for(int i=0 ; i < a.length; i++){

            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Lenght of the array "+a.length);
        Linearsearch li = new Linearsearch();
        int index = li.searchElement(a, 7);
        li.display(li.transposationAlgorithum(a, 7, index));
        //System.out.println(index);
    }

}