package leetcode1903;

import java.util.Scanner;

public class SUm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sum(n);
    }
    static void sum(int n){
        for(int i = 1; i<=n; i++) {
            int sum = i + n;
           System.out.println(sum);
        }
    }
}
