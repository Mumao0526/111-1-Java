import java.util.Scanner;

public class Test27_ArraySearch {
    // Record input state
    static class Flag{
        int[] state;
        int max = 0;
        int min = 65535;
        int min_index = 0;
        int count = 1;
        Flag(int[] key){
            state = new int[key.length];
        }
    }
    public static void main(String[] args) {
        int med = 0;
        int[] keyArray = {7,5,4,9,8,1,2};
        Flag flag = new Flag(keyArray);

        Scanner input = new Scanner(System.in);
        System.out.println("Here's a array {7,5,4,9,8,1,2}.");
        System.out.println("What N-th minimum that you want to find?");
        int index = input.nextInt();

        // Avoid out of array space
        if (index == 0 || index > keyArray.length){
            System.out.println("ERROR, out of array space.");
            return;
        }

        // Don't use sort
        for (int i = 0; i < index; i++) {
            flag.min = 65535;
            flag.min_index = 0;

            // Find the minimum and record this index.
            for (int j = 0; j < keyArray.length; j++) {
                if (keyArray[j] < flag.min && flag.state[j] == 0) {
                    flag.min = keyArray[j];
                    flag.min_index = j;
                }
            }

            flag.state[flag.min_index] = flag.count;    // Change flag state to avoid to find the same minimum again.
            flag.count++;
            med = keyArray[flag.min_index];
        }

        System.out.println(index + "-th minimum:" + med);
    }
}
