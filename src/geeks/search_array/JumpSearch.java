package geeks.search_array;

/* //https://www.geeksforgeeks.org/jump-search/ */

public class JumpSearch {

    public int jump(int arr[], int x){
        int n = arr.length;
        int step = (int)Math.sqrt(n);
        int prev =0;
        while(arr[Math.min(step, n)-1] < x){
                    prev = step;
                    step = step + (int)Math.sqrt(n);
                    if(prev >= n){
                        return -1;
                    }
        }

        while(arr[prev] < x){
            prev++;

        //if element is found
        if(arr[prev]==x){
            return prev;
        }
        //if element is not present    
        if(prev == Math.min(step,n)){
            return -1;
        }

        }
            return -1;
    }


    public static void main(String args[]){

        JumpSearch object = new JumpSearch();
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
            34, 55, 89, 144, 233, 377, 610};    
        int x = 55; 

        int index  = object.jump(arr,x);
        System.out.println(index);


    }
    
}