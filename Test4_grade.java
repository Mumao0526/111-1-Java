import java.util.Scanner;

public class Test4_grade {
    public static void main(String[] args){
        printStr("Grade!");

        //Create input object,by use Scanner class
        Scanner InputSomething = new Scanner(System.in);

        System.out.printf("num1 =");
        String input = InputSomething.nextLine();
        int num1 = Integer.parseInt(input);

        while (num1<101) {
            if (ThisStringisInt(input)) {
                if(num1 >= 90 && num1 <= 100){
                    printStr("A");
                }else if(num1 >= 80 && num1 <= 89){
                    printStr("B");
                }else if(num1 >= 70 && num1 <= 79){
                    printStr("C");
                }else if(num1 >= 60 && num1 <= 69){
                    printStr("D");
                }else if(num1 < 60){
                    printStr("E");
                }
            } else {
                System.out.println("Fuck!Key in numbers,ok?");
            }
            System.out.printf("num1 =");
            input = InputSomething.nextLine();
            num1 = Integer.parseInt(input);
        }

    }

    // Copy from https://stackabuse.com/java-check-if-string-is-a-number/
    public static boolean ThisStringisInt(String str){
        try {
            int intValue = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void printStr(String str){
        System.out.println(str);
    }
}
