package function_method;

import java.util.Scanner;

public class swap_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swapp(num1,num2);
    }
    static void swapp(int a, int b){
        int tem = a;
        a = b;
        b = tem;
        System.out.println(a +" " + b);
    }
}
