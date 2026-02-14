// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
package BinarySearch;

public class SmallestLetterGreaterThanTarget {
    public static char smallest(char[] letters, char key){
            // code here
        int start = 0;
        int end = letters.length-1;
        // if(key > letters[letters.length-1]){
        //     return letters[0];
        // }
        while(start <= end){
            int mid = (start + end)/2;

            // if((letters[mid] == key)){
            //     return letters[mid+1];
            // }
            
            // right
            if(letters[mid] <= key){
                start = mid + 1;
            }
            // Left
            else{
                end = mid -1;
            }
        }
        return letters[start % letters.length];    
    }
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(smallest(letters, 'c'));
    }
}
