package Arrays;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ;i < nums2.length;i++){
            nums1[nums1.length-i-1] = nums2[i];
        }
        Arrays.sort(nums1);
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
