package geeks.search_array;

public class SearchInInfiniteArray {
    
    public int jumpSearch(int arr[], int x){
        int i=1;
        if(arr[0]==x){
            return 0;
        }
        while(x>arr[i]){
            i=i*2;
            if(arr[i]==x){
                return i;
            }
        }
        return binarySearch(arr,i/2,i-1,x);
    }
    public int binarySearch(int arr[],int low,int high,int x){
        System.out.println("low "+low);
        System.out.println("high "+high);
        if(low > high){
            return -1;
        }
        int mid =(low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(x > arr[mid]){
            return binarySearch(arr, mid+1, high, x);
        }else{
            return binarySearch(arr, low, mid-1, x);
        }
    }


    public static void main(String args[]){
        SearchInInfiniteArray object = new SearchInInfiniteArray();
        int arr[] = new int[200];
         arr[0]=5;
        for(int i=1;i< arr.length;i++){
            arr[i] = i*5; 
        }
        //Display elements
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        int x=425;
        int index =object.jumpSearch(arr,x);
        System.out.println();
        System.out.println(index);

    }
    
}