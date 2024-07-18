package function_method;

public class Block_scop {
    public static void main(String[] args) {
        int a = 40;
        a = 345;
        ++a;
        System.out.println(a);
        {
            a = 34;
            System.out.println(a);
        }
        int fj = 87;
        {
            int b = 287;
            System.out.println(b);
        }
        int b = 398;
        System.out.println(b);
    }
}
