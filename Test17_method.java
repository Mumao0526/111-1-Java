import java.lang.System;                    // System在lang的模組內，lang在Java的模組內
public class Test17_method {
    public static void main(String[] args) {
        int a = 8;
        int k = 10;
        a = add(7,5);
        System.out.println("a = "+a);
        System.out.println("add = "+add(6,8));

        // call by value
        System.out.println("k = "+k);
        System.out.println("add1(k) = "+add1(k));
        System.out.println("k = "+k);

        //call by reference
        //....
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int add1(int k){
        return k += 1;
    }
}
