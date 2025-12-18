// https://leetcode.com/problems/container-with-most-water/description/
package Arrays.TwoPointer;

public class ConatinerWithMaxWater {
    public static int maxWater(int height[]){
        int maxArea = 0;
        for(int i = 0;i < height.length;i++){
            for(int j = i+1; j < height.length;j++ ){
                maxArea = Math.max(maxArea, Math.min(height[i], height[j])*(j - i));
            }
        }
        return maxArea;
    }
    public static int Optimized(int height[]){
        int left = 0; 
        int right = height.length -1;
        int maxArea = 0;
        while(left < right){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])*(right - left));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int height[] = {1,2,4,3};
        System.out.println(Optimized(height));
    }
}
