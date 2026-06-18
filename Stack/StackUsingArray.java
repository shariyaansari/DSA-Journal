package stack;

class StackUsingArray {

    static class Stack {
        int top = -1;
        int st[] = new int[10];

        // O(1)
        public void push(int x) {
            if (top == 9) {
                System.out.println("stack is full");
            }
            top++;
            st[top] = x;
            System.out.println("element inserted, " + st[top]);
        }

        // O(1)
        public void peek() {
            System.out.println("top of stack is " + st[top]);
        }

        // O(1)
        public void pop() {
            if (top == -1) {
                System.out.println("stack is empty, nothing to pop");
            }
            top--;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        
    }

}
