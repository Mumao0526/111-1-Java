
public class Test_BinaryTree {
    public static void main(String[] args) {
        int[] key = {20,21,22,23,24};
        int[] nullArray_1 = new int[0];
        int[] nullArray_2 = null;

        int[] result  = BuiludBinaryTreeByArray(nullArray_2);
        for(int i:result)System.out.print(i+" ");

    }

    // 存成陣列形式的二元樹
    static int[] BuiludBinaryTreeByArray(int[] key){
        // Alarm, if no input
        int[] errNumber = {-1};
        if (key == null || key.length == 0) {
            System.out.println("Builud binary tree fail.");
            return errNumber;
        }

        int[] tree = new int[(int)Math.pow(2,key.length)-1];        // 避免出現右or左斜樹造成陣列空間不足

        tree[0] = key[0];       // 第一個輸入的值必為樹根

        for(int k = 1; k < key.length; k++) {   // 歷遍所有輸入值
            int nodeIndex = 0;  // 從樹根開始判斷

            // NOTE: if/else if內的判斷式不可對調
            while (true) {
                if(key[k] >= tree[nodeIndex] && tree[2 * nodeIndex + 2] == 0) {      // 若右子節點為空
                    tree[2 * nodeIndex + 2] = key[k];
                    break;      // 已存好當前的input值，後續不須再做
                }else if (key[k] >= tree[nodeIndex]){
                    nodeIndex = 2 * nodeIndex + 2;      // 設定下一輪要比較的節點
                }

                if (key[k] < tree[nodeIndex] && tree[2 * nodeIndex + 1] == 0){      // 若左子節點為空
                    tree[2 * nodeIndex + 1 ] = key[k];
                    break;      // 已存好當前的input值，後續不須再做
                }else if (key[k] < tree[nodeIndex]){
                    nodeIndex = 2 * nodeIndex + 1;      // 設定下一輪要比較的節點
                }
            }
        }
        return tree;
    }
}
