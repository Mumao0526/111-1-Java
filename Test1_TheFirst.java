import java.util.Scanner;

public class Test1_TheFirst{
	public static void main(String[] args){
		System.out.println("Initialzation:" + args[0]);
		printStr("This's an adder!");
        
        //Input
        Scanner InputSomething = new Scanner(System.in);
        System.out.printf("num1 =");
        int num1 = InputSomething.nextInt();
        System.out.printf("num2 =");
        int num2 = InputSomething.nextInt();
        int sum = num1 + num2;
        System.out.printf("The sum = %d",sum);
	}
	
	public static void printStr(String str){
		System.out.println(str);
	}
}
