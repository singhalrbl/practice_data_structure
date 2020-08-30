package Array;

import java.util.Scanner;

/**
 * Insert
 */
public class Insert {

    // insert the element at particular index

    public static int[] insertData(int a[]) {

        for (int i = 0; i < (a.length /2); i++) {

            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void displayData(int a[]) {

        for (int i = 0; i < (a.length); i++) {
            System.out.println(a[i]);
        }
    }


    public static int[] insertAtIndex(int a[], int index, int value) {

        for (int i = a.length-1 ; i > index; i--) {
            a[i] = a[(i-1)];
        }
        a[index] = value;
        return a;
    }

    public static void main(String[] args) {

        int a[] = new int[10];
        int retruned[] =insertData(a);
        System.out.println("display firt time");
        displayData(retruned);
        int altered[] =insertAtIndex(retruned, 3, 13);
        System.out.println("display firt time");
        displayData(altered);

        


    }
}