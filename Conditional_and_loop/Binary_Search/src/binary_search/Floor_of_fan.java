package binary_search;

public class Floor_of_fan {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int tar = 1;
        int ans = floorFanNum(arr,tar);
        System.out.println(ans);
    }
    static int floorFanNum(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
//        if(target < arr[arr.length-1]){
//            return -1;
//        }
        while(start<=end){
            int mid = (start + end)/2;
            if(target >= arr[mid]) {
                start = mid + 1;
            }
            else if(target <= arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return arr[end];
       }
    }

