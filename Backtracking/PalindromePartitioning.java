package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning{
    public static boolean  isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void palindrome(String s, int index, List<String> path, List<List<String>> res){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        // Put a for loop for substrings 
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                // If substring then add to path
                path.add(s.substring(index, i+1));
                palindrome(s, i+1, path, res); 
                path.remove(path.size()-1);  //backtracking step 
            }
        }
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        palindrome(s, 0, new ArrayList<>(), res);
        return res;    
    }
    public static void main(String[] args) {
        System.out.println(partition("aab"));

    }
}