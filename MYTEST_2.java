import java.util.Scanner;
public class MYTEST_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an odd number:");
        int row = input.nextInt();
        if(row%2 != 1){
            System.out.println("Not odd number!");
            return;
        }

        int column = row + 2;

        for(int i = 0; i < row; i++){

            /* Decide where "0" are */
            int a = i - (column-1)/2;
            if(i >= (row-1)/2){
                a = (-i) + (row-1)/2-1;
            }

            for (int j = a; j < a+column ; j++){
                if(i<=(row-1)/2 && j >= 0 && j<= 2*i){      // if on "0",print " " 2*i times
                    System.out.print(" ");
                } else if (i>(row-1)/2 && j >= 0  && j<= 2*(row-1-i)) {     // if on "0",print " " 2*(row-1-i) times
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();   // go to next row
        }
    }
}
