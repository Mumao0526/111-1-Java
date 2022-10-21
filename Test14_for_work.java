public class Test14_for_work {
    public static void main(String[] args) {
        //Restriction: Only 2 [FOR] can be used
        for(int row = 1; row <= 6; row++){                          // 6 rows
            for(int column = 1, k = 1; column <= 6 ; column++){     // 6 columns
                if(column <= 6-row){                                // the quantity of stars
                    System.out.print("*");
                }else {                                             // The remaining part of columns prints the sequence
                    System.out.print(k++);
                }
            }
            System.out.println();                                   // Move the cursor to the next line
        }
    }
}
