package geeks.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
public static void main(String[] args) {

  //  System.out.println(Integer.parseInt("5  ".toCharArray()));
    

    String str="zxvczbtxyzvy";
    HashMap<String,Integer> object = new LinkedHashMap<String,Integer>();
    for(int i=0; i<str.length();i++){
        if(!object.containsKey(str.charAt(i)+"")){
            object.put(str.charAt(i)+"",1);
        }else{
            object.put(str.charAt(i)+"",object.get(str.charAt(i)+"")+1);
        }
    }
    
   for (Map.Entry<String,Integer> mapElement : object.entrySet()) { 

        if(mapElement.getValue()==1){
          System.out.println(mapElement.getKey());
          break;
        }else{
            System.out.println(-1);
        } 

} 
    
}		
}    

