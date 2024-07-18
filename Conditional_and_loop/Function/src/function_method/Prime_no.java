package function_method;

import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean ans = prime(n);
        System.out.println(ans);
    }
    static Boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c >= n;
    }
}
