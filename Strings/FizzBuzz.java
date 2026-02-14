package Strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> myList = new ArrayList<>();
        for(int i = 1; i <= n;i++){
            if((i) % 3 == 0 && (i) % 5 != 0){
                myList.add("Fizz");
            }
            else if((i) % 3 != 0 && (i) % 5 == 0){
                myList.add("Buzz");
            }
            else if((i) % 3 == 0 && (i) % 5 == 0){
                myList.add("FizzBuzz");
            }
            else{
                // Value of is used to convert int to string
                myList.add(String.valueOf(i));
            }
        }
        return myList;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(16));
    }
}
