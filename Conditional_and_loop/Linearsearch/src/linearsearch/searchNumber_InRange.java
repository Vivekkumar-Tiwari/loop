package linearsearch;

public class searchNumber_InRange {
    public static void main(String[] args) {
    int []arr = {1,2,3,4,5,6,7,8,9,90};
    int targeet = 3;
        System.out.println(search(arr,targeet,0,5));
    }
    static int search(int arr[], int target, int start, int end){

            if(arr.length == 0){
                return -1;
            }
                for(int i = start; i<end; i++){
                    int element = arr[i];
                    if(element == target){
                        return i;
                    }
                }
            return -1;
    }
}
