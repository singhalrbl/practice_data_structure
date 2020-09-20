package geeks.hashing;

import java.util.HashSet;

public class CountDistinctElement {

    public static int countElements(int arr[]) {

        HashSet<Integer> object = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            object.add(arr[i]);
        }
        return object.size();
    }

    public static void main(String[] args) {
        int arr[] = { 15, 12, 13, 12, 13, 13, 18 };
        System.out.println(countElements(arr));
    }

}
