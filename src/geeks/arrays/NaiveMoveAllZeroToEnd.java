package geeks.arrays;

public class NaiveMoveAllZeroToEnd {
    public static void main(String[] args) {
        //int arr[] ={8,5,0,10,0,20};
          int arr[] ={10,20};
          //int arr[] ={10,0,0,10,0};
        int result[]=moveAllZeroToEnd(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    private static int[] moveAllZeroToEnd(int[] arr) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                  for(int j=i+1;j<arr.length;j++){
                      if(arr[j]!=0){
                          int temp =arr[i];
                          arr[i]=arr[j];
                          arr[j]=temp;
                          break;
                      }
                  } 
            }

        }
        return arr;
    }

    
}
