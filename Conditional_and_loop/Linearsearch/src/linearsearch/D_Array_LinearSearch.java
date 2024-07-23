package linearsearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class D_Array_LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {34,56}
        };
        System.out.println(max1(arr));
    }

     static int max1(int[][] arr) {
        int max = Integer.MAX_VALUE;
        for(int row = 0; row<=arr.length; row++){
            for(int col = 0; col<=arr[row].length;col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}
