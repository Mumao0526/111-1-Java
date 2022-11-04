public class Test15_operator {
    public static void main(String[] args) {
        float a = 0.0f;     // float的數值要指定用f格式
        float b = 0.8f;

        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;

        if( a == b){        // IEEE 754規範 : float,double 不該判斷是否相等，因為浮點數是近似值，有誤差問題
            System.out.println("a == b");
        }else
            System.out.println("a != b");
    }

}
