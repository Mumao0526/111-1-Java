public class Sum {
    public static void main(String[] args) {
        /*CMD執行時可帶入多個引數*/
        int total = 0;
        
        for(String str : args){    
            total += Integer.parseInt(str);     //引數args為String類別，要轉換一下
            System.out.println("args[]-> " + str);
        }
        System.out.println("total = " + total);
    }
}