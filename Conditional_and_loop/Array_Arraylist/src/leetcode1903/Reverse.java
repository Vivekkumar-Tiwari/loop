package leetcode1903;

import java.util.Arrays;

import static leetcode1903.Swap.swap;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,4,42,22};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            // swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
