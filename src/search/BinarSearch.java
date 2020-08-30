package search;

/**
 * BinarSearch
 */
public class BinarSearch {

    public static void main(String args[]){
        int[] arr ={2,3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
        int l=0;
        int h=arr.length -1;
        //int i=0;
        int searchKey=65;
        int mid=0;

        while(true){
            if(l<=h){
                mid = (l+h)/2;
            }else{
                System.out.println("could not found the element");
                System.exit(0);
            }
            if(arr[mid]==searchKey){
                break;
            }if(searchKey > arr[mid]){
                l = mid +1;
            }else{
                h = mid -1 ;
            }
        }  
        System.out.println("we found the search key "+arr[mid]);
    }
}