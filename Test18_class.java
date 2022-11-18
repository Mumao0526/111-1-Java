public class Test18_class {
    public static void main(String[] args) {
        int resp = add(3,4);
        System.out.println(resp);

        Test1 res = new Test1();
        System.out.println(res.add(5,7));
    }
    static int add(int a, int b){
        return a+b;
    }
}
class Test1{
    int add(int a, int b){
        return a+b;
    }
}
