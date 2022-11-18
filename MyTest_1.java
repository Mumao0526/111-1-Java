public class MyTest_1 {
    public static void main(String[] args) {
        /*
         ***** *****
         ****   ****
         ***     ***
         **       **
         *         *
         **       **
         ***     ***
         ****   ****
         ***** *****
         */




        /*
        for(int i = 0; i < 9; i++){
            for (int j = -5 + i;j < 6 + i;j++){ //11=a-(-5+i)
                if(i<=4 && j >= 0 && j<= 2*i){
                    System.out.print(" ");
                } else if (i>4 && j >= 0 + 2*(i-4) && j<= 2*(i-4) + 2*(8-i)) { // 5=1+6 6=1+4 7=1+2 8=1+0
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

         */


        for(int i = 0; i < 9; i++){     // 9 rows
            /* Decide where "0" are */
            int a = i -5;
            if(i>=4){
                a = (-i) +3;
            }

            for (int j = a; j < a+11 ; j++){    // 11 columns
                if(i<=4 && j >= 0 && j<= 2*i){      // if on "0",print " " 2*i times
                    System.out.print(" ");
                } else if (i>4 && j >= 0  && j<= 2*(8-i)) {     // if on "0",print " " 2*(8-i) times
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();   // go to next row
        }

    }

}
