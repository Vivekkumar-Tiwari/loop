package linearsearch;

import java.util.Arrays;

public class Search_string {
    public static void main(String[] args) {
        String name = "vivekkumar tiwari";
        char target = ' ';
//        Boolean ans = seach2(name,target);
//        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static Boolean seach2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
//    static Boolean seach1(String str, char target){
//        if(str.length() == 0){
//            return false;
//        }
//        for(int i = 0; i < str.length();i++){
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
}
