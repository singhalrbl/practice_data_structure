package revision_30may2020.array;

import java.util.Scanner;

/* Here we will merge two arrays */

public class Merging extends ArrayParent {
    
	private int[] mergingTwoArrays(int[] insertFirstArray, int[] insertSecondArray, int[] thirdArray) {
        int i=0;
        int j=0;
        int k=0;
        while(i < insertFirstArray.length && j< insertSecondArray.length){

            if(insertFirstArray[i] < insertSecondArray[j]){
                    thirdArray[k++] =insertFirstArray[i++]; 
            }else{
                thirdArray[k++] =insertSecondArray[j++]; 
            }
        }

        for(; i< insertFirstArray.length;i++){
            thirdArray[k++] =insertFirstArray[i];
        }

        
        for(; j< insertSecondArray.length;j++){
            thirdArray[k++] =insertFirstArray[j];
        }
		return thirdArray;
	}

    public static void main(String[] args) {
        Merging object = new Merging();
        System.out.println("Eneter length of the first array");
        Scanner scan = new Scanner(System.in);
        int lengthFirstArray = scan.nextInt();
        int firstArray[] = object.getArray(lengthFirstArray);

        System.out.println("Enter Length of second array");
        int lengthSecondArray = scan.nextInt();
        int secondArray[] = object.getArray(lengthSecondArray);

        System.out.println("Inserting data in first Array");
        int insertFirstArray[] = object.insertDataInArray(firstArray, lengthFirstArray, lengthFirstArray);

        System.out.println("Inserting Data in second Array");
        int insertSecondArray[] = object.insertDataInArray(secondArray, lengthSecondArray, lengthSecondArray);

        //create a third array
        System.out.println("Create thrid Array");
        int lengthThirdArray = scan.nextInt();
        int thirdArray[] = object.getArray(lengthThirdArray);


        //merging logic
        int arrayAfterMerging[] = object.mergingTwoArrays(insertFirstArray,insertSecondArray,thirdArray);

        object.display(arrayAfterMerging);
    }


}
