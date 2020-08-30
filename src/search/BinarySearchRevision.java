package search;

/**
 * BinarySearchRevision
 */
public class BinarySearchRevision {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62 };

        int searchKey = 12;
        int low = 0;
        int high = arr.length -1 ;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == searchKey) {
                    System.out.println("found the element in mid " + arr[mid]);
                }
                if (searchKey > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }

    }