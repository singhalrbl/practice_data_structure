package geeks.hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static boolean subArrayWithZeroAddition(int arr[]) {
        HashSet<Integer> object = new HashSet<Integer>();
        int prefix_sum=0;
            for(int i=0;i<arr.length;i++){
                prefix_sum=prefix_sum+arr[i];
                if(prefix_sum==0||arr[i]==0){
                    return true;
                }
                if(object.contains(prefix_sum)){
                    return true;
                }else{
                    object.add(prefix_sum);
                }
            }


        return false;
    }

    public static void main(String[] args) {

        //   int arr[]={1,4,13,-3,-10,5};
        // int arr[]={1,4,-3,1,2};
        // int arr[]={3,-1,-2,5,6};
        int arr[]={5,6,0,8};
        System.out.println(subArrayWithZeroAddition(arr));

    }

}
