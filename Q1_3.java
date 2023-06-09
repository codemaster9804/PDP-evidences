import java.util.*;

public class Q1_3 {  

    public static char[] replaceSpaces(char[] str, int length) {
        int spaceCount = 0, newLength, i;
        
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        
        newLength = length + spaceCount * 2;
        
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength -= 3;
            } else {
                str[newLength - 1] = str[i];
                newLength--;
            }
        }
        return str;
    }

    public static void main(String[] args) {  

        String str = "Mr John Smith      ";
        System.out.println(replaceSpaces(str.toCharArray(), 13 ));
        
    }  
}