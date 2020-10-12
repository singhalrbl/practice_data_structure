package geeks.string;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        
        String str="geeksforgeeks";
        System.out.println(str.length());
        //left assign not allowed eg. str.charAt(3)='a' as string is immutable
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));//[start,end]
        System.out.println(str.substring(2,5)); //[start,End)

        //test ASCII
        int x ='f'+1;
        System.out.println(x);
        String S="geeksforgeeks";
        Set<Character> object =new LinkedHashSet<>();
        
        for(int i=0; i < S.length();i++){
            object.add(S.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
		for (Character ch: object) {
			sb.append(ch);
		}

        String string = sb.toString();
        
        System.out.println(string);



        String data ="My name is shubham";
        String solution="";
        for(int i=0; i<data.length();i++){
            if(data.charAt(i)==' '){
                solution=solution+Character.valueOf(data.charAt(i+1));
            }
            
        }

        System.out.println(solution);

        String s="geeksforgeeks forgeeksgeeks";
        String[] arrOfStr = s.split(" ");
        System.out.println(arrOfStr.length);
		    if(arrOfStr.length==1){
		        System.out.println("No");
		    }
		
	}


    }
    
