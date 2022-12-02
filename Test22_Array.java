public class Test22_Array {
    public static void main(String[] args) {
        int[] iArr = new int[4];
        int[] iArr2 = {10,20,30,40};

        for(int i = 0; i<4; i++){
            iArr[i] = i;
            System.out.print(" " + iArr[i]);
        }
        for(int i = 0; i<4; i++){
            System.out.println(">>" + iArr2[i]);
        }


        // Bubble Sort
        int[] iArr3 = {15,55,6,85,9,16,54,8};

        for(int j = 0; j < iArr3.length; j++) {
            for (int i = 0; i < iArr3.length - j - 1; i++) {
                if (iArr3[i] > iArr3[i + 1]) {
                    int buffer = iArr3[i];
                    iArr3[i] = iArr3[i + 1];
                    iArr3[i + 1] = buffer;
                }
            }
        }
        for (int j : iArr3) System.out.println(j);
    }
}
