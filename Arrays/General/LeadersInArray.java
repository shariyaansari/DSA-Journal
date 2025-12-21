package Arrays.General;

public class LeadersInArray {
    public static void findLeaders(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0;i--){
            if(arr[i] > max){
                System.out.println(arr[i]);       
            }
            max = Math.max(arr[i], max);
        }
    }
    public static void main(String[] args) {
        int leaders[] = new int[6];
        findLeaders(leaders);
    }
}
