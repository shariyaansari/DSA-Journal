package Heap.hp;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    static class Student implements Comparable<Student>{
        String name;  
        int rank; 

        public Student(String name, int rank){
            this.name = name; 
            this.rank = rank; 
        }
        @Override
        public int compareTo(Student S2){
            return this.rank - S2.rank; 
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();  
        // To remove in the descending order
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  
        // pq.add(1);
        // pq.add(6);
        // pq.add(7);
        // pq.add(2);

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 3));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->"+pq.peek().rank);         
            pq.remove();
        }
    }
}
