public class Test8_While_star {
    public static void main(String[] args){
        String star = "*";
        int row = 0;
        boolean state = false ;

        /* While method */
        while(row < 9){ // Run 9 times in all
            if(star.length() == 5){  //Is time to reverse
                state = true ;
            }
            if(!state){ // Print more and more stars
                printStr(star);
                star += "*";
            }else {  // Print gradually decreasing stars
                printStr(star) ;
                if(star.length() == 0) return;  //Avoid String.substring ERROR
                star = star.substring(0,star.length()-1);
            }
            row ++; //Important to avoid the While method unstop
        }

        /* For method */
        String StarsArray[] = {"*","**","***","****","*****"};
        int i = 0;
        for(int rows = 0 ; rows < 9 ; rows++){
            if (rows < 5){
                printStr(StarsArray[rows]);
            }else {
                printStr(StarsArray[rows - (i+=2)]);
            }
        }
        /*
        //For method
        for(int row = 0 ; row < 5 ; row++){
            printStr(star);
            star += "*";
        }

         */
    }
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
