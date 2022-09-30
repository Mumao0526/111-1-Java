import java.util.Scanner;

public class Judge {
    public static void main(String[] args){
        printStr("Try some judge!");

        //Create input object,by use Scanner class
        Scanner InputSomething = new Scanner(System.in);

        System.out.printf("num1 =");
        String input = InputSomething.nextLine();
        if(ThisStringisInt(input)){
            
            int num = Integer.parseInt(input);
            
            //-----First try-----
            /*
            if(num >= 60){
                printStr("Good!");
                if(num >= 70){
                    printStr("Very good!");
                }
            }else{
                printStr("So sad");
            }
            */
            
            //-----Second try-----
            /*This "else" belong "if(num >= 70)"*/
            /*REMENBER TO DONT OMIT {} */
            if(num >= 60)
                if(num >= 70)
                    printStr("Very good!");                
            else
                printStr("So sad");
            
            
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