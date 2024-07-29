package practice;

import java.util.Scanner;

public class prime_100 {
    // first by for loop in O(log n) time
    public static void main(String[] args) {
//        for(int i=1; i<=100;i++){
//            int count = 0;
//            for(int j = 1;j<=i;j++){
//                if(i%j==0){
//                    count++;
//                }
//            }
//            if(count==2){
//                System.out.println(i);
//            }
//        }

        //optimize code of find prime no;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       int ans = checkprime(n);
//        System.out.println(ans);
//
//    }
//    static int checkprime(int n){
//        if(n<=1){
//            return 0;
//        }
//        if(n==2){
//            return 1;
//        }
//        if(n%2==0){
//            return 0;
//        }
//        for(int i = 3; i*i<=n;i = i + 2){
//            if(n%i==0){
//                return 0;
//            }
//        }
//        return 1;
//    }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("This is Prime Number:");
        }
        else {
            System.out.println("This is Not Prime Number:");
        }

    }
}