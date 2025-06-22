package Strings;

public class CountPalindromeSubString {
    // public static boolean isPalindrome(String s) {
    //     int l = 0;
    //     int r = s.length() - 1;
    //     while (l <= r){
    //         if(s.charAt(l) != s.charAt(r)){
    //             return false;
    //         }
    //         r--;
    //         l++;
    //     }
    //     return true;
    // }
    // public static int countSub(String s){
    //     int count = 0;
    //     for(int i = 0; i < s.length();i++){
    //         for(int j = i; j < s.length(); j++){
    //             // String sub = s.charAt(j);
    //             // System.out.println(s.substring(i,j+1));
    //             if(isPalindrome(s.substring(i,j+1))){
                    
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // Approach 2 
    public static int helper(String s, int left, int right){
        int localcount =0;
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            localcount++;
            left--;
            right++;
        }
        return localcount;
    }
    public static int countSub2(String s){
        int count = 0;
        for(int i = 0; i<s.length();i++){
            count += helper(s, i, i+1);  //even-substring of 2n  
            count += helper(s, i, i);   //odd-substring of 2n+1
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abbbaaab";
        System.out.println(countSub2(s));
    }
}
