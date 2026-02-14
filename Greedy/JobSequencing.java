import java.util.*;

public class JobSequencing {
    static class Job {
        int deadline;
        int profit;
        int id; // 0(A), 1(B), 2(C)

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int[][] JobInfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < JobInfo.length; i++) {
            jobs.add(new Job(i, JobInfo[i][0], JobInfo[i][1]));
        }
        // Collection.sort(jobs, (a,b) -> a.profit - b.profit) //ascending
        // Only objects can be sorted in descending order that's why we had to do the entire Contructor thingy

        Collections.sort(jobs, (a,b) -> b.profit - a.profit);

        // Job Sequencing code
        ArrayList<Integer> res = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                res.add(curr.id);
                time++;
            }
        }
        System.out.println(res);
        System.out.println(res.size());
    }
}
