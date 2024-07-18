package function_method;

public class Shaodwing {
    static int x = 90;//this is shadowing, it hide in second print statement.
    public static void main(String[] args) {
        System.out.println(x);
        int x = 9;
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
