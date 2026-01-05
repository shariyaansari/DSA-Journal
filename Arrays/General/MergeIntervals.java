package Arrays.General;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.*;

public class MergeIntervals {
    // public int[][] merge(int[][] intervals) {
    //     // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    //     // Learned new way to sort using lambda functions
    //     Arrays.sort(intervals, (a, b) -> a[0] -b[0]);
    //     List<int[]> res = new ArrayList<>();
        
    //     int currentStart = intervals[0][0];
    //     int currentEnd = intervals[0][1];
    //     for(int i = 1; i < intervals.length;i++){
    //         // No Overlapping 
    //         if(currentEnd < intervals[i][0]){
    //             res.add(new int[]{currentStart, currentEnd});
    //             currentStart = intervals[i][0];
    //             currentEnd = intervals[i][1];
    //         }
    //         else if(intervals[i][0] <= currentEnd){
    //             // Overlap therefore merge
    //             currentEnd = Math.max(currentEnd, intervals[i][1]);
    //         }
    //     }
    //     res.add(new int[]{currentStart, currentEnd});
    //     System.out.println(res);

    //     return res.toArray(new int[res.size()][]);
    // }
    public static void main(String[] args) {
        
    }
}
