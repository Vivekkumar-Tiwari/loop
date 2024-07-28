
public class Main {
    public static void main(String[] args) {
    int arr[] = {-1,-2,-3,5,6,7,89,90,99,100,123,127,200};
    int target = 89;
    int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // return -1 when target is not found
    }
}