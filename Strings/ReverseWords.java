// https://leetcode.com/problems/reverse-words-in-a-string/description/
package Strings;

public class ReverseWords {
    public static String reverseWords(String s) {
        // String[] str = new String[s.length];
        String s1 = s.trim();
        System.out.println(s1);
        String[] words = s1.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            res.append(words[i]);
            if(words[i].equals(" ")){
                continue;
            }
            if(i !=0 ){
                res.append(" ");
            }
        }
        
        String s2 = res.toString();
        String s3 = s2.replaceAll("\\s+", " ");

        return s3;
    }
}
