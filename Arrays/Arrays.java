package Arrays;
// Questions included in this file
// Arrays are passed by reference in a function
// Linear search on numbers 
// Linear search on Strings 
// Largest No
// Binary Search
// Reverse an array
// Pairs in Array 

import java.util.*;

public class Arrays{

    // Arrays are passed by reference in a function
    public static void demoReference(int marks[]){
        for (int i = 0; i < marks.length; i++){
            marks[i] += 1;
        }
    }
    
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchString(String food[], String key){
        for(int i = 0; i < food.length; i++){
            if (food[i].equalsIgnoreCase(key)){
                return i;
            }
        }
        return -1;
    }

    public static int largestAndSmallest(int number[]){
        int Largest = Integer.MIN_VALUE;   //Largest = -infinity 
        int Smallest = Integer.MAX_VALUE;
        for(int i = 0; i < number.length; i++){
            if(number[i] > Largest){
                Largest = number[i];
            }
            if(number[i] < Smallest){
                Smallest = number[i];
            }
        }
        System.out.println(Smallest);
        return Largest;
    }

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

    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length - 1;

        while(first < last){
            int temp;
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void pairsInArrays(int arr[]){
        // int totalpairs = 0;
        // Total pairs formula = n(n-1)/2
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                System.out.print("("+ arr[i] + ", "+ arr[j]+ ")");
            }
            System.out.println("");
        }
    }




    public static void main(String[] args) {
        // Declare the size of array
        // int marks[] = new int[9];

        // Automatically defaults the size
        // int number[] = {1, 4, 5};
        // String str[] = {"HELLO", "World"};
        
        // Input in arrays
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter marks of sub1: ");
        // marks[0] = sc.nextInt();
        // System.out.println("Enter marks of sub2: ");
        // marks[1] = sc.nextInt();
        // System.out.println("Enter marks of sub3: ");
        // marks[2] = sc.nextInt();

        // System.out.println("marks of sub1: "+marks[0]);
        // System.out.println("marks of sub2: "+marks[1]);
        // System.out.println("marks of sub3: "+marks[2]);

        // int marks[] = {23,56,45,5};
        // String food[] = {"samosa","kheer","Kaju","Vada"};
        // demoReference(marks);

        // for(int i = 0; i < marks.length; i++){
        //     System.out.println(marks[i]);
        // }

        // linearSearch(marks, 5);
        // if (linearSearch(marks, 5) == -1){
        //     System.out.println("NOT Found");
        // }else{
        //     System.out.println("found at index no: "+linearSearch(marks, 5));
        // }


        // String Linear search 
        // if (linearSearchString(food, "Vada") == -1){
        //     System.out.println("NOT Found");
        // }else{
        //     System.out.println("found at index no: "+linearSearchString(food, "Vada"));
        // }

        // int number[] = {3,78,9,50,4};
        // System.out.println(largestAndSmallest(number));


        // Binary Search = always on sorted arrays
        // int Sortedarr[] = {3,5,7,8,19};
        // System.out.println(binarySearch(Sortedarr, 1));
        
        // Reverse an array
        int arr[] = {2,4,6,8,10};
        // reverse(arr);
        // pairsInArrays(arr);
        
        
    }

    public static void sort(char[] chararrr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
    
}