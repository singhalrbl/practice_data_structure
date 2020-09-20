package geeks.hashing;

public class NaiveUnionOfUnsortedArray {

    public static int distinctElementInUnion(int a[], int b[]){

        int arr[] = new int[a.length+b.length];
        int k=0;
        int result=0;
        for(int m=0;m<a.length;m++){
            arr[m]=a[m];
            k++;
        }
        for(int n=0;n<b.length;n++){
            arr[k]=b[n];
            k++;
        }
        for(int i=0;i<arr.length;i++){
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


    public static void main(String[] args) {
      //  int a[]={15,20,5,15};
      //  int b[]={15,15,15,20,10};
      int a[]={10,12,15};
      int b[]={18,12};
       System.out.println(distinctElementInUnion(a,b)); 
    }
    
}
