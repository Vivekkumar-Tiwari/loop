import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        swapnum(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swapnum(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    //swap two num
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}