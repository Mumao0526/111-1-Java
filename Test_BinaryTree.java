import com.sun.source.tree.BinaryTree;

// Not yet

public class Test_BinaryTree {
    public static void main(String[] args) {
        int key[] = {20,56,9,45,21,36};
        int[] result  = BuiludBinaryTree(key);
        System.out.println();
        for(int i:result)System.out.print(i+" ");
    }
    static int[] BuiludBinaryTree(int[] key){
        int[] tree = new int[255];

        tree[0] = key[0];

        for(int k = 1; k < key.length; k++) {
            int nodeIndex = 0;
            int flag = 0;

            while (flag != -1 && key[k] >= tree[nodeIndex]) {

                if(tree[2 * nodeIndex + 2] == 0) {
                    tree[2 * nodeIndex + 2] = key[k];
                    flag = -1;
                }
                System.out.println(nodeIndex+" "+tree[2 * nodeIndex + 1]);
                nodeIndex = 2 * nodeIndex + 2;
                   // debug
            }
            while (flag != -1 && key[k] < tree[nodeIndex]){
                if (tree[2 * nodeIndex + 1] == 0){
                    tree[2 * nodeIndex + 1 ] = key[k];
                    flag = -1;
                }
                nodeIndex = 2 * nodeIndex + 1;
                //System.out.println(tree[2 * nodeIndex + 1]);     // debug
            }
        }
        return tree;
    }
}
