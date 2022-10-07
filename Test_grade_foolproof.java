import java.util.Scanner;
import static java.lang.System.exit;

public class Test_grade_foolproof {
    public static void main(String[] args){
        printStr("Grade!");

        //Create input object,by use Scanner class
        Scanner InputSomething = new Scanner(System.in);

        System.out.printf("num1 =");
        String input = InputSomething.nextLine();

        if (ThisStringisInt(input)) { //If is int
            int num1 = Integer.parseInt(input);
            while (num1!=404) { //Jump out code
                if(num1 < 101 && num1>=0) {    //If num1 in 0~100
                    switch (num1 / 10) {
                        case 10:
                            printStr("A");
                            break;
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
                    System.out.printf("num1 =");
                    input = InputSomething.nextLine();
                    num1 = Integer.parseInt(input);
                }else {
                    printStr("Out of 100,bye bye");
                    exit(1);
                }
            }
        } else {
            System.out.println("Get out!Key in numbers,ok?");
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
