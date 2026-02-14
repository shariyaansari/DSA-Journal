package Stack;

import java.util.Stack;

public class ReverseAStack {
    // Brute Force - by making another stack and popping from main and pushing in the new stack
    public static void reverseBrute(Stack<Integer> mainStack){
        Stack<Integer> res = new Stack<>(); 
        System.out.println();
        while(mainStack.size() != 0){
            res.push(mainStack.pop());
        }
        while(res.size() != 0){
            System.out.print(res.pop());
        }
    }

    // using recursion
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.size() == 0){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void usingRecursion(Stack<Integer> mainStack){
        if(mainStack.size() == 0){
            return;
        }
        int top = mainStack.pop();
        usingRecursion(mainStack);
        pushAtBottom(mainStack, top);
    }
    public static void printStack(Stack<Integer> res){
        while(res.size() != 0){
            System.out.print(res.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> mainStack = new Stack<>();
        mainStack.push(1);
        mainStack.push(2);
        mainStack.push(3);
        // printStack(mainStack);
        // reverseBrute(mainStack);    
        // printStack(mainStack);
        usingRecursion(mainStack);
        printStack(mainStack);

    }
}
