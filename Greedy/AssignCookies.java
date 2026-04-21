// https://leetcode.com/problems/assign-cookies/
package greedy;
import java.util.*;
public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; int j = 0; 
        int ans = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                ans++;
                i++; 
                j++;
            }
            else if(s[j] < g[i]){  
                j++;
            } 
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g,s));
    }    
}
