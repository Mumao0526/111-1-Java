public class Test26_ArrayOperation {
    public static void main(String[] args) {
        int[] arr1 = {7,5,4,9,8,1,2};
        double arrSum = 0.0;
        double average = 0.0;

        // Sort
        for(int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1.length - j - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    int buffer = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = buffer;
                }
            }
        }

        // Sum
        for(int i:arr1)arrSum+=i;

        average = arrSum/arr1.length;

        for(int i:arr1)System.out.print(i+" ");
        System.out.print("\nMax= " + arr1[arr1.length-1] + "\tMin= " + arr1[0] +
                         "\tMid=" + arr1[arr1.length/2] + "\tAverage=" + average);
    }
}
