package daily_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class swap {
    public static void main(String[] args) {
       swap(2,3);
    }
    static void swap(int a, int b){
         a = 2;
         b = 3;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}

