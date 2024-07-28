package practice;

public class Fac {
    static int fac = 1;
    public static void main(String[] args) {
        int N = 5;
        int answer = isFactorial(N);
        System.out.println(answer);
    }
    static int isFactorial(int N) {
        //code here
        boolean ans = faco(N);
        if(ans){
            return 1;
        }
        return 0;
    }
   static boolean faco(int N){
         int fac = 1;
        for(int i = N;i>=1;i++){
            fac = fac * i;
        }
        return true;
    }
}