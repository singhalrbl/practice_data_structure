package geeks.hashing;

public class NaiveCountDistinctElementInWindow {
    

    public static void main(String[] args) {
        int arr[] ={10,10,5,3,20,5};
        int n=arr.length;
        int k=4;
        countDistinctElenentInwindow(arr,n,k);

    }

    private static void countDistinctElenentInwindow(int[] arr,int n,int k) 
    {
        for(int i=0; i< n-k;i++){
            int count=0;
            for(int j=0;j<k;j++){
                boolean flag =false;
                for(int p=0;p<j;p++){
                    if(arr[i+j]==arr[i+p]){
                        flag=true;
                        break;
                    }
                    if(flag==false){
                        count++;
                    }
                    System.out.println(count);
                }
            }

        }
    }
}
