// https://leetcode.com/problems/trapping-rain-water/
package Arrays.General;

public class trappingwater {
    public static int trap(int[] height) {
        int n = height.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        leftmax[0] = height[0];
        int trapped_water = 0;

        // For calculating leftmax
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // For calculating rightmax 
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
            System.out.println(rightmax[i]);
        }

        for(int i = 0; i < n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapped_water += (waterlevel - height[i] );
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trap(height));
        
    }
    
}
