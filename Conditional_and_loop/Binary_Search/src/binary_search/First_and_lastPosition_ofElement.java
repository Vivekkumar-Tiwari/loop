package binary_search;

public class First_and_lastPosition_ofElement {
    public static void main(String[] args) {
    int []arr = {1,2,3,4,5,6,6,6,7,8,9};
    int target = 6;
    int []anss = searchrange(arr,target);
        System.out.println(anss);
    }
    public static int[] searchrange(int[] nums, int target){

        int ans[] = {-1,-1};
        //check for firstoccuance of target first.
        int start = search(nums, target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this funtion just return the index value of target
   static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
