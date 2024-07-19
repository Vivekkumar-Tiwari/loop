package leetcode1903;

import java.util.Scanner;

public class Largest_no {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        int n = no.nextInt();
        int ans = num(n);
        System.out.println(ans);
    }
    static int num(int n){
        int count = 0;
        while(count < n){
            int rim = n%10;
            if(rim %2 == 0){
                System.out.print("");
            }
            else if(rim % 2 != 0){
                System.out.print(rim);
            }
            n = n/10;
            count++;
        }
        return n;
    }
}
