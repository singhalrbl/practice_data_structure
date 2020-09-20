package geeks.hashing;

public class NaiveCountDistinctElement {
//int arr[] = { 15, 12, 13, 12, 13, 13, 18 };
    public static int countDistinctelElements(int arr[]) {
        int result=0;
        for(int i=0; i< arr.length;i++){
            boolean flag=false;
            for(int j=i-1;j>=0;j--){
                if(arr[j]==arr[i]){
                    flag=true;
                    break;
                }
            }
                if(flag==false){
                    result++;
                }
            
        }
        return result;
    }

    public static void main(String args[]) {
        //int arr[] = { 15, 12, 13, 12, 13, 13, 18 };
       // int arr[] ={10,10,10};
        int arr[] ={10,20,30};
        System.out.println(countDistinctelElements(arr));

    }

}
