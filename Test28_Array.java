import java.util.Scanner;

public class Test28_Array {
    static class Buffer{
        int max,min,sum,count;
        double avg = 0.0;

        void push(int key){ // Not yet
            sum += key;
            count++;
            avg = (double) sum/count;
        }
        void initialize(){
            max = 0;
            min = 0;
            sum = 0;
            count = 0;

            avg = 0;
        }
    }
    public static void main(String[] args) {
        int[] keyArray = {7,5,4,9,8,1,2};

        Scanner input = new Scanner(System.in);     // The class used to key in something.
        System.out.println("Here's a array {7,5,4,9,8,1,2}.");
        System.out.println("What interval is you want?");
        int space = input.nextInt();

        // Avoid out of array space
        if (space == 0 || space > keyArray.length){
            System.out.println("ERROR, out of array space.");
            return;
        }

        Buffer flag = new Buffer();
        for (int i = 0; i < keyArray.length; i += space){
            flag.initialize();
            if (i+space-1 < keyArray.length){   // Avoid out of array space
                for (int j = 0; j < space; j++){
                    flag.push(keyArray[i+j]);
                }
                System.out.println(flag.avg);
            }else {
                for (int k = space; k < keyArray.length; k++) flag.push(keyArray[k]);
                System.out.println(flag.avg);
            }

        }
    }
}
