// https://leetcode.com/problems/longest-common-prefix/description/
package Strings;

public class Prefix {
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) {
            return "";
        }
        for (String s : strs) {
            if (s.equals("")) {
                return "";
            }
        }
        // String firstStr = strs[0];
        StringBuilder prefix = new StringBuilder();
        int minlength = Integer.MAX_VALUE;
        
        // Finds the string with minimum length
        for(int i = 0; i < strs.length; i++){
            minlength = Math.min(strs[i].length(), minlength);
        }

        for (int i = 0; i < minlength; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (strs[j].charAt(i) != c) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }
        return prefix.toString();
    }
    
    public static void main(String[] args) {
        String strs[] = {"flower","fow","flight"};
        System.out.println(longestCommonPrefix(strs));
        
    }

}
