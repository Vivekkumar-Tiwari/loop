package practice;

public class middle {
    public static void main(String[] args) {
        int A = 978;
        int B = 518;
        int C = 300;
        System.out.println(middlee(A,B,C));
    }
   static int middlee(int A, int B, int C) {
       int mid;
       if (B > A && B < C) {
           mid = B;
       } else if (A > B && A < C) {
           mid = A;
       } else if (C > A && C < B) {
           mid = C;
       } else {
           mid = A; //handle the case where A, B, and C are equal
       }
       return mid;
   }
}

