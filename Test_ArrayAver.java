import java.security.SecureRandom;

public class Test_ArrayAver {
    public static void main(String[] args) {
        int range = 3;
        int step = 2;

        int[] Arr = new int[10];
        int[] result = new int[10];
        int resultIndex = 0;
        SecureRandom sr = new SecureRandom();
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sr.nextInt(100);
        }
        for (int i:Arr)System.out.println("Arr:"+i);



        for (int i = 0 ; i < Arr.length ; i += step){
            int sum = 0;
            for (int j = 0 ; j < range ; j++){
                if (i+range <= Arr.length)
                    sum += Arr[i+j];
            }
            result[resultIndex++] = sum/range;
        }

        for (int i:result)System.out.println("result:"+i);
    }

}
