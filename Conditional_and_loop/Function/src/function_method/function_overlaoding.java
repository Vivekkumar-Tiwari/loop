package function_method;

public class function_overlaoding {
    public static void main(String[] args) {
//    main1(76);
//    main1("hello");
       int ans = sum(2,3,7);
        System.out.print(ans);
    }
    static void main1(int a){
        System.out.println(a);
    }
    static  void main1(String  name){
        System.out.println(name);
    }

    static int sum(int a,int b, int c){
        System.out.println("This is sum of 3 num: ");
        return a+b+c;
    }
    static int sum(int a,int b){
        System.out.println("This is sum of 2 num: ");
        return a+b;
    }
}
