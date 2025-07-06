package Arrays;

public class AllPossibleCombinations {
    // Have to try tomorrow
    public static void subsets(int[] arr, int r){
        for(int i = 0; i < arr.length;i++){
            for(int j = i; j < arr.length;j++){
                for(int k = j+1; k < r; k++){

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        subsets(arr, 3);
    }
}
