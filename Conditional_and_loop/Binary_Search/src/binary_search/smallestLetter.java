package binary_search;

public class smallestLetter {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int tar = 10;
        int ans = celingno(arr,tar);
        System.out.println(ans);
    }
    static int celingno(int letters[], int target){
        int start = 0;
        int end = letters.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(target >= letters[mid]) {
                start = mid + 1;
            }
            else if(target <= letters[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return letters[start];
    }
}

