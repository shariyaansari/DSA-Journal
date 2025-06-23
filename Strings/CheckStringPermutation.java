// given two strings write a method to decide if one is a permutation of the other
package Strings;

import java.util.*;

public class CheckStringPermutation {
    public static boolean isPermutation(String s1, String s2){
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < str1.length;i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPermutation("shariya", "ayirahs"));
    }
}
