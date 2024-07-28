package binary_search;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1,0};
        int target = 0;
        int ans = orderagnosticBs(arr,target);
        System.out.println(ans);
    }
    static int orderagnosticBs(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;

        //check if array is shorted in ascen or descen oreder.
        boolean ascen = arr[start] < arr[end];

        while(start <= end){
            //find middle element
        int mid = start + (end - start)/2;// for don't exeed the int data type;

        if(arr[mid] == target){//this is common operation in both, ascen and desen order.
            return mid;
        }
        if(ascen) {
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
        }
    }
            return -1;
}
}
