package linearsearch;

import java.util.Arrays;

public class minimum_value {
    public static void main(String[] args) {
    int []arr = {1,2,3,4,-89,6,7};
        System.out.println(linerasearch(arr));
        System.out.println(linerasearch2(arr));
    }
    static int linerasearch(int min[]){
        int ans = min[0];
        for(int i = 1; i< min.length; i++){
            if(min[i] < ans){
                ans = min[i];
            }
        }
        return ans;
    }

    static int linerasearch2(int max[]){
        int ans = max[0];
        for(int i = 1; i< max.length; i++){
            if(max[i] > ans){
                ans = max[i];
            }
        }
        return ans;
    }
}
