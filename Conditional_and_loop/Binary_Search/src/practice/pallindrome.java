package practice;

public class pallindrome {
    public static void main(String[] args) {
        int arr[] = {111, 222, 333, 444, 555};
        palinArray(arr);
    }
     static boolean palinArray(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            int rim = arr[i]%10;
            arr[i] = arr[i]/10;

            sum = (sum * 10) + rim;

            if(sum != arr[i]){
                return false;
            }
        }
        return true;
    }
}
