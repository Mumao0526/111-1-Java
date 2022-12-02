public class Test19_DiamondStars {
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
        int width = 0;  // " " width per row

        for(int i = -4; i <= 4; i++){
            for(int k = -5; k <= 5; k++){
                if(Math.abs(k) > width) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            if(i < 0){
                width++;
            }else {
                width--;
            }
        }

         */



        /*
        Think about:
            Symmetrical -> Find center,and set to 0

        column   -3 -2 -1  0  1  2  3
        row       _  _  _  _  _  _  _
              -2| 5  4  3  2  3  4  5
              -1| 4  3  2  1  2  3  4
               0| 3  2  1  0  1  2  3
               1| 4  3  2  1  2  3  4
               2| 5  4  3  2  3  4  5
         */
        int rows = 9;
        int column = 13;

        int RowsPar = rows/2;
        int ColumnPar = column/2;
        for(int i = -RowsPar; i <= RowsPar; i++){
            for(int k = -ColumnPar; k <= ColumnPar; k++){
                if(Math.abs(k) > RowsPar - Math.abs(i)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
