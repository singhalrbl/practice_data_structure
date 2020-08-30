package geeks.search_array;

public class FindTheFirstOccurence {

    // i/p = {10,20,20,20,20,30,40}
    //x= 20
    // o/p =4
    //O(log(n))
    public int binarySearch(int arr[], int low, int high, int x){

        if(arr.length==0){
            return -1;
        }
        if(low > high){
            return -1;
        }
        
        return 0;
    }
    

    public static void main(String args[]){

        FindTheFirstOccurence object = new FindTheFirstOccurence();
        int arr[] ={10,20,20,20,20,30,40};
        object.binarySearch(arr,0,arr.length-1,20);


    }
    
}