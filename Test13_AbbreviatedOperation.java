public class Test13_AbbreviatedOperation {
    public static void main(String[] args) {
        //++ or --
        int counter = 0;
        System.out.println(counter);

        counter += 1;
        System.out.println(counter);

        ++counter;                          //前置+
        System.out.println(counter);
        counter++;                          //後置+
        System.out.println(counter);

        System.out.printf("++counter %d\n",++counter);      //因同時執行多種功能(此處為印出與運算)，故先運算再印
        System.out.printf("counter++ %d\n",counter++);      //因同時執行多種功能(此處為印出與運算)，故先印再運算

        for (int i = 0; i <3; i++) {
            System.out.printf("for++ %d \n", i);
        }
        for (int i = 0; i <3; ++i){
            System.out.printf("++for %d \n",i);
        }
    }
}
