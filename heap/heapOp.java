package heap;

import java.util.ArrayList;

public class heapOp {

    static class heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add index last 
            arr.add(data);
            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2;
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par; 
                par = (x-1)/2;
            }
        }

        // Peak in a heap 
        public int peek() {
            return arr.get(0);
        }

        private void HeapifyMinHeap(int i){
            // int root = i;
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;
            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            
            // If root is not min then we need to fix it for which we swap 
            if(minIdx != i){
                int temp = arr.get(i); 
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                HeapifyMinHeap(minIdx);
            }
        }

        // Delete in a heap 
        public int delete() {
            int data = arr.get(0);
            // int last = arr.get(arr.size() - 1);

            // Swap 1st and last 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            
            // Step 2 - delete last element 
            arr.remove(arr.size()-1);

            // Heapify 
            HeapifyMinHeap(0);
            return data;

        }
        @SuppressWarnings("SizeReplaceableByIsEmpty")
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Ho");
        heap h = new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.delete();
        }

    }
}
