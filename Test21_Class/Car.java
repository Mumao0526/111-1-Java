package Test21_Class;

public class Car {
    private int wheel_1;    // Private: In other class,it can't read and write
    protected int wheel_2;  // Protected: only parent class and child class can use
    public int wheel_3;     // Public: Can be used and written by anyone who call it.
    public int wheel_4;
    boolean launch(int key){
        if (key == 7)
            return true;
        else
            return false;
    }

    static void print(String a){
        System.out.println(a);
    }
}
