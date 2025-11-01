package Greedy;
import java.util.*;

public class MinAbsoluteDiff {
    public static void greedyapproach(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            int difference = 0;
            difference = Math.abs(a[i]-b[i]);
            sum += difference;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] a = {4,1,8,7};
        int[] b = {2,3,6,5};
        greedyapproach(a, b);
    }
}
