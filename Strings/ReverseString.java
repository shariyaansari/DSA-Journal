// https://leetcode.com/problems/reverse-string/description/?envType=problem-list-v2&envId=two-pointers
package Strings;

public class ReverseString {
    public static void string(int[] s){
        int left = 0;
        int right = s.length-1;
        while(left <= right){
            int temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] s = {'h', 'e','l','l','o'};
        string(s);
    }
}
