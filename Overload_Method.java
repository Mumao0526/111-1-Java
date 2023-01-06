public class Overload_Method {
    
    /* 同名方法 或稱 重載函式 */
    /******** 這很常用 ********/
    
    static int setVal(int x){
        return x = 20;
    }
    
    static int setVal(int x,int y){
        return x = 40;
    }
    
    static double setVal(double x){
        return x = 10.56;
    }
    
    public static void main(String[] args) {
        int a = 10;
        double b = 5.0;
        System.out.println("setVal(a)-> " + setVal(a));
        System.out.println("setVal(a,5)-> " + setVal(a,5));
        System.out.println("setVal(b)-> " + setVal(b));
    }
}