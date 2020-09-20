package geeks.hashing;

/**
 * InterSectionOfTwoArrays
 */
public class NaiveInterSectionOfTwoArrays {
        //int a[]={10,15,20,15,30,30,5};
        //int b[]={30,5,30,80};
    public static int countDistinctInTwoArrays(int a[], int b[]){
        int result=0;
            for(int i=0;i<a.length;i++){
                boolean flag=false;
                for(int j=i-1;j>=0;j--){
                    if(a[j]==a[i]){
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    for(int k=0;k<b.length;k++){
                        if(a[i]==b[k]){
                            result++;
                            break;
                        }
                    }
                }
            }
            return result;       
    }

    public static void main(String[] args) {
        
/* 
        int a[]={10,15,20,15,30,30,5};
        int b[]={30,5,30,80}; */
        int a[]={10,20};
        int b[]={20,30};
        System.out.println(countDistinctInTwoArrays(a, b));


    }
}