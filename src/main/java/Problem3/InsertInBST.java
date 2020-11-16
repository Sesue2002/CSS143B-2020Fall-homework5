package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        // homework
        insertHelp(root, valToInsert);
    }
    private static TreeNode<Integer> insertHelp(TreeNode<Integer> root, int vTI){
        if(root == null){
            root = new TreeNode(vTI);
            return root;
        }
        if(vTI == root.val){
            root.left = insertHelp(root.left, vTI);
        }
        if(vTI < root.val){
            root.left = insertHelp(root.left, vTI);
        }
        else if(vTI > root.val) {
            root.right = insertHelp(root.right, vTI);
        }
        return root;
    }
}
