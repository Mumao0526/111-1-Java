public class Test25_ArrayInverse {
    public static void main(String[] args) {
        int[] arr1 = {7,5,4,8,1,2};
        int[] arr2 = Invert_XOR(arr1);
        PrintIntArray(arr2);
    }
    static int[] Invert(int[] arr1){
        int[] anser = new int[arr1.length];
        for(int i = 0;i < arr1.length; i++){
            anser[i] = arr1[arr1.length-1-i];
        }
        return anser;
    }
    static int[] Invert_XOR(int[] arr1){
        for(int i = 0;i < arr1.length/2; i++){
            arr1[i] = arr1[i] ^ arr1[arr1.length-1-i];
            arr1[arr1.length-1-i] = arr1[i] ^ arr1[arr1.length-1-i];
            arr1[i] = arr1[i] ^ arr1[arr1.length-1-i];
        }
        return arr1;
    }
    static void PrintIntArray(int[] arr){
        for (int i:arr)System.out.print(i+" ");
    }
}
