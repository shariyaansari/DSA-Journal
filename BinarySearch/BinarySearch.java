// https://leetcode.com/problems/binary-search/description/
package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int Sortedarr[], int key){
        int start = 0;
        int end = Sortedarr.length - 1;
        // System.out.println(end + " "+ mid); 
        while (start <= end) {
            int mid = (start+end)/2;

            if (Sortedarr[mid] == key){
                return mid;
            }
            // right
            if(Sortedarr[mid] < key){
                start = mid + 1;
            }
            // Left
            else{
                end = mid -1;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(binarySearch(arr, 9));
    }
    
}
