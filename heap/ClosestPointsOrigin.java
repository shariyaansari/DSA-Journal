package heap;

import java.util.*;


public class ClosestPointsOrigin {

    // For optimized approach 
    static class Points implements Comparable<Points>{ 
        int x;
        int y; 
        int distsq; 
        public Points(int x, int y, int distsq){
            this.x = x; 
            this.y = y; 
            this.distsq = distsq;
        }
        // I have to sort each point using distance square 
        @Override
        public int compareTo(Points p1){
            return this.distsq - p1.distsq; //Ascending order sorting
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[points.length][3];
        // extending array to make distance columns
        for(int i = 0; i <res.length; i++){
            res[i][0] = points[i][0];
            res[i][1] = points[i][1];
            res[i][2] = points[i][0]*points[i][0]+points[i][1]*points[i][1];
        }
        // Sorting the extended array as per distance
        Arrays.sort(res, Comparator.comparingDouble(o->o[2]));

        // Changing the original arrya as per the sorted extended array but without distance
        for(int i = 0; i < points.length; i++){
            points[i][0] = res[i][0];
            points[i][1] = res[i][1];
        }
        return Arrays.copyOfRange(points, 0, k);
    }


    // Approach 3 - using maxheap 
    private int getDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
    
    public int[][] kClosestPoints(int[][] points, int k) {

        PriorityQueue<int[]> maxHeap =
            new PriorityQueue<>((a, b) -> getDistance(b) - getDistance(a));

        for(int[] point : points){
            maxHeap.add(point);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] res = new int[k][2];

        while(k > 0){
            res[--k] = maxHeap.poll();
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] pts = {{3,3}, {5,-1}, {-2,4}};
        int k = 2; 

        PriorityQueue<Points> pq = new PriorityQueue<>();
        for(int i = 0; i < pts.length; i++){
            int distsq = pts[i][0]*pts[i][0] + pts[i][1]* pts[i][1]; 
            pq.add(new Points(pts[i][0], pts[i][1], distsq));
        } 

        // To print nearest k cars
        for(int i = 0; i < k; i++){
            System.out.println(pq.remove().x);
        }
    }
}
