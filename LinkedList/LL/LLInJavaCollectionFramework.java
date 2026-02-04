package LL;
import java.util.LinkedList; //Java Collection framework

public class LLInJavaCollectionFramework {
    public static void main(String[] args) {
        // Create - objects so therefore we can't use - int,float,boolean -> Have to use classes -> Integer, Float, Character
        
        // add
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(3);
        ll.addLast(1);
        ll.addFirst(2);
        ll.addLast(2);
        ll.addLast(2);
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
