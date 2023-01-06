public class Call_by_value_or_reference {
    public static void main(String[] args) {
        /*
        
         memery
        ________
        |       | <- reference 1    *******************************
        |       | <- reference 2      可想像成寫著參考值的便利貼
        | value |       .             貼在類比成箱子的記憶體上
        |       |       .           *******************************
        |_______|       .
        
        */
        

        
        /*Variable*/
        int x = 10;
        
        setVariable(x);     //複製變數x進去，變數x內存的是"數值"
        System.out.println("Variable: x" + x);
        
        int y = x;      //將變數x的"參考值"存進變數y
        y = 20;
        System.out.println("Variable: x" + x);  //x=10
        System.out.println("Variable: y" + y);  //y=20
        
        
        
        /*Array*/
        int[] arr = {1,2,3,4,5};
        setArray(arr);      /*
                              複製變數arr進去，因arr是陣列類別的變數，
                              變數arr內存的是"參考值(位址)"
                            */
        System.out.println("Array: arr[0]" + arr[0]);
        
        int[] ar = arr; //將變數arr的"參考值"存進變數ar
        ar[1] = 20;     //修改變數ar參考的變數arr參考的陣列類別數值
        System.out.println("Array: arr[1]" + arr[1]);   //arr[1]=20
        System.out.println("Array: ar[1]" + ar[1]); //ar[1]=20
    }
    
    static void setVariable(int q){
        q = 20;
    }
    
    static void setArray(int[] a){
        a[0] = 20;
    }
}