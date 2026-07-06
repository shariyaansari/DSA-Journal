import java.util.*;
class SumOfSubarrayRanges{
    public long subArrayMin(int[] nums){
        int[] nse = new int[nums.length];
        Stack<Integer> s1 = new Stack<>(); 

        for(int i = nums.length - 1;i >= 0; i--){
            while(!s1.isEmpty() && nums[s1.peek()] >= nums[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nse[i] = nums.length;
            }else{
                nse[i] = s1.peek();
            }
            s1.push(i);
        } 

        int[] psee = new int[nums.length]; 
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < nums.length; i++){
            while(!s.isEmpty() && nums[s.peek()] > nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                psee[i] = -1;
            }else{
                psee[i] = s.peek();
            }
            s.push(i);
        }    

        long total = 0;
        for(int i = 0;i < nums.length;i++){
            int left = i - psee[i];
            int right = nse[i] - i;
            total += (long) left * right * nums[i];
        }
        return total;
    }

    public long subArrayMax(int[] nums){
        int[] nge = new int[nums.length];
        Stack<Integer> s1 = new Stack<>(); 

        for(int i = nums.length - 1;i >= 0; i--){
            while(!s1.isEmpty() && nums[s1.peek()] <= nums[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nge[i] = nums.length;
            }else{
                nge[i] = s1.peek();
            }
            s1.push(i);
        } 

        int[] pgee = new int[nums.length]; 
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < nums.length; i++){
            while(!s.isEmpty() && nums[s.peek()] < nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                pgee[i] = -1;
            }else{
                pgee[i] = s.peek();
            }
            s.push(i);
        }    

        long total = 0;

        for(int i = 0;i < nums.length;i++){
            int left = i - pgee[i];
            int right = nge[i] - i;
            total += (long) left * right * nums[i];
        }
        return total;
    }

    public long subArrayRanges(int[] nums) {
        System.out.println(subArrayMin(nums));
        System.out.println(subArrayMax(nums));
        return subArrayMax(nums) - subArrayMin(nums); 
    }

    public static void main(String[] args) {
        
    }
}