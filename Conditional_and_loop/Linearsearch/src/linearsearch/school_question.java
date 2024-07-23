package linearsearch;

import java.util.Arrays;

public class school_question {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {

        int ans = -1;
        int anse = -1;
        for(int i = 0; i < arr.length - 1; i++){
            if(key == arr[i]){
                ans = i;
                break;
            }
        }

        for(int j=arr.length-1; j>=0; j--){
            if(key == arr[j]){
                anse = j;
                break;
            }
        }

        return new int[]{ans,anse};

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5};
        int key = 5;
        System.out.println(Arrays.toString(findIndex(arr,key)));
    }
    }

