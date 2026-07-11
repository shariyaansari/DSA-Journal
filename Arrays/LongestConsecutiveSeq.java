
import java.util.*;

class LongestConsecutiveSeq {

    public static void approach1(int[] nums) {
        Arrays.sort(nums);
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int countCurr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == lastSmaller) {
                countCurr += 1;
                lastSmaller = nums[i];
            }
            if (nums[i] != lastSmaller) {
                countCurr = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, countCurr);
        }
    }

    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        int longest = 1;

        // HashSet to store unique elements for O(1) lookup
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        /* Loop through each element in the set to find 
           the starting point of consecutive sequences */
        for (int it : st) {
            // If there is no number before 'it', it’s the start of a sequence
            if (!st.contains(it - 1)) {
                // Start the count for this sequence
                int cnt = 1;
                // Store the current number
                int x = it;

                // Keep checking for the next consecutive number
                while (st.contains(x + 1)) {
                    // Move to the next number in sequence
                    x = x + 1;
                    // Increment the length of current sequence
                    cnt = cnt + 1;
                }

                // Update the longest sequence length if needed
                longest = Math.max(longest, cnt);
            }
        }

        // Return the length of the longest sequence
        return longest;
    }

    public static void main(String[] args) {

    }
}
