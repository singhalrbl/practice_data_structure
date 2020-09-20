package geeks.hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountfrequenciesOftheElement {

    public static void countFrequecies(int arr[]){

        Map<Integer,Integer>object = new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(object.containsKey(arr[i]))
            {
                    object.put(arr[i],object.get(arr[i])+1);
            }else{
                object.put(arr[i],1);
            }
        }

        for(Integer itr:object.keySet()){
            System.out.println("Key "+itr+" -->"+object.get(itr));
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={10,12,10,15,10,20,12,12};
       // int arr[] ={10,10,10};
            countFrequecies(arr);
    }

}