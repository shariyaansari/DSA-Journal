package Queue;

import java.util.*;

class DequeInJava {
    static class MyStack {
        private Deque<Integer> deque = new LinkedList<>();

        public void push(int x) {
            deque.addLast(x);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int top() {
            return deque.getLast();
        }

        public boolean empty() {
            return deque.isEmpty();
        }
    }
    static class MyQueue {
        private Deque<Integer> deque = new LinkedList<>();

        public void add(int x) {
            deque.addLast(x);
        }

        public int pop() {
            return deque.removeFirst();
        }

        public int top() {
            return deque.getFirst();
        }

        public boolean empty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        // To add at the start
        deque.addFirst(5);
        deque.addFirst(9);
        deque.addFirst(8);
        deque.addFirst(6);
        deque.addFirst(10);
        // [10, 6, 8, 9, 5]
        System.out.println(deque);
        deque.removeLast();
        // [10, 6, 8, 9]
        System.out.println(deque);
        deque.removeFirst();
        // [6, 8, 9]
        System.out.println(deque);
        System.out.println("first eleemnt is " + deque.getFirst());
        System.out.println("Last eleemnt is " + deque.getLast());
    }
}