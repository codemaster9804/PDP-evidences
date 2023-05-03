import java.util.*;

public class Q1_1 {  

    static boolean isUnique(String str) {
        if (str.length() > 26) return false;

        int val;
        boolean[] char_set = new boolean[25];
        for (int i= 0; i < str.length(); i++) {
            if (str.charAt(i) > 'Z') {
                val = str.charAt(i) - 'a';
            } else {
                val = str.charAt(i) - 'A';
            }
            if (char_set[val]) {//Already found this char in string
                return false;
            }
            char_set[val] = true;
            }
        return true;
    }


    public static void main(String[] args) {  

        System.out.println(isUnique("tes"));
        // unique so output will be true
        System.out.println(isUnique("test"));
        // t is repeated so output will be false
        System.out.println(isUnique("Tes"));
        // unique so output will be true
        System.out.println(isUnique("Test"));
        // T is repeated twice (one lowercase) so output will be false
        
    }  
}
// code by Pablo Florindo
