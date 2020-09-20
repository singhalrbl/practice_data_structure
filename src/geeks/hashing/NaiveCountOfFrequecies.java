package geeks.hashing;

public class NaiveCountOfFrequecies {
    //int arr[] ={10,12,10,15,10,20,12,12};
    public static void countOfFrequecies(int arr[]){

        for(int i=0;i<arr.length;i++){
            int result=1;
            boolean flag=false;
            for(int j=i-1;j>=0;j--){
                  if(arr[i]==arr[j]){
                      flag=true;
                        break;                      
                  }
            }
            if(flag==false){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    result++;
                }
            }
            System.out.println(arr[i]+"-->"+result);
        }
            
        }
    }

    public static void main(String[] args) {
         int arr[] ={10,12,10,15,10,20,12,12};
        // int arr[] ={10,10,10};
        countOfFrequecies(arr);


    }
    
}
