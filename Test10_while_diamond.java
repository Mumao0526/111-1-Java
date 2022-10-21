public class Test10_while_diamond {
    public static void main(String[] args){
        int blank_Target = 4 ;                      //Initial amount of blank
        int star_Target = 0 ;                       //Initial amount of star
        int rows = 0;
        int HowMany = 0;

        while (rows < 9){
            //Print blank
            while (HowMany < blank_Target){          //The number of blanks in this row
                System.out.print(" ");              //Print " " in this row
                HowMany++;
            }
            HowMany = 0;                             //Initial

            //Print star
            while (HowMany <= star_Target){          //The number of star in this row
                System.out.print("*");              //Print "*" in this row
                HowMany++;
            }
            HowMany = 0;                             //Initial

            System.out.println();                   //To newline

            //Print rhombus pyramid
            if(rows < 4) {
                blank_Target--;
                star_Target += 2;
            }else {
                blank_Target++;
                star_Target -= 2;
            }

            rows++;
        }
    }
    public static void printStr(String str){
        System.out.println(str);
    }
}
