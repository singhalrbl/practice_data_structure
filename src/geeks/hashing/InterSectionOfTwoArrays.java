package geeks.hashing;

import java.util.HashSet;

/**
 * InterSectionOfTwoArrays
 */
public class InterSectionOfTwoArrays {
    public static int countInterSection(int a[], int b[]) {

        int result = 0;
        HashSet<Integer> object = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            object.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            if (object.contains(b[j])) {
                object.remove(b[j]);
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = { 10, 15, 20, 15, 30, 30, 5 };
        int b[] = { 30, 5, 30, 80 };
        System.out.println(countInterSection(a, b));


    }
}