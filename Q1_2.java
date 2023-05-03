import java.util.*;

public class Q1_2 {  

    static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int val1, val2;
        int[] char_set = new int[127];
        for (int i= 0; i < str1.length(); i++) {
            char_set[(int) str1.charAt(i)]++;
            char_set[(int) str2.charAt(i)]--;
        }
        for (int i = 0; i < char_set.length; i++) {
            if (char_set[i] != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {  

        // Test case 1: Two empty strings
        System.out.println("1: ");
        System.out.println(isPermutation("", "")); // Output: true
        
        // Test case 2: Two identical non-empty strings
        System.out.println("2: ");
        System.out.println(isPermutation("abc", "abc")); // Output: true
        
        // Test case 3: Two different length strings
        System.out.println("3: ");
        System.out.println(isPermutation("abc", "abcd")); // Output: false
        
        // Test case 4: Two strings that contain spaces
        System.out.println("4: ");
        System.out.println(isPermutation("hello world", "world hello")); // Output: true
        
        // Test case 5: Two strings that have the same characters but different frequency of characters
        System.out.println("5: ");
        System.out.println(isPermutation("aaabbc", "abacac")); // Output: false
        
    }  
}
// code by Pablo Florindo