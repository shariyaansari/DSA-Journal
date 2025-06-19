package Patterns;
// Advanced Pattern
// Q.       *
//        * *
//      * * *
//    * * * *

// Q. * * * * 
//    * * *
//    * *
//    *

// Q.  
//  ****
//   ****
//    ****
//     ****

// Q.
//      ****
//     *  *
//    *  *
//   ****

// Q.  
//       1 
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1

// Q.  
//       * 
//     * * *
//   * * * * *
// * * * * * * *

//Q. 
// 1
// 01
// 101
// 0101
public class LiveSession6 {
    // Q.       *
    //        * *
    //      * * *
    //    * * * *
    public static void Pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for( int k = 1; k <=i; k++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }

    // Q. * * * * 
    //    * * * 
    //    * *
    //    *
    public static void PatternInverted(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i-1 ; j++){
                System.out.print(" ");
            }
            // for( int k = n; k >= i; k--){
            //     System.out.print("*");
            // }   
            for( int k = 1; k <= n-i+1; k++){
                System.out.print("*");
            }    
            System.out.println("");
        }
    }

    // Q.  
    //    ****
    //   ****
    //  ****
    public static void Rhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for( int k = 1; k <=n; k++){
                System.out.print("*");
            }    
            System.out.println("");
        }
    }
    // Q.
    //      ****
    //     *  *
    //    *  *
    //   ****
    public static void hollowRhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n;j++){
                if(i == 1|| j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    // Q.  
    //       1 
    //     1 2 1
    //   1 2 3 2 1
    // 1 2 3 4 3 2 1
    public static void Palindrome(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i ; j++){
                System.out.print("  ");
            }
            for( int j= 1; j <=i; j++){
                System.out.print(j+" ");
            }
            for (int j = i-1; j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    // Q.  
    //       * 
    //     * * *
    //   * * * * *
    // * * * * * * *    
    public static void Triangle(int n){
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i ; j++){
                System.out.print("  ");
            }
            for( int j= 1; j <=i; j++){
                System.out.print(count + "  ");
                count++;
            }
            System.out.println("");
        }
    }
    public static void Diamond(int n){
        // For first half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for( int j= 1; j <= 2*i - 1; j++){
                System.out.print("*");
            }
            // for( int j= 1; j <= i; j++){
            //     System.out.print("*");
            // }
            // for(int j = i-1; j>=1;j-- ){
            //     System.out.print("*");
            // }
            System.out.println("");
        }
        // For Second half
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for( int j= 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = i-1; j>=1;j-- ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //Q. 
    // 1
    // 01
    // 101
    // 0101
    public static void zeroOneTriangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
    public static void Butterfly(int n){
        // 1st half
        for(int i = 1; i<=n; i++){
            // Stars-i
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            // Spaces-2*(n-i)
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Stars-i
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = n; i>=1; i--){
            // Stars-i
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            // Spaces-2*(n-i)
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Stars-i
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        // Pattern(4);
        // PatternInverted(4);
        // Rhombus(4);
        // hollowRhombus(4);
        // Palindrome(4);
        // Triangle(4);
        // zeroOneTriangle(15);
        // Butterfly(4);
        Diamond(5);
    }
      
}
