package Test21_Class;

public class Test21_Class {
    public static void main(String[] args) {

        // 宣告一個Car類別，其名稱為myCar
        Car myCar;
        // 實體化成物件
        myCar = new Car();
        // 使用物件內的方法
        myCar.launch(7);

        // 簡化，宣告並實體化
        Car yourCar = new Car();
        System.out.println("launch? " + yourCar.launch(7));

        // 陣列
        Car[] herCar = new Car[20];      // 創建一個Car類別的herCar陣列，並指定5個Car類別需要的記憶體空間給herCar陣列
        for(int i=0; i<5; i++){
            herCar[i] = new Car();      // 這裡才實體化類別內容
            //herCar[i].wheel_1 = i;    // Error
            herCar[i].wheel_2 = i+1;
            herCar[i].wheel_3 = i+2;
            herCar[i].wheel_4 = i+3;
            boolean z = herCar[i].launch(7);
            System.out.println(z);
        }

        /*
            與main()同個class的類別(可理解為副程式)必須宣告成靜態
            且靜態的類別不需要用new來實體化，可直接使用
         */
        add(88);    // 內部類別
        Car.print("51951648");  // 外部類別
    }
    static void add(int i){
        System.out.println("==>"+i);
    }
}
