
package Array;

/**
 * SimpleInsertionDeletion
 */
public class SimpleInsertionDeletion {

    public static void main(String[] args) {

        Integer[] arrElem = new Integer[100];
        
        // Insert some elements
        arrElem[0] = 2;
        arrElem[1] = 4;
        arrElem[2] = 6;
        arrElem[3] = 8;
        arrElem[4] = 10;
        arrElem[5] = 12;
        int lenghtOfArr =6;
        // Display of elements
        for (int i = 0; i < lenghtOfArr; i++) {
            System.out.println("Display of elements : " + arrElem[i]);
        }

        // searching for particular element say 8
        Integer searchKey = 8;
        for (int i = 0; i < lenghtOfArr; i++) {
            if (arrElem[i] == searchKey) {
                System.out.println("Found key at index " + i);
                break;
            }

        }
        System.out.println("found the elemenet in the key as " + searchKey);
        int j=0;
        // Deletion of element from the array say 8
        for ( j = 0; j <lenghtOfArr; j++) {
            if (arrElem[j] == searchKey) {
                break;
            }
           
        }
        for (int k = j; k < lenghtOfArr -1; k++) {
            arrElem[k] = arrElem[k + 1];
        }
       lenghtOfArr=lenghtOfArr -1;

        for (int i = 0; i < lenghtOfArr; i++) {
            System.out.println("Display of elements : " + arrElem[i]);
        }



    }

}