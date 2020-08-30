package geeks.search_array;

public class CountTheNumberOfOccurences {

    //linear Search O(n)
    public static int findOccurences(int arr[], int x) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                res++;
            }
        }
        return res;
    }

    //By Binary Search O(Log(n)+n)
    //Here we are finding the first occurence as soon as we get first occurence
    //we check in it's left or right
    public int findOccurencesByBinarySearch(int arr[], int x){
        
        
        int index  = binarySearch(arr, 0, arr.length -1,x);
        if(index ==-1){
            return 0;
        }

        int count =1;
        int left  =index -1;
        while(left >= 0 && arr[left]==x){
            count++;
            left--;
        }

        int right = index +1 ;
        while(right < arr.length && arr[right]==x){
            count++;
            right++;
        }

        return  count;

    }

    public int binarySearch(int arr[],int low, int high, int x){

        if(high < low){
            return -1;
        }
        int mid = (low+high)/2;
        
        if(arr[mid]==x){
            return mid;
        }

        if(arr[mid] > x){
            return binarySearch(arr, 0, mid -1, x);
        }
        return binarySearch(arr, mid+1, high, x);
    }


    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 2, 2, 3, 4 };
        int x = 5;
        //int numberOfOccurences = findOccurences(arr, x);
        //System.out.println(numberOfOccurences);

        //Binary Search
        CountTheNumberOfOccurences object = new CountTheNumberOfOccurences ();
        int numberOfOccurences = object.findOccurencesByBinarySearch(arr, x);
        System.out.println(numberOfOccurences +" by Binary Search");

    }

}