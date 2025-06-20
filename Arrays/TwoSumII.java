// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
package Arrays;

public class TwoSumII {
    public static int[] twoSumBrute(int[] numbers, int target) {
        int[] index = new int[2];
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n;j++){
                if(numbers[i] + numbers[j] == target){
                    index[0] = i+1;
                    index[1] = j+1;
                    break;
                }
            }
        }
        System.out.println(index[0] + ", " +index[1]);
        return index;
    }
    public static int[] twoSumOptimized(int[] numbers, int target) {
        int[] index = new int[2];
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        while(left <= right){
            if(numbers[left] + numbers[right] == target){
                index[0] = left+1;
                index[1] = right+1;
                break;
            }
            else if (numbers[left] + numbers[right] > target){
                right--;
            }
            else{
                left++;
            }
        }

        System.out.println(index[0] + ", " +index[1]);
        return index;
    }

    public static void main(String[] args) {
        int numbers[] = {-10,-8,-2,1,2,5,6};
        // twoSumBrute(numbers, 0);
        twoSumOptimized(numbers, 0);
    }
}
