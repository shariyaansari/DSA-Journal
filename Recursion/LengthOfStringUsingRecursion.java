// Program to find the length of the string using recursion
package recursion;

public class LengthOfStringUsingRecursion {
    public static void length(String str, int len){
        if(len == str.length()){
            System.out.println(len);
            return;
        }
        else{
            len++;
            length(str, len+1);
        }
    }
    public static void main(String[] args) {
        String str = "hello";
        length(str, 1);
    }
}
