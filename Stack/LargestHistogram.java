import java.util.*;

class LargestHistogram{
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> s1 = new Stack<>();
        int[] pse = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            while(!s1.isEmpty() && heights[s1.peek()] > heights[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = s1.peek();
            }
            s1.push(i);
        }            

        Stack<Integer> s2 = new Stack<>();
        int[] nse = new int[heights.length];
        for(int i = heights.length-1; i >= 0; i--){
            while(!s2.isEmpty() && heights[s2.peek()] >= heights[i]){
                s2.pop();
            }
            if(s2.isEmpty()){
                nse[i] = heights.length;
            }
            else{
                nse[i] = s2.peek();
            }
            s2.push(i);
        }   
        int max = 0;         
        for(int i = 0; i < heights.length; i++){
            int width = nse[i] - pse[i] -1;
            int area = heights[i] * width; 
            max = Math.max(max, area);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        largestRectangleArea(heights);
    }
}