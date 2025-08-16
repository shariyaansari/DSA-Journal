package Sorting;
// Counting sort can have many numbers in quantity but it's range should be smaller
public class Counting {
    public static void printArr(int[] nums){
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void sort(int[] nums){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length;i++){
            largest = Math.max(largest, nums[i]);
            smallest = Math.min(smallest,nums[i]);
        }
        int[] count = new int[largest - smallest +1];
        for(int i = 0; i < nums.length;i++){
            count[nums[i] - smallest]++;
        }
        int j = 0;
        for(int i = 0; i < count.length;i++){
            while(count[i] > 0){
                nums[j] = i + smallest;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3};
        sort(arr);
        printArr(arr);
    }
}
