import java.util.Scanner;

public class Test_grade {
    public static void main(String[] args){
        printStr("This's an adder!");

        //Create input object,by use Scanner class
        Scanner InputSomething = new Scanner(System.in);

        /* This code is not good */
        /*
        System.out.printf("num1 =");
        int num1 = InputSomething.nextInt();
        System.out.printf("num2 =");
        int num2 = InputSomething.nextInt();
        int sum = num1 + num2;
        System.out.printf("The sum = %d",sum);
        */

        System.out.printf("num1 =");
        String input = InputSomething.nextLine();
        if(ThisStringisInt(input)){
            int num1 = Integer.parseInt(input);
            if(num1>=90 && num1>=100){
                printStr("A");
            }else if(num1>=80 && num1>=89){
                printStr("B");
            }else if(num1>=70 && num1>=79){
                printStr("C");
            }else if(num1>=60 && num1>=69){
                printStr("D");
            }else{
                printStr("E");
            }

        }else {
            System.out.println("Fuck!Key in numbers,ok?");
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