import java.util.*;

class NextSmallerElement {

    public static int[] nextSmallerElements(int[] arr) {
        // Your code goes here
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for (int i : result) {
            System.out.println(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 10, 12, 1, 11};
        nextSmallerElements(arr);
    }
}
