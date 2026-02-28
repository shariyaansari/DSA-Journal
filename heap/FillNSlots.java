package heap;

import java.util.LinkedList;
import java.util.Queue;

public class FillNSlots {

    // Math soln works only cause no obstacle, cost =1 and uniform speed 
    public static int MinTime(int N, int[] arr) {
        int time;
        int start = 0;
        int end = 0;
        int mid = 0;

        start = arr[0] - 1;
        end = N - arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            mid = Math.max(mid, (arr[i] - arr[i - 1]) / 2);
        }
        time = Math.max(mid, Math.max(start, end));
        return time;
    }

    // using bfs -> queues -> Pattern based 
    public static int usingBFS(int N, int[] arr) {
        boolean[] visited = new boolean[N + 1];
        int time = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int val : arr) {
            q.offer(val);
            visited[val] = true;
        }
        // step 2 -> bfs 
        while (!q.isEmpty()) {
            int size = q.size();
            boolean filled = false;
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                // check left neighbour
                if (curr - 1 >= 1 && !visited[curr - 1]) {
                    visited[curr - 1] = true;
                    q.offer(curr - 1);
                    filled = true;
                }
                if (curr + 1 <= N && !visited[curr + 1]) {
                    visited[curr + 1] = true;
                    q.offer(curr + 1);
                    filled = true;
                }

            }
            // Level completed 
            if (filled) {
                time++;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        int N = 15;
        int[] arr = {3, 10};
        System.out.println(MinTime(N, arr));
        System.out.println(usingBFS(N, arr));
    }
}
