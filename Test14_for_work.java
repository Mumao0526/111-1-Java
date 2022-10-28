import javax.management.StringValueExp;
import java.util.Arrays;
public class Test14_for_work {
    public static void main(String[] args) {
        /*

        //Restriction: Only 2 [FOR] can be used
        for(int row = 1; row <= 6; row++){                          // 6 rows
            for(int column = 1, k = 1; column <= 6 ; column++){     // 6 columns
                if(column <= 6-row){                                // The quantity of stars
                    System.out.print("*");
                }else {                                             // The remaining part of columns prints the sequence
                    System.out.print(k++);                          // PS. k++ = row + column - 6
                }
            }
            System.out.println();                                   // Move the cursor to the next line
        }

         */

        // The same
        for(int i = 0; i <= 5; i++){                                // Create number sequence array to this
            for(int j = i-4 ; j <= i+1 ; j++){                      // -4 -3 -2 -1 0 1
                if(j <= 0){                                         // -3 -2 -1  0 1 2
                    System.out.print("*");                          // -2 -1  0  1 2 3
                }else {                                             // -1  0  1  2 3 4
                    System.out.print(j);                            //  0  1  2  3 4 5
                }                                                   //
            }                                                       // if number <= 0, it mean to "*"
            System.out.println();                                   // others still mean number
        }

        // The same
        for(int i = 0; i <= 5; i++){                                //i\j 5 4 3 2 1 0
            for(int j = 5 ; j >= 0 ; j--){                          // 0  * * * * * 1
                if(j > i){                                          // 1  * * * * 1 2
                    System.out.print("*");                          // 2  * * * 1 2 3
                }else {                                             // 3  * * 1 2 3 4
                    System.out.print((i-j)+1);                      // 4  * 1 2 3 4 5
                }                                                   // 5  1 2 3 4 5 6
            }
            System.out.println();
        }




        /*

        // The same
        String[][] buff = {{"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},};
        for (int i = 0; i <= 5; i++){
            for (int k = 0; k <= 5; k++){
                if (i+k < 5){
                    buff[i][k] = "*";
                }else{
                    buff[i][k] = String.valueOf(i+k-4);
                }
                System.out.print(buff[i][k]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(buff));              // test

         */
    }
}
