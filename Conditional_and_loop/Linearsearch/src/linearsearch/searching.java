package linearsearch;

import java.util.Arrays;

public class searching {
    public static void main(String[] args) {
        int container[] = {1,2,3,223,5435,46,324,53};
        int target = 987;
        int ans = linearsearch(container,target);
        System.out.println(ans);
    }

    //return true or false if value is find or not;
//    static Boolean linearsearch3(int arr[], int target) {
//        if (arr.length == 0) {
//            return false;
//        }
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return true;
//            }
//        }
//        //if element not found in array , then return -1
//        return false;
//    }
//}

//    //return the element that you find
    static int linearsearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
       for(int element:arr){
           
           if(element == target){
               return element;
           }
       }
        //if element not found in array , then return -1
        return -1;
    }
}

    //return the index of found element;
//    static int linearsearch(int arr[], int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        //if element not found in array , then return -1
//        return -1;
//    }
//}
