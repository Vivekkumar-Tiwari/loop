package function_method;

public class parameters {
    public static void main(String[] args) {
    String ans = name("Vivek ");
        System.out.println(ans);
    }
    static String name(String name1){
        String message = "hello " + name1;
        return message;
    }
}
