package leetcode1903;

public class Maxnumber_inArray {
    public static void main(String[] args) {
        int[] arr = {1,22,34,56,77,7656};
        System.out.println(maxRange(arr,1,4));
    }


    //maxvalue in the range
    static int maxRange(int[] arr, int start, int end){
        int maxval = arr[start];
        for (int i=start; i <= end; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

    //maxvalue
    static int max(int[] arr){
        int maxval = arr[0];
        for (int i=1; i < arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
