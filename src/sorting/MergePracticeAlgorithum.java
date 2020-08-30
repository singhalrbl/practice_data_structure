package sorting;

/**
 * learn Merging Before Merge Sort.  we must try different Merging algoritum to better
 * understand merge sort.
 */
public class MergePracticeAlgorithum {

    public static void main(String[] args) {

        int[] arrA = { 2, 8, 15, 18 ,19,20,21} ;
        int[] arrB = { 5, 9, 12, 17,22 };
        int[] arrC = new int[(arrA.length + arrB.length)];
        System.out.println("Lenght of array" + (arrA.length + arrB.length));
        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < arrA.length) && (j < arrB.length)) {
            if (arrA[i] < arrB[j]) {
                arrC[k] = arrA[i];
                i++;
                k++;

            } else {
                arrC[k] = arrB[j];
                j++;
                k++;
            }
        }

         while (i < arrA.length) {
            arrC[k] = arrA[i];
            i++;
            k++;

        }

        while( j < arrB.length){
            arrC[k] = arrB[j];
            j++;

        }
        for (k = 0; k < arrC.length; k++) {
            System.out.println("sorted array is " + arrC[k]);
        }
    }
}