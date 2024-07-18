package function_method;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(Armstrong(n));
        for(int i = 100; i<=1000; i++){
            if(Armstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static Boolean Armstrong(int n){
        int original =  n;
        int sum = 0;

        while (n>0){
            int rim = n%10;
            n = n/10;
            sum = sum + rim * rim * rim;
        }
        return sum == original;
    }
}
