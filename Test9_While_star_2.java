public class Test9_While_star_2 {
    public static void main(String[] args){
        /* ***** By myself ***** */
        String buffer = "";
        int Star_count = 0;
        int blank_count = 0;
        int row = 0;

        while (row < 5){
            while (blank_count <= 3-row){           // Push blank to buffer
                buffer += " ";
                blank_count++;
            }
            blank_count = 0;                        // Reset

            while(Star_count <= (row*2)){           // Push star to buffer
                buffer += "*";
                Star_count++;
            }
            Star_count = 0;                         // Reset

            printStr(buffer);                       // Print buffer
            buffer = "";                            // Reset
            row++;
        }

        /* ***** In class ***** */
        /* ***** Modular ***** */
        String blank = " ";
        int blank_Target = 4 ;
        String Star = "*";
        int rows = 0;

        while (rows < 5){

            int b = blank_Target - rows;
            while (b > 0){                      // Print gradually decreasing blank
                System.out.print(blank);
                b--;
            }

            System.out.println(Star);
            Star = Star + "**";

            rows++;
        }
    }
    public static void printStr(String str){
        System.out.println(str);
    }
}
