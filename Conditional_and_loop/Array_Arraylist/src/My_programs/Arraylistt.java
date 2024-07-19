package My_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(12);
//        list.add(12);
//        list.add(12);
//        list.add(12);
//        list.add(12);
//        list.add(12);
        for(int i = 0; i<5;i++){
            list.add(sc.nextInt());
        }

        for(int i = 0; i<5;i++){
            System.out.print(list.get(i));
        }

        System.out.println(list);

    }
}
