package geeks.arrays;

public class MoveAllZeroToEnd {

        public static void main(String[] args) {
            
           // int arr[] ={8,5,0,10,0,20};
           //int arr[] ={10,20};
           int arr[] ={10,0,0,10,0};
           int result[] = moveAllZeroToEnd(arr);
           for(int i=0;i < result.length;i++){
               System.out.println(result[i]);
           }


        }

        private static int[] moveAllZeroToEnd(int[] arr) {
            int count=0;
            for(int i=0;i < arr.length;i++){
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[count];
                    arr[count]=temp;
                    count++;
                }
            }
            return arr;
        }

    
}
