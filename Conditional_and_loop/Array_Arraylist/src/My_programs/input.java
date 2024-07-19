package My_programs;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int arr[] = new int[5];
        //input in array
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int num: arr){
            System.out.print(num);
        }


       // array of object;

        String str[] = new String[5];

        for(int i = 0; i<arr.length; i++){
            str[i] = in.next();
        }
//        System.out.print(Arrays.toString(str));
        for(String con:str){
            System.out.println(con);
        }

    }
}
