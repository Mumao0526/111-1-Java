import java.util.Scanner;

public class Test2_Adder {
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
        System.out.printf("num2 =");
        String input2 = InputSomething.nextLine();
        if(ThisStringisInt(input) && ThisStringisInt(input2)){
            int num1 = Integer.parseInt(input);
            int num2 = Integer.parseInt(input2);
            int sum = num1 + num2;
            System.out.printf("The sum is:%d",sum);
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
