// https://leetcode.com/problems/valid-anagram/description/
package Strings;

import java.util.Arrays;


public class Anagram {
    public static boolean IsAnagram(String str1,String str2 ){
        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray2);
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i = 0 ; i < str1.length();i++){
            if(charArray1[i] != charArray2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean IsAnagram2(String str1,String str2 ){
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }
        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }
        return Arrays.equals(count1, count2);
    }
    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "car";
        System.out.println(IsAnagram(str1, str2));
        System.out.println(IsAnagram2(str1, str2));

    }
}
