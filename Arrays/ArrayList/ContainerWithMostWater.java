// Doing this using ArrayList 
package Arrays.ArrayList;

import java.util.*;

public class ContainerWithMostWater {
    public static void maxWater(ArrayList<Integer> height) {
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int minheight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                maxWater = Math.max(maxWater, minheight * width);
            }
        }
        System.out.println(maxWater);
    }

    public static void maxWaterOptimized(ArrayList<Integer> height) {
        int maxWater = 0;
        int left = 0, right = height.size() - 1;
        while (left < right) {
            int minheight = Math.min(height.get(left), height.get(right));
            int width = right - left;
            maxWater = Math.max(maxWater, minheight * width);
            if(height.get(left) < height.get(right)){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxWater);
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        maxWater(height);
        maxWaterOptimized(height);
    }
}
