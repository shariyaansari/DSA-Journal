// https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
package Strings;

import java.util.*;

public class PrintDuplicateChars {
    public static void printDup(String str){
        char[] chararrr = str.toCharArray();
        Arrays.sort(chararrr);
        int count = 1;
        for(int i = 0; i < chararrr.length;i++){
            count = 1;
            while(i < chararrr.length - 1 && chararrr[i] == chararrr[i+1]){
                count++;
                i++;
            }
            if(count > 1){
                System.out.println(chararrr[i] + ", "+ count);
            }
        }

    }
    public static void main(String[] args) {
        String str = "aaaaaaaaa";
        printDup(str);
    }
}
