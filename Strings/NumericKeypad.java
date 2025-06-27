// https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/
package Strings;

public class NumericKeypad {
    public static String printSequence(String[] str, String input){
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            // char ch = input.charAt(i);
            if(input.charAt(i) == ' '){
                sb.append("0");
            }
            else if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
                int position = input.charAt(i) - 'A';
                sb.append(str[position]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] str = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
        String input = "GEEKSFORGEEKS";
        System.out.println(printSequence(str, input));
    }
}
