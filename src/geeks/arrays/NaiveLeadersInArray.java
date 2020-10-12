package geeks.arrays;

public class NaiveLeadersInArray {

    public static void naiveLeadersInArr(int arr[]) {
        
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        
        //int arr[] ={7,10,4,3,6,5,2};
        // int arr[] ={10,20,30};
        int arr[] ={30,20,10};

        naiveLeadersInArr(arr);        
    }

}
