package geeks.hashing;

import java.util.HashSet;

public class UnionOfUnsortedArray {

    public static void main(String[] args) {
        int a[]={10,12,15};
        int b[]={18,12};

    HashSet<Integer> object = new HashSet<Integer>();
      
    for(int m=0;m<a.length;m++){
        object.add(a[m]);
    }
    for(int n=0;n<b.length;n++){
        object.add(a[n]);
    }

    System.out.println(object.size());

    }

}
