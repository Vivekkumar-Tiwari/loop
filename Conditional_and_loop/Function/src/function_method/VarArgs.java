package function_method;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(12,34,true,false,true,false);
        fun(1,2,3,4,4,5,6,66,7,7);
        fun("hi","hello","geloo");
    }

    static  void fun(int a, int b, Boolean ...flag){
        System.out.println(a+" "+b+""+flag);
    }
    static void fun(int ...num){
        System.out.println(Arrays.toString(num));
    }
    static void fun(String ...num){
        System.out.println(Arrays.toString(num));
    }

//    static void fun(String ...name) {
//        System.out.println(Arrays.toString(name));
//    }
}
