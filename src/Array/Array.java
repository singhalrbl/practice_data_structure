package Array;

import java.util.Scanner;

/**
 * Array  
 */
public class Array {

    public static int[] createAnArray(Scanner in) {

        System.out.println("enter size of an array");
        int size = in.nextInt();
        int a[] = new int[size];
        return a;
    }

    public static int[] insertElementInArray(int a[], Scanner in) {

        System.out.println("Enter all elements in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    public static void displayElements(int a[]) {
        System.out.println("Diaplaying elements in an array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a[] = createAnArray(in);
        displayElements(insertElementInArray(a, in));

    }
}
