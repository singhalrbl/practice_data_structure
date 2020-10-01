package geeks.string;

import java.util.Arrays;

public class NaiveCheckAnagram {

    public static boolean checkAnagram(String s1, String s2) {

        // corner case(if any)
        if (s1.length() != s2.length()) {
            return false;
        }

        char a[] = s1.toCharArray();
        Arrays.sort(a);
        System.out.println(a);

        char b[] = s2.toCharArray();
        Arrays.sort(b);
        System.out.println(b);

        // since equals method compares string
        // so create two new object.
        String str1 = new String(a);
        String str2 = new String(b);

        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        String s1 = "listen";
        String s2 = "silent";
        System.out.println(checkAnagram(s1, s2));

    }
}
