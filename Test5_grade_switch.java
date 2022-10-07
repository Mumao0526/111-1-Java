import java.util.Scanner;

public class Test5_grade_switch {
    public static void main(String[] args){
        printStr("Grade!");

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
        int num1 = Integer.parseInt(input);

        while (num1<101) {
            if (ThisStringisInt(input)) {
                switch (num1/10){
                    case 9:
                        printStr("A");
                        break;
                    case 8:
                        printStr("B");
                        break;
                    case 7:
                        printStr("C");
                        break;
                    case 6:
                        printStr("D");
                        break;
                    default:
                        printStr("E");
                        break;
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
