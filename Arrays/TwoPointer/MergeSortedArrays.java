// https://leetcode.com/problems/merge-sorted-array/description/
package Arrays.TwoPointer;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ;i < nums2.length;i++){
            nums1[nums1.length-i-1] = nums2[i];
        }
        Arrays.sort(nums1);
    }
    // Try this again when revising
    public static void mergeApproach2(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = m+n-1;
        int nums2Pointer = n-1;

        while(left >= 0 && right < nums1.length){
            while(nums2Pointer >= 0 && nums1[left] < nums2[nums2Pointer] ){
                nums1[right] = nums2[nums2Pointer];
                right--;
                nums2Pointer--;
            }
            nums1[right] =  nums1[left];
            left--;
        }
    }
    // fully works
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[n+m];
        // Pointer for nums1
        int i = 0;
        // Pointer for nums2
        int j = 0;
        // Pointer for temp
        int k = 0;
        
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                temp[k] = nums1[i];
                k++; i++;
            }
            else{
                temp[k] = nums2[j];
                k++; j++;
            }
        }
        while(i < m){
            temp[k] = nums1[i];
            k++; i++;
        }
        while(j < n){
            temp[k] = nums2[j];
            k++; j++;
        }
        for(k = 0,i = 0 ; k < temp.length;k++,i++){
            nums1[i] = temp[k]; 
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,4,5};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        for(int i = 0; i < m+n;i++){
            System.out.println(nums1[i]);
        }
    }
}
