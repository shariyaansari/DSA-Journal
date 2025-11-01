package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

class ActivitySelection{
    // For end sorted 
    public static void activitySel(int[] start, int[] end){
        // Count for max activities
        int count= 1;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);
        int lastEnd = end[0];
        for(int i = 1; i < start.length;i++){
            if(start[i] >= lastEnd){
                count++;
                res.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println(res);
        System.out.println(count);
    }

    // For non sorted acrivities 
    public static void activitySelWithoutSorted(int[] start, int[] end){
        int[][] activities = new int[start.length][3];
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // To sort the activity based on the end time 
        // Comparator<T>.comparingDouble(o -> o[2])); - is called as lambda function in java f
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int lastEnd = activities[0][2];
        int count = 1;
        res.add(activities[0][0]);
        for(int i = 0; i < start.length; i++){
            if(activities[i][1] >= lastEnd){
                count++;
                res.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println(res);
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        // Activity is alr sorted on the basis of the end time
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        activitySel(start, end);
        activitySelWithoutSorted(start, end);
    }
}