package Basics;

public class Practice {
    public static void buySell(int blocks[]) {
        int n = blocks.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, blocks[j] - blocks[i]);
            }
        }
        System.out.println(max);
    }
    public static void buySell2(int blocks[]) {
        int n = blocks.length;
        int max = Integer.MIN_VALUE;
        int buyprice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(buyprice < blocks[i]){
                max = Math.max(max,blocks[i] -buyprice);
            }
            else{
                buyprice = blocks[i];
            }
            
        }
        System.out.println(max);
    }
    public static int trapwatendrow(int blocks[]){
        int n = blocks.length;
        // We make auxilliary arrays for the left and for the right boundries as well 
        int leftarr[] = new int[blocks.length];
        leftarr[0] = blocks[0];
        for(int i = 1; i < leftarr.length;i++){
            leftarr[i] = Math.max(blocks[i], leftarr[i-1]);
            // System.out.println(leftarr[i]);
        }
        
        // Calc right max boundry
        int rightarr[] = new int[blocks.length];
        rightarr[blocks.length-1] = blocks[blocks.length-1];
        for(int i = blocks.length-2; i >= 0;i--){
            rightarr[i] = Math.max(blocks[i], rightarr[i+1]);
            // System.out.println(rightarr[i]);    
        }

        int watendrowlevel;
        int trapwatendrow = 0;
        for(int i =0; i < blocks.length;i++){
            watendrowlevel = Math.min(rightarr[i], leftarr[i]);
            trapwatendrow += (watendrowlevel - blocks[i]); 
        }
        System.out.println(trapwatendrow);
        return trapwatendrow;
    }

    public static void SpiralMatrix(int matrix[][]){
        int n = matrix.length; //row
        int m = matrix[0].length;  //column
        int startrow = 0;   
        int endrow = n-1;   
        int startcol = 0;
        int endcol = m-1;

        while( startrow <= endrow && startcol <= endcol){
            // for top
            for(int j = startcol; j <= endcol ; j++){
                System.out.print(matrix[startrow][j] + " ");
            }

            // For right
            for(int i = startrow+1; i <= endrow;i++){
                System.out.print(matrix[i][endcol]+ " ");
            }

            // for bottom 
            for(int j =endcol - 1; j >= startcol; j-- ){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");
            }
            for(int i = endrow -1; i >=startrow+1 ;i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+ " ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static int SearchInInfinite(int arr[] , int target){
        int start = 0; 
        int end = 1;

        if(target > arr[end]){
            int newStart = end + 1;
            int newEnd = end + (end-start+1)*2;
            start = newStart;
            end = newEnd;
        }
        return BinarySearchCode(arr, target, start, end);
    }
    public static int BinarySearchCode(int arr[], int target, int start, int end){
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                start = mid -1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int blocks[] ={4,2,0,6,3,2,5};
        // buySell(blocks);
        // buySell2(blocks);
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        // trapwatendrow(blocks);
        SpiralMatrix(matrix);
    }
}
