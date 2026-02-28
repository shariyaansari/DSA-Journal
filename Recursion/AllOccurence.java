package recursion;

public class AllOccurence {
    public static void allOccurence(int[] arr, int i, int key){
        // Base case
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        allOccurence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        allOccurence(arr, 0, key);
    }
}
