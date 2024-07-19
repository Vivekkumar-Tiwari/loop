package leetcode1903;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int index1,int intex2){
        int temp = arr[index1];
        arr[index1] = arr[intex2];
        arr[intex2] = temp;
    }
}
