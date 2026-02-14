package Stack;
import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list= new ArrayList<>();
        // To check whwether a sstack is full or empty 
        public static boolean isempty(){
            if(list.size() == 0){
                return true;
            }
            return false;
        }
        // To implement push 
        public static void push(int data){
            list.add(data);
        }
        // to implement pop
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // To implement peek
        public static int peek(){
            if(isempty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
