import javax.swing.tree.TreeNode;

public class Test_BinaryTree {
    static class TreeNode {
        int key1;
        int key2;
        TreeNode leftchild, rightchild;

        TreeNode(int key) {
            this.key1 = key;
            leftchild = null;
            rightchild = null;
        }
        TreeNode(int key1,int key2) {
            this.key1 = key1;
            this.key2 = key2;
            leftchild = null;
            rightchild = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(25);
        TreeNode NodeA = new TreeNode(20);
        TreeNode NodeB = new TreeNode(30);
        TreeNode NodeC = new TreeNode(10);

        root.leftchild = NodeA;
        root.rightchild = NodeB;
        root.leftchild.leftchild = NodeC;


        int[] data = {20,50,12,6,54,21,66,70};

        /*
        int[] key = {20,21,22,23,24};
        int[] nullArray_1 = new int[0];
        int[] nullArray_2 = null;

        int[] result  = BuiludBinaryTreeByArray(key);
        for(int i:result)System.out.print(i+" ");

        System.out.println();

        int[] result2 = InsertValue(result,25);
        for(int i:result2)System.out.print(i+" ");

         */


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


    static int[] InsertValue(int[] tree,int key){
        // Alarm, if no input
        int[] errNumber = {-1};
        if (tree == null || tree.length == 0) {
            System.out.println("No binary tree.");
            return errNumber;
        }

        // 若樹根為空，key值即為樹根
        if (tree[0] == 0){
            tree[0] = key;
            return tree;
        }

        // 避免出現右or左斜樹造成陣列空間不足
        int number = (int)(Math.log(tree.length+1) / Math.log(2));
        int[] result = new int[(int)Math.pow(2,number + 1) - 1];
        for (int i = 0 ; i < tree.length ; i++){
            result[i] = tree[i];
        }


        int nodeIndex = 0;

        while (true) {
            if(key >= result[nodeIndex] && result[2 * nodeIndex + 2] == 0) {      // 若右子節點為空
                result[2 * nodeIndex + 2] = key;
                break;      // 已存好當前的input值，後續不須再做
            }else if (key >= result[nodeIndex]){
                nodeIndex = 2 * nodeIndex + 2;      // 設定下一輪要比較的節點
            }

            if (key < result[nodeIndex] && result[2 * nodeIndex + 1] == 0){      // 若左子節點為空
                result[2 * nodeIndex + 1 ] = key;
                break;      // 已存好當前的input值，後續不須再做
            }else if (key < result[nodeIndex]){
                nodeIndex = 2 * nodeIndex + 1;      // 設定下一輪要比較的節點
            }
        }
        return result;
    }
}