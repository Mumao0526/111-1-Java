import java.util.Scanner;
import static java.lang.System.exit;

public class Test7_While {
    public static void main(String[] args) {
        printStr("Grade!");

        int grade = 0 ;
        String space = "" ;

        while (grade < 10){
            System.out.println( space + grade);
            grade++;
            space = space + " ";
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