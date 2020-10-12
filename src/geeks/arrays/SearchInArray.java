package geeks.arrays;

public class SearchInArray {

    public static int insert(int arr[],int x){

        for(int i=0;i<arr.length;i++){

            if(arr[i]==x){
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        
        int arr[] ={20,5,7,25};
        int x=5;
        System.out.println( insert(arr,x));

    }
    
}
