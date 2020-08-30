package geeks.search_array;

public class GeeksVideos {

}

class BinarySearchVideo1 {

    public int searchTheElement(int arr[], int low, int high, int x) {
        if (arr.length == 0) {
            return -1;
        }
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            return mid;
        }
        if (x > arr[mid]) {
            return searchTheElement(arr, (mid + 1), high, x);
        } else {
            return searchTheElement(arr, low, (mid - 1), x);
        }

    }

}

class FirstOccurenceOfelement {

    public int searchTheIndex(int arr[], int low, int high, int x) {

        if (arr.length == 0) {
            return -1;
        }

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (x > arr[mid]) {
            return searchTheIndex(arr, mid + 1, high, x);
        } else if (x < arr[mid]) {
            return searchTheIndex(arr, low, mid - 1, x);
        } else if (mid == 0 || arr[mid - 1] != arr[mid]) {
            return mid;
        } else {
            return searchTheIndex(arr, low, mid - 1, x);
        }
    }

}


class findAlltheOccurences {

    public int calculateOccurences(int arr[], int x) {

        int mid = binarySearch(arr, 0, arr.length - 1, x);
        int count = 0;
        if (mid > 0) {
            int left = mid;
            while (left >= 0 && arr[left] == x) {
                left--;
                count++;
            }
            int right = mid + 1;
            while (right < arr.length && arr[right] == x) {
                right++;
                count++;
            }
        }

        return count;

    }

    public int binarySearch(int arr[], int low, int high, int x) {
        if (arr.length == 0) {
            return 0;
        }
        if (low > high) {
            return 0;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (x > arr[mid]) {
            return binarySearch(arr, (mid + 1), high, x);
        } else {
            return binarySearch(arr, low, (mid + 1), x);
        }
    }

    public static void main(String args[]) {

        // BinarySearchVideo1 object = new BinarySearchVideo1();
        // int arr[] ={10,20,30,40,50,60};
        // int arr[] ={5,10,15,25};
        // int arr[] ={5,15,25};
        // int arr[] ={10,15};
        // int arr[] ={10,10};
        // int index =object.searchTheElement(arr, 0, arr.length-1 ,10);
        // System.out.println(index);

        FirstOccurenceOfelement object1 = new FirstOccurenceOfelement();
        // int arr[] ={1,10,10,10,20,20,40} ;
        // int arr[] ={10,20,20} ;
        int arr[] = {};
        int indexOfFirstOccurence = object1.searchTheIndex(arr, 0, arr.length - 1, 15);
        System.out.println(indexOfFirstOccurence);

        // findAlltheOccurences object = new findAlltheOccurences();
        // int arr[] = {10,20,20,20,20,30,40};
        // int count =object.calculateOccurences(arr,15);
        // System.out.println(count);
    }
}
