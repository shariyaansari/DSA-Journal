
// So write a method to replace all spaces in a string with %20 so we may assume that the string has sufficient space at the end of the array at the end of the array to hold the additional characters and that you are given the true length of the string  

package Strings;

public class ReplaceAllSpaces {
    public static void replaceSpaces(String s, int truelenght){
        char[] str = s.toCharArray();
        int spaces = 0;
        for(int i = 0; i < truelenght;i++){
            if(str[i] == ' '){
                spaces++;
            }
        }
        // Calculating lenght with the extra spaces along with index adjustment
        // -1 for the index
        int newIndex = truelenght + spaces * 2 -1;
        for(int i = truelenght-1; i >= 0 ; i--){
            if(str[i] == ' '){
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            }
            else{
                str[newIndex] = str[i];
                newIndex--;
            }
        }

        // This is for my convinience 
        // Printing the new string which is now an array
        for(int i = 0; i < str.length;i++){
            System.out.print(str[i]);
        }
    }
    public static void main(String[] args) {
        replaceSpaces("Mr Smith John     ", 13);
    }
}
